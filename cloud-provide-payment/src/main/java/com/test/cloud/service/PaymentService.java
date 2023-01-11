package com.test.cloud.service;


import com.test.cloud.pojo.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
    int create(Payment payment);

    Payment queryById(@Param("id")long id);
}