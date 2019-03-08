package com.example.springcloudclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudClientApplication {
    private static Logger logger = LoggerFactory.getLogger(SpringcloudClientApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudClientApplication.class, args);
        logger.info("eureka客户端启动完成");
    }

}
