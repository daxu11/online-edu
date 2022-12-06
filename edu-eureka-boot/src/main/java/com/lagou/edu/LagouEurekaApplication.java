package com.lagou.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author sx
 * @since 2022/12/3 20:18
 **/
@SpringBootApplication
@EnableEurekaServer
public class LagouEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(LagouEurekaApplication.class,args);
    }
}
