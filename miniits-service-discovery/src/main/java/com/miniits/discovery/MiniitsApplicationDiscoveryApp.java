package com.miniits.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: wq
 * @Date: 2017/10/5
 * @Time: 14:01
 * <p>
 * Description:
 * ***
 */
@EnableEurekaServer
@SpringBootApplication
public class MiniitsApplicationDiscoveryApp {

   public static void main(String[] str){
       SpringApplication.run(MiniitsApplicationDiscoveryApp.class,str);
   }
}
