package com.wmz.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wmz.common.model.ResultBean;
import com.wmz.common.util.UrlUtils;
import com.wmz.compute.request.ComputeAddReq;
import com.wmz.compute.response.ComputeAddResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import static com.wmz.common.util.CheckUtils.notNull;

/**
 * Created by wmz on 2018/2/5.
 *
 * @author wmz
 */
@Service
public class ComputeService {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 这里利用熔断器,在调用服务失败时调用指定的方法
     * 当provider-compute节点死掉时,会调用熔断器指定的方法
     * 加上熔断器,异常会被吃掉,然后调用fallbackMethod指定的方法
     *
     * @return
     */
    @HystrixCommand(fallbackMethod = "addServiceFallback")
    public ResultBean<Integer> add(ComputeAddReq req) throws Exception {
        ComputeAddResp resp = this.restTemplate.postForObject(UrlUtils.getComputeAddUrl(), req, ComputeAddResp.class);
        notNull(resp.getResult(), "返回结果为空,调用服务异常", resp.getErrorMessage());
        return new ResultBean<>(resp.getResult());
    }

    public ResultBean<Integer> addServiceFallback(ComputeAddReq req) throws Exception {
        return new ResultBean<>(req.getA() + req.getB() + 100);
    }

}
