package com.wmz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by wmz on 2018/2/6.
 * 配置客户端
 *
 * @author wmz
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigClient02Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClient02Application.class, args);
    }

}
