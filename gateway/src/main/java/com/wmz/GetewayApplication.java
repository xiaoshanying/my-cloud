package com.wmz;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * Created by wmz on 2018/2/5.
 * 网关
 *
 * @author wmz
 */
@EnableZuulProxy
@SpringCloudApplication
public class GetewayApplication {

    @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }

    public static void main(String[] args) {
        SpringApplication.run(GetewayApplication.class, args);
    }

}
