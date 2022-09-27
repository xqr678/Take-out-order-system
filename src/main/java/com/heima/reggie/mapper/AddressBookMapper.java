package com.heima.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.heima.reggie.entity.AddressBook;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author XQR
 * @date 2022/9/28 2022/9/28
 * @dsecription 类的描述和介绍
 */
@Mapper
public interface AddressBookMapper extends BaseMapper<AddressBook> {
}
