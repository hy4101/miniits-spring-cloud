package com.miniits.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author: wq
 * @Date: 2017/10/2
 * @Time: 22:10
 * <p>
 * Description:
 * ***
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class MiniitsApplicationCoreApp {

    public static void main(String[] str) {
        SpringApplication.run(MiniitsApplicationCoreApp.class, str);
    }
}
