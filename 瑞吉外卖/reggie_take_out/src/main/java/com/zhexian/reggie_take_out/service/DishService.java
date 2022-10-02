package com.zhexian.reggie_take_out.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhexian.reggie_take_out.dto.DishDto;
import com.zhexian.reggie_take_out.entity.Dish;

public interface DishService extends IService<Dish> {
    void saveWithFlavor(DishDto dishDto);

    DishDto getByIdWithFlavor(Long id);

    void updateWithFlavor(DishDto dishDto);
}
