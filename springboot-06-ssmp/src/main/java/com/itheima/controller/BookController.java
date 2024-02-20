package com.itheima.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.itheima.controller.uitls.R;
import com.itheima.pojo.Book;
import com.itheima.service.IBookService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
@Slf4j
@RestController
@RequestMapping("/books")
public class BookController {

//    private static final Logger log = LoggerFactory.getLogger(BookController.class);


    @Resource
    private IBookService bookService ;

    @PostMapping
    public R save(@RequestBody Book book){
        boolean flag = bookService.save(book);
        return new R(flag , flag? "添加成功^_^":"添加失败-_-!");
        //模拟添加失败
//        return new R(false);
    }

    @DeleteMapping("/{id}")
    public R deleteById(@PathVariable Integer id){
        boolean flag = bookService.removeById(id);
        return new R(flag , flag? "删除成功^_^":"删除失败-_-!");
    }

    @PutMapping
    public R updateBy(@RequestBody Book book){
        boolean flag = bookService.updateById(book);
        return new R(flag , flag? "修改成功^_^":"修改失败-_-!");
    }

    @GetMapping
    public R getAll(){
        return new R(true , bookService.list());
    }

    @GetMapping("/{id}")
    public R getById(@PathVariable(value = "id") Integer id){
        return new R(true , bookService.getById(id));
    }


    /*@GetMapping("/{currentPage}/{pageSize}")
    public R getPage(@PathVariable("currentPage") Integer currentPage , @PathVariable("pageSize") Integer pageSize){
        IPage<Book> page = bookService.getPage(currentPage, pageSize);
        if (currentPage > page.getCurrent()){
            bookService.getPage( (int) page.getCurrent(), pageSize);
        }
        return new R(true ,page );
    }*/

    @GetMapping("/{currentPage}/{pageSize}")
    public R getPage(@PathVariable("currentPage") Integer currentPage ,
                     @PathVariable("pageSize") Integer pageSize , String placeholder ,Book book){

        IPage<Book> page = bookService.getPage(currentPage, pageSize , book);
        if (currentPage > page.getCurrent()){
            bookService.getPage( (int) page.getCurrent(), pageSize , book);
        }
        return new R(true ,page );
    }





}
