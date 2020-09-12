package com.jan.springcloud.service;

import com.jan.springcloud.entity.Payment;
import com.jan.springcloud.dao.PaymentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Jan
 * @version 1.0.0
 * @createTime 2020年09月12日 02:07:00
 */
@Service
public class PaymentService {

    @Autowired
    PaymentDao paymentDao;


    public int insert(Payment payment) {
        return paymentDao.insert(payment);
    }

    public Payment selectById(Long id) {
        return paymentDao.selectById(id);
    }
}
