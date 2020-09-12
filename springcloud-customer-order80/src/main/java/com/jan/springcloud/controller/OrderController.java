package com.jan.springcloud.controller;

import com.jan.springcloud.bean.CommonResult;
import com.jan.springcloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author Jan
 * @version 1.0.0
 * @createTime 2020年09月12日 22:31:00
 */
@RestController
@Slf4j
@RequestMapping("/customer/order")
public class OrderController {

    public static final String PAYMENT_URL = "http://localhost:8001";

    @Resource
    private RestTemplate restTemplate;


    @PostMapping("/insert")
    public CommonResult<Payment> insert(@RequestBody Payment payment){
        return restTemplate.postForObject(PAYMENT_URL + "payment/insert", payment, CommonResult.class);
    }

    @GetMapping("/getPaymentById/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_URL + "payment/selectById/" + id, CommonResult.class);
    }

}
