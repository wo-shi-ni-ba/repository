package com.itheima.mptest.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;
@TableName("t_car")
@Data
public class User {
    @TableId
    private Integer id ;
    private Integer carNum ;
    private String brand ;
    private Double guidePrice ;
    private Date produceTime ;
    private String carType ;

}
