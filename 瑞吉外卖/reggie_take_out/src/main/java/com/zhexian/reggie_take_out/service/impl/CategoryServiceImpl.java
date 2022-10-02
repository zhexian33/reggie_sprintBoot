package com.zhexian.reggie_take_out.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhexian.reggie_take_out.common.CustomException;
import com.zhexian.reggie_take_out.entity.Category;
import com.zhexian.reggie_take_out.entity.Dish;
import com.zhexian.reggie_take_out.entity.Setmeal;
import com.zhexian.reggie_take_out.mapper.CategoryMapper;
import com.zhexian.reggie_take_out.service.CategoryService;
import com.zhexian.reggie_take_out.service.DishService;
import com.zhexian.reggie_take_out.service.SetmealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService  {
    @Autowired
    private DishService dishService;

    @Autowired
    private SetmealService setmealService;

    @Override
    public void remove(Long id) {
        LambdaQueryWrapper<Dish> dishLambdaQueryWrapper =new LambdaQueryWrapper<>();
        dishLambdaQueryWrapper.eq(Dish::getCategoryId,id);
        long count1 = dishService.count(dishLambdaQueryWrapper);

        if(count1>0){
            throw new CustomException("当前分类下关联了菜品，不能删除");
        }
        LambdaQueryWrapper<Setmeal> setmealLambdaQueryWrapper =new LambdaQueryWrapper<>();
        setmealLambdaQueryWrapper.eq(Setmeal::getCategoryId,id);
        long count2 = setmealService.count(setmealLambdaQueryWrapper);

        if(count2>0){
            throw new CustomException("当前分类下关联了套餐，不能删除");
        }

        super.removeById(id);
    }
}
