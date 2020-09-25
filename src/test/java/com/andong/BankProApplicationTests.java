package com.andong;

import com.andong.dao.AccountMapper;
import com.andong.entity.Account;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BankProApplicationTests {

//	@Test
//	void contextLoads() {
//	}

	@Autowired
	private AccountMapper accountMapper;

	@Test
	public void contextLoads() {
		Account account = accountMapper.queryById(1L);
		System.out.println("account = " + account);
	}

}
