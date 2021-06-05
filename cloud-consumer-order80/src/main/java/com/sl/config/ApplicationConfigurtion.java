package com.sl.config;

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
public class ApplicationConfigurtion {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
