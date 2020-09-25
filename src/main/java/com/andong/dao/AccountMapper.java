package com.andong.dao;

import com.andong.entity.Account;

/**
 * Mapper接口
 */
public interface AccountMapper {

    Account queryById(Long id);
}