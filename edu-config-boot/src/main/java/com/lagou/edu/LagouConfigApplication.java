package com.lagou.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author sx
 * @since 2022/12/3 20:33
 **/
@SpringBootApplication
@EnableConfigServer
public class LagouConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(LagouConfigApplication.class,args);
    }
}
