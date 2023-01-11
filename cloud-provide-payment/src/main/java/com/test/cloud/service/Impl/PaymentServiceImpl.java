package com.test.cloud.service.Impl;


import com.test.cloud.dao.PaymentDao;
import com.test.cloud.service.PaymentService;
import com.test.cloud.pojo.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {


    @Autowired
    PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment queryById(long id) {
        return paymentDao.queryById(id);
    }
}
