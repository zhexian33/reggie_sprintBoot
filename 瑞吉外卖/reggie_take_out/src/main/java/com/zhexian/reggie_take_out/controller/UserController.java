package com.zhexian.reggie_take_out.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.zhexian.reggie_take_out.common.R;
import com.zhexian.reggie_take_out.entity.User;
import com.zhexian.reggie_take_out.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public R<User> login(HttpServletRequest request,@RequestBody User user){
        log.info("user=>{}",user);

        LambdaQueryWrapper<User> queryWrapper=new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getPhone,user.getPhone());
        User one = userService.getOne(queryWrapper);
        if(one==null){
            one=new User();
            one.setPhone(user.getPhone());
            one.setStatus(1);
            userService.save(one);
        }else if(one.getStatus()==0){
            return R.error("当前账号已被禁用");
        }
        one = userService.getOne(queryWrapper);
        request.getSession().setAttribute("user",one.getId());
        return R.success(one);
    }
}
