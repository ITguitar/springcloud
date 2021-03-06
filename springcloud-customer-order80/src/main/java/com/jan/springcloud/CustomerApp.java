package com.jan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Jan
 * @version 1.0.0
 * @createTime 2020年09月12日 22:27:00
 */
@SpringBootApplication
@EnableEurekaClient
public class CustomerApp {

    public static void main(String[] args) {
        SpringApplication.run(CustomerApp.class);
    }

}
