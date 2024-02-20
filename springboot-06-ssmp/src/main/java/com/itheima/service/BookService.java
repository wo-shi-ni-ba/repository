package com.itheima.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.itheima.pojo.Book;

import java.util.List;

public interface BookService {

    int save(Book book);
    int deleteById(Integer id);
    int updateById(Book book);
    Book selectById(Integer id);
    List<Book> selectAll();

    IPage<Book> getPage(int currentPage , int pageSize);


}
