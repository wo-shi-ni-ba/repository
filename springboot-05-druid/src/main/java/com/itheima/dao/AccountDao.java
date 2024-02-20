package com.itheima.dao;

import com.itheima.pojo.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AccountDao {

    @Select("select * from t_act where id = #{id}")
    public Account save(Integer id);

}
