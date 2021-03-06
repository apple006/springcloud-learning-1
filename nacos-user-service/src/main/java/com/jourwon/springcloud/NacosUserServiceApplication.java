package com.jourwon.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Description:
 * 
 * @author JourWon
 * @date 2019/12/24 20:39
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosUserServiceApplication.class, args);
    }

}
