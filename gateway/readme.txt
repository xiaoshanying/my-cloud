zuul回话保持问题:
通过跟踪一个HTTP请求经过Zuul到具体服务，再到返回结果的全过程。我们很容易就能发现，
在传递的过程中，HTTP请求头信息中的Cookie和Authorization都没有被正确地传递给具体服务，
所以最终导致会话状态没有得到保持的现象

所以解决该问题的思路也很简单，我们只需要通过设置sensitiveHeaders即可，设置方法分为两种：

全局设置：
zuul.sensitive-headers=
指定路由设置：
zuul.routes.<routeName>.sensitive-headers=
zuul.routes.<routeName>.custom-sensitive-headers=true


重定向问题:
在使用Spring Cloud Zuul对接Web网站的时候，处理完了会话控制问题之后。往往我们还会碰到如下图所示的问题，
我们在浏览器中通过Zuul发起了登录请求，该请求会被路由到某WebSite服务，该服务在完成了登录处理之后，
会进行重定向到某个主页或欢迎页面。此时，仔细的开发者会发现，在登录完成之后，我们浏览器中URL的HOST部分发生的改变，
该地址变成了具体WebSite服务的地址了。这就是在这一节，我们将分析和解决的重定向问题！


出现该问题的根源是Spring Cloud Zuul没有正确的处理HTTP请求头信息中的Host导致。在Brixton版本中，
Spring Cloud Zuul的PreDecorationFilter过滤器实现时完全没有考虑这一问题，它更多的定位于REST API的网关。
所以如果要在Brixton版本中增加这一特性就相对较为复杂，不过好在Camden版本之后，Spring Cloud Netflix 1.2.x版本的Zuul增强了该功能，
我们只需要通过配置属性
zuul.add-host-header=true
就能让原本有问题的重定向操作得到正确的处理。关于更多Host头信息的处理，读者可以参考本文之前的分析思路，
可以通过查看PreDecorationFilter过滤器的源码来详细更多实现细节。

zuul统一异常处理:

(1)严格的try catch处理
public Object run() {
	RequestContext context = RequestContext.getCurrentContext();
	this.helper.addIgnoredHeaders();
	try {
		RibbonCommandContext commandContext = buildCommandContext(context);
		ClientHttpResponse response = forward(commandContext);
		setResponse(response);
		return response;
	}
	catch (ZuulException ex) {
		context.set(ERROR_STATUS_CODE, ex.nStatusCode);
		context.set("error.message", ex.errorCause);
		context.set("error.exception", ex);
	}
	catch (Exception ex) {
		context.set("error.status_code", HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
		context.set("error.exception", ex);
	}
	return null;
}
(2)ErrorFilter处理
由于在请求生命周期的pre、route、post三个阶段中有异常抛出的时候都会进入error阶段的处理，所以我们可以通过创建一个error类型的
过滤器来捕获这些异常信息，并根据这些异常信息在请求上下文中注入需要返回给客户端的错误描述，这里我们可以直接沿用在try-catch处理异
常信息时用的那些error参数，这样就可以让这些信息被SendErrorFilter捕获并组织成消息响应返回给客户端。比如，下面的代码就实现了这里
所描述的一个过滤器：

public class ErrorFilter extends ZuulFilter {

    Logger log = LoggerFactory.getLogger(ErrorFilter.class);

    @Override
    public String filterType() {
        return "error";
    }

    @Override
    public int filterOrder() {
        return 10;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        Throwable throwable = ctx.getThrowable();
        log.error("this is a ErrorFilter : {}", throwable.getCause().getMessage());
        ctx.set("error.status_code", HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        ctx.set("error.exception", throwable.getCause());
        return null;
    }

}







