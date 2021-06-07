package com.sl.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author shuliangzhao
 * @Title: ApplicationConfigurtion
 * @ProjectName spring-cloud-2021
 * @Description: TODO
 * @date 2021/6/5 9:59
 */
@Configuration
public class RestConfigurtion {

    /*@Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }*/

    @Autowired
    private RestTemplateBuilder restTemplateBuilder;

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
       return restTemplateBuilder.additionalInterceptors(new RequestLogInterceptor())
                .build();
    }
}
