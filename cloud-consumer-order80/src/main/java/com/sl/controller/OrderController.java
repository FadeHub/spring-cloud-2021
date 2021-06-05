package com.sl.controller;

import com.sl.entity.CommonResult;
import com.sl.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author shuliangzhao
 * @Title: OrderController
 * @ProjectName spring-cloud-2021
 * @Description: TODO
 * @date 2021/6/5 9:58
 */
@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    private String url = "http://localhost:8001";

    @GetMapping(value = "/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment) {
      return restTemplate.postForObject(url+"payment/create",payment,CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        return restTemplate.getForObject(url+"payment/get/"+id,CommonResult.class);
    }
}
