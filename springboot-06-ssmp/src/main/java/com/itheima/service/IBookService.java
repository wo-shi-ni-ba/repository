package com.itheima.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.pojo.Book;

public interface IBookService extends IService<Book> {

    IPage<Book> getPage(Integer currentPage , int pageSize , Book book);
}
