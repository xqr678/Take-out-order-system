package com.heima.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.heima.reggie.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author XQR
 * @date 2022/9/29 2022/9/29
 * @dsecription 类的描述和介绍
 */
@Mapper
public interface OrderMapper extends BaseMapper<Orders> {
}
