package com.andong;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@EnableConfigurationProperties(PaymentDo.class)//加上这个注解，意味着声明要使用这个类的实例，就会被加入Spring的容器。
@SpringBootApplication
@MapperScan("com.andong.dao")
public class BankProApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankProApplication.class, args);
	}

}
