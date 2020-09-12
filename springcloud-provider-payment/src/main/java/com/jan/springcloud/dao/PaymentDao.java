package com.jan.springcloud.dao;

import com.jan.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author Jan
 * @version 1.0.0
 * @createTime 2020年09月12日 02:05:00
 */
@Mapper
public interface PaymentDao {


    int insert(Payment payment);

    Payment selectById(@Param("id") Long id);
}
