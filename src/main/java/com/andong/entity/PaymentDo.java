package com.andong.entity;

import lombok.Data;

@Data
public class PaymentDo {
    /**
     * 单笔交易的最大限额，单位是分
     */
    private long maxAmountPerDeal;

    /**
     * 每日交易总量的最大限额
     */
    private long maxAmountTotal;
}
