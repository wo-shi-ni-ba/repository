package com.itheima.mptest.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.mptest.mapper.UserMapper;
import com.itheima.mptest.pojo.User;
import com.itheima.mptest.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
