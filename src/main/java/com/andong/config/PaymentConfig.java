package com.andong.config;

import com.andong.entity.PaymentDo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class PaymentConfig {

    /**
     * 通过@Value注解读取配置文件中的属性
     */
    @Value("${pay.nopassword.maxAmountPerDeal}")
    private long maxAmount;

    @Value("${pay.nopassword.maxAmountTotal}")
    private long maxAmountTotal;

    /**
     * 通过 @Bean注解声明一个要注入到Spring中的对象。
     */
    @Bean
    public PaymentDo paymentDo(){
        PaymentDo paymentDo = new PaymentDo();
        paymentDo.setMaxAmountPerDeal(maxAmount);
        paymentDo.setMaxAmountTotal(maxAmountTotal);
        return paymentDo;
    }



}
