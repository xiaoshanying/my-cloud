package com.wmz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by wmz on 2018/2/5.
 * 通过feign来实现调用计算服务
 *
 * @author wmz
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableCircuitBreaker
public class UserFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserFeignApplication.class, args);
    }

}
