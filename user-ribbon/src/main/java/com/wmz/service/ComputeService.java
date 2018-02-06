package com.wmz.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

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
     *
     * @param a
     * @param b
     * @return
     */
    @HystrixCommand(fallbackMethod = "addServiceFallback")
    public String add(Integer a, Integer b) {
        return restTemplate.getForEntity("http://provider-compute/add?a=" + a + "&b=" + b, String.class).getBody();
    }

    public String addServiceFallback(Integer a, Integer b) {
        return "" + (a + b + 100);
    }

}
