package com.heima.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.heima.reggie.entity.Category;

/**
 * @author XQR
 * @date 2022/9/24 2022/9/24
 * @dsecription 类的描述和介绍
 */
public interface CategoryService extends IService<Category> {
    public void remove(Long id);
}
