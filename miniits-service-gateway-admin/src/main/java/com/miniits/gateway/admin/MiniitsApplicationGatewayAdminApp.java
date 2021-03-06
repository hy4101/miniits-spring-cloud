package com.miniits.gateway.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author: wq
 * @Date: 2017/10/5
 * @Time: 14:11
 * <p>
 * Description:
 * ***
 */
//@EnableWebMvc
@ComponentScan
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class MiniitsApplicationGatewayAdminApp {

    public static void main(String[] args) {
        SpringApplication.run(MiniitsApplicationGatewayAdminApp.class, args);
    }
}
