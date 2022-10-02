package com.zhexian.reggie_take_out.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhexian.reggie_take_out.entity.OrderDetail;
import com.zhexian.reggie_take_out.mapper.OrderDetailMapper;
import com.zhexian.reggie_take_out.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {
}
