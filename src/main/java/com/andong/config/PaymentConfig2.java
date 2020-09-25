package com.andong.config;

import com.andong.entity.PaymentDo;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 熟悉注入优化-1
 */
@Configuration
public class PaymentConfig2 {

/*    @Bean
    @ConfigurationProperties(prefix = "pay.nopassword")
    public PaymentDo paymentDo(){
        return new PaymentDo();
    }*/
}