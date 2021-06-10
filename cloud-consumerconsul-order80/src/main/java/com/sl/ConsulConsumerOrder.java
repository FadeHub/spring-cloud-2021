package com.sl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author shuliangzhao
 * @Title: ConsulConsumerOrder
 * @ProjectName spring-cloud-2021
 * @Description: TODO
 * @date 2021/6/10 13:54
 */
@SpringBootApplication
@EnableDiscoveryClient //该注解用于向使用consul或者zookeeper作为注册中心时注册服务
public class ConsulConsumerOrder {

    public static void main(String[] args) {
        SpringApplication.run(ConsulConsumerOrder.class,args);
    }
}
