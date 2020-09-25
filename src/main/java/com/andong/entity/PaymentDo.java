package com.andong.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

@Data
@ConfigurationProperties(prefix = "pay.nopassword")
@Component //加`@Component`注解，将其加入Spring容器【一个对象要先完成属性注入，然后加入IOC容器，再进行依赖注入】
public class PaymentDo {
    /**
     * 单笔交易的最大限额，单位是分
     */
    private long maxAmountPerDeal;

    /**
     * 每日交易总量的最大限额
     */
    private long maxAmountTotal;

    /**
     * 注入Map类型数据
     */
    private Map<String, Object> user;

    /**
     * 注入对象类型数据
     */
    private User user2=new User();

}
