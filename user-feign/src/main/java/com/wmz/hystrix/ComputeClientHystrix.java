package com.wmz.hystrix;

import com.wmz.service.ComputeClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by wmz on 2018/2/5.
 * 服务调用失败之后的熔断器
 *
 * @author wmz
 */
@Component
public class ComputeClientHystrix implements ComputeClient {

    @Override
    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return a + b + 1000;
    }
}
