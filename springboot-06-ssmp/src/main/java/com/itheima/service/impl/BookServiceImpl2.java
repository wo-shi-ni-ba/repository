package com.itheima.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.dao.BookMapper;
import com.itheima.pojo.Book;
import com.itheima.service.IBookService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BookServiceImpl2 extends ServiceImpl<BookMapper, Book> implements IBookService {

    @Resource
    private BookMapper bookMapper;

    @Override
    public IPage<Book> getPage(Integer currentPage, int pageSize , Book book) {


        LambdaQueryWrapper<Book> bookLambdaQueryWrapper = new LambdaQueryWrapper<>();
        bookLambdaQueryWrapper.like(Strings.isNotEmpty(book.getType()) ,Book::getType , book.getType());
        bookLambdaQueryWrapper.like(Strings.isNotEmpty(book.getName()) ,Book::getName , book.getName());
        bookLambdaQueryWrapper.like(Strings.isNotEmpty(book.getDescription()) ,Book::getDescription , book.getDescription());
        IPage page = new Page(currentPage,pageSize);
        return bookMapper.selectPage(page , bookLambdaQueryWrapper);
    }
}
