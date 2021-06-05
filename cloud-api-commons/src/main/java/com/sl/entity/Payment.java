package com.sl.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author shuliangzhao
 * @Title: Payment
 * @ProjectName spring-cloud-2021
 * @Description: TODO
 * @date 2021/6/4 22:30
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment implements Serializable {

    private Long id;
    private String serial;
}
