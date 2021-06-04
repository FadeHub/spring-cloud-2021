package com.sl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author shuliangzhao
 * @Title: PaymentMain
 * @ProjectName spring-cloud-2021
 * @Description: TODO
 * @date 2021/6/4 22:12
 */
@SpringBootApplication
@MapperScan("com.sl.mapper")
public class PaymentMain {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain.class,args);
    }
}
