package com.sl.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author shuliangzhao
 * @Title: CommonResult
 * @ProjectName spring-cloud-2021
 * @Description: TODO
 * @date 2021/6/4 22:31
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {

    private int code;

    private String message;

    private T data;

    public CommonResult(int code, String message) {
        this(code,message,null);
    }
}
