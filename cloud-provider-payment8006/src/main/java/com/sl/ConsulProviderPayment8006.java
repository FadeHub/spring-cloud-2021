package com.sl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author shuliangzhao
 * @Title: ConsulProviderPayment8006
 * @ProjectName spring-cloud-2021
 * @Description: TODO
 * @date 2021/6/10 10:08
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulProviderPayment8006 {

    public static void main(String[] args) {
        SpringApplication.run(ConsulProviderPayment8006.class,args);
    }
}
