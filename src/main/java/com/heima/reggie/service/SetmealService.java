package com.heima.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.heima.reggie.dto.SetmealDto;
import com.heima.reggie.entity.Setmeal;

import java.util.List;

/**
 * @author XQR
 * @date 2022/9/24 2022/9/24
 * @dsecription 类的描述和介绍
 */
public interface SetmealService extends IService<Setmeal> {
//    新增套餐，同时保存套餐和菜品的关联关系
    public void saveWithDish(SetmealDto setmealDto);
//    删除套餐，同时删除套餐和菜品的关联数据
    public void removeWithDish(List<Long> ids);
}
