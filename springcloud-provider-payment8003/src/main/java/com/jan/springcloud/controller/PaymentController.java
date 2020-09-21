package com.jan.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author Jan
 * @version 1.0.0
 * @createTime 2020年09月22日 03:44:00
 */
@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/zk")
    public String getPaymentZK() {
        return "Springcloud with zookeeper: " + serverPort + "\t" + UUID.randomUUID().toString();
    }
}
