package com.zhexian.reggie_take_out.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhexian.reggie_take_out.dto.SetmealDto;
import com.zhexian.reggie_take_out.entity.SetmealDish;
import com.zhexian.reggie_take_out.mapper.SetmealDishMapper;
import com.zhexian.reggie_take_out.service.SetmealDishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SetmealDishServiceImpl extends ServiceImpl<SetmealDishMapper, SetmealDish> implements SetmealDishService {


}
