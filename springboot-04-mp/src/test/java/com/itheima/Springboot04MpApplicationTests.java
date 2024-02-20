package com.itheima;

import com.itheima.dao.AccountDao;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class Springboot04MpApplicationTests {

	@Resource
	private AccountDao accountDao;

	@Test
	void contextLoads() {
		System.out.println(accountDao.selectById(1));

	}

}
