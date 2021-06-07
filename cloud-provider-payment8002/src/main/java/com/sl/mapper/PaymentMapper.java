package com.sl.mapper;

import com.sl.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author shuliangzhao
 * @Title: PaymentMapper
 * @ProjectName spring-cloud-2021
 * @Description: TODO
 * @date 2021/6/4 22:32
 */
public interface PaymentMapper {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

}
