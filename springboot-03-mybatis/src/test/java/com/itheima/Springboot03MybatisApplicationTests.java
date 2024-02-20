package com.itheima;

import com.itheima.dao.AccountDao;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class Springboot03MybatisApplicationTests {

    @Resource
    private AccountDao accountDao;


    @Test
    void contextLoads() {

        System.out.println(accountDao.save(1));
    }

}
