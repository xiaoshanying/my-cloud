package com.wmz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by wmz on 2018/2/5.
 *
 * @author wmz
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ProviderCompute02Application {

    public static void main(String[] args) {
        SpringApplication.run(ProviderCompute02Application.class, args);
    }

}
