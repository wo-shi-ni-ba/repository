package com.itheima.mptest.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.mptest.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {
}
