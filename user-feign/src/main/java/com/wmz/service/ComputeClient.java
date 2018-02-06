package com.wmz.service;

import com.wmz.hystrix.ComputeClientHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by wmz on 2018/2/5.
 *
 * @author wmz
 */
@FeignClient(value = "provider-compute", fallback = ComputeClientHystrix.class)
public interface ComputeClient {

    /**
     * 相加
     *
     * @param a
     * @param b
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, value = "/add")
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);

}
