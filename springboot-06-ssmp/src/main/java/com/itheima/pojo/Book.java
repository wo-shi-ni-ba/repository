package com.itheima.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
//此注解用于匹配数据库表名
//@TableName("t_book")
public class Book {

    private Integer id;
    private String type;
    private String name;
    private String description;

}
