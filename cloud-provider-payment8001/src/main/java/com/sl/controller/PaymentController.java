package com.sl.controller;

import com.sl.entity.CommonResult;
import com.sl.entity.Payment;
import com.sl.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author shuliangzhao
 * @Title: PaymentController
 * @ProjectName spring-cloud-2021
 * @Description: TODO
 * @date 2021/6/4 22:36
 */
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        if (result > 0) {
            log.info("=====插入成功====");
            return new CommonResult(200,"success",result);
        }  else {
            log.info("======插入失败=====");
            return new CommonResult(444,"fail",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment result = paymentService.getPaymentById(id);
        if (result != null) {
            log.info("=====查询成功====",result);
            return new CommonResult(200,"success",result);
        }  else {
            log.info("======查询失败=====");
            return new CommonResult(444,"没有对应记录,查询ID: "+id,null);
        }
    }
}
