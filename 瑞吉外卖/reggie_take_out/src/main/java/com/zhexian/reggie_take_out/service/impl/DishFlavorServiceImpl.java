package com.zhexian.reggie_take_out.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhexian.reggie_take_out.entity.DishFlavor;
import com.zhexian.reggie_take_out.mapper.DishFlavorMapper;
import com.zhexian.reggie_take_out.service.DishFlavorService;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper, DishFlavor> implements DishFlavorService {
}
