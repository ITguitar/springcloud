package com.jan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Jan
 * @version 1.0.0
 * @createTime 2020年09月22日 03:42:00
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication.class);
    }
}
