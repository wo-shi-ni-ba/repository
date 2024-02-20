package com.itheima.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.itheima.pojo.Book;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class BookServiceTest {

    @Resource
    private BookService bookService;

    @Test
    void saveTest(){
        Book book = new Book();
        book.setName("测试数据123");
        book.setType("测试数据123");
        book.setDescription("测试数据123");
        bookService.save(book);
    }

    @Test
    void deleteByIdTest(){
        bookService.deleteById(6);
    }

    @Test
    void updateByIdTest(){
        Book book = bookService.selectById(1);
        book.setName("测试数据123");
        book.setType("测试数据123");
        book.setDescription("测试数据123");
        bookService.updateById(book);
    }

    @Test
    void selectByIdTest(){
        bookService.selectById(1);
    }

    @Test
    void selectAllTest(){
        List<Book> books = bookService.selectAll();
        System.out.println(books);
    }

    @Test
    void getPageTest(){
        IPage<Book> page = bookService.getPage(2,3);
        //表示一共有多少页
        System.out.println(page.getPages());
        //表示当前页是那页
        System.out.println(page.getCurrent());
        //当前页的全部数据组成的集合
        System.out.println(page.getRecords());
        //表示当前页有多少条数据
        System.out.println(page.getSize());
        //总数据条数
        System.out.println(page.getTotal());
    }

}
