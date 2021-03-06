package com.jan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Jan
 * @version 1.0.0
 * @createTime 2020年09月09日 01:05:00
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class PaymentApp {

    public static void main(String[] args) {
        SpringApplication.run(PaymentApp.class);
    }

}
