package com.zhexian.reggie_take_out.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhexian.reggie_take_out.dto.SetmealDto;
import com.zhexian.reggie_take_out.entity.Setmeal;

import java.util.List;

public interface SetmealService extends IService<Setmeal> {
    void saveWithDish(SetmealDto setmealDto);
    void deleteWithDish(List<Long> ids);
}
