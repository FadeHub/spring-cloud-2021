package com.sl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author shuliangzhao
 * @Title: PaymentMain
 * @ProjectName spring-cloud-2021
 * @Description: TODO
 * @date 2021/6/4 22:12
 */
@SpringBootApplication
@MapperScan("com.sl.mapper")
@EnableEurekaClient
public class PaymentMain8002 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8002.class,args);
    }
}
