package com.andong.service;

import com.andong.dao.AccountMapper;
import com.andong.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 虎哥
 */
@Service
public class AccountService {

    @Autowired
    private AccountMapper accountMapper;

    public Account queryById(Long id) {
        return accountMapper.queryById(id);
    }
}