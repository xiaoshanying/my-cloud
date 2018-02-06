package com.wmz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by wmz on 2018/2/5.
 *
 * @author wmz
 */
@EnableEurekaServer
@SpringBootApplication
public class Eureka01Application {

    public static void main(String[] args) {
        SpringApplication.run(Eureka01Application.class, args);
    }

}
