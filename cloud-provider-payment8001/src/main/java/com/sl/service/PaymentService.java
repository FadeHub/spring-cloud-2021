package com.sl.service;

import com.sl.entity.Payment;
import com.sl.mapper.PaymentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author shuliangzhao
 * @Title: PaymentService
 * @ProjectName spring-cloud-2021
 * @Description: TODO
 * @date 2021/6/4 22:35
 */
@Service
public class PaymentService {

    @Autowired
    private PaymentMapper paymentMapper;

    public int create(Payment payment) {
        return paymentMapper.create(payment);
    }

    public Payment getPaymentById(Long id) {
        return paymentMapper.getPaymentById(id);
    }
}
