package com.jan.springcloud.controller;

import com.jan.springcloud.bean.CommonResult;
import com.jan.springcloud.entity.Payment;
import com.jan.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Jan
 * @version 1.0.0
 * @createTime 2020年09月12日 01:59:00
 */
@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @Resource
    PaymentService paymentService;

    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping("/insert")
    public CommonResult<Payment> insert(@RequestBody Payment payment) {
        int result = paymentService.insert(payment);
        log.info("{}", payment.getId());
        if(result > 0) {
            return new CommonResult(200, "数据库插入成功！serverPort:" + serverPort, result);
        }
        return new CommonResult(400, "数据库插入失败");
    }

    @GetMapping("/selectById/{id}")
    public CommonResult<Payment> selectById(@PathVariable("id") Long id) {
        Payment result = paymentService.selectById(id);
        return new CommonResult(200, "查询成功成功！serverPort:" + serverPort, result);
    }

    @GetMapping(value = "/discovery")
    public Object discovery() {
        List<String> services = discoveryClient.getServices();
        for (String element : services) {
            log.info("element:" + element);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("SPRINGCLOUD-PROVIDER-PAYMENT-SERVICE");
        for (ServiceInstance serviceInstance : instances) {
            log.info(serviceInstance.getServiceId() + serviceInstance.getHost() + serviceInstance.getPort() + serviceInstance.getUri());
        }
        return this.discoveryClient;
    }

}
