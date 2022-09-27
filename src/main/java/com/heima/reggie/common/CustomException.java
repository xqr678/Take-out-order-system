package com.heima.reggie.common;

/**
 * @author XQR
 * @date 2022/9/24 2022/9/24
 * @dsecription 类的描述和介绍
 */
//自定义业务异常
public class CustomException extends RuntimeException {
    public CustomException(String message){
        super(message);
    }
}
