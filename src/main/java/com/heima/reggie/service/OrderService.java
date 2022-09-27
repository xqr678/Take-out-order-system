package com.heima.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.heima.reggie.entity.Orders;

/**
 * @author XQR
 * @date 2022/9/29 2022/9/29
 * @dsecription 类的描述和介绍
 */
public interface OrderService extends IService<Orders> {
    //用户下单
    public void submit(Orders orders);
}
