package com.itheima.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.pojo.Book;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class BookMapperTest {


    @Resource
    private BookMapper bookMapper;

    @Test
    void getByIdTest(){
        System.out.println(bookMapper.selectById(1));
    }

    @Test
    void saveTest(){
        Book book = new Book();
        book.setName("spring框架");
        book.setType("Java");
        book.setDescription("高效开发java程序");
        bookMapper.insert(book);
    }

    @Test
    void upDateTest(){
        Book book = bookMapper.selectById(2);
        book.setType("Java");
        book.setName("springBoot框架");
        bookMapper.updateById(book);
    }

    @Test
    void deleteTest(){
        bookMapper.deleteById(4);
    }

    @Test
    void selectAllTest(){
        System.out.println(bookMapper.selectList(null));
    }

    //分页查询
    @Test
    void getPageTest(){
        IPage page = new Page(1,3);
        bookMapper.selectPage(page , null);
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
    //关键字查询
    @Test
    void getByTest(){
        QueryWrapper<Book> bookQueryWrapper = new QueryWrapper<>();
        bookQueryWrapper.like("name","spring");
        bookMapper.selectList(bookQueryWrapper);

    }

    //关键字查询2
    @Test
    void getByTest2(){

        String str = "s" ;
        LambdaQueryWrapper<Book> bookLambdaQueryWrapper = new LambdaQueryWrapper<>();
//        当str传值为空即null时，该方法会直接吧null当作字符串进行查询，所以使用该方法要先判断str是否为null
//        if (str != null)bookLambdaQueryWrapper.like(Book::getName , str);
        bookLambdaQueryWrapper.like(str!=null ,Book::getName , str);
        bookMapper.selectList(bookLambdaQueryWrapper);

    }

}
