package com.zhexian.reggie_take_out.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhexian.reggie_take_out.entity.User;
import com.zhexian.reggie_take_out.mapper.UserMapper;
import com.zhexian.reggie_take_out.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
