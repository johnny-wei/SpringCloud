package com.lychr.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Atuthor:weiyong
 * @Description:
 * @Date:2018/4/17
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigServerApplication {
    public static void main(String[] args){
        SpringApplication.run(ConfigServerApplication.class,args);
    }
}
