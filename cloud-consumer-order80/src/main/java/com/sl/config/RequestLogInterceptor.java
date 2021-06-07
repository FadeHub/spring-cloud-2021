package com.sl.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;

/**
 * @author shuliangzhao
 * @Title: RequestLogInterceptor
 * @ProjectName spring-cloud-2021
 * @Description: TODO
 * @date 2021/6/7 16:09
 */
@Slf4j
public class RequestLogInterceptor implements ClientHttpRequestInterceptor {
    @Override
    public ClientHttpResponse intercept(HttpRequest httpRequest, byte[] bytes, ClientHttpRequestExecution clientHttpRequestExecution) throws IOException {
        logRequestDetails(httpRequest);
        return clientHttpRequestExecution.execute(httpRequest,bytes);
    }

    private void logRequestDetails(HttpRequest request) {
       log.info("Headers: {}", request.getHeaders());
       log.info("Request Method: {}", request.getMethod());
       log.info("Request URI: {}", request.getURI());
    }
}
