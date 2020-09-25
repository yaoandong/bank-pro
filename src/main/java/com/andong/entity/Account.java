package com.andong.entity;

import lombok.Data;

/**
 * 数据库对应的实体类
 */
@Data
public class Account {
    private Long id;
    private String accountName;
    private Long money;
}