package com.heima.reggie.common;

/**
 * @author XQR
 * @date 2022/9/24 2022/9/24
 * @dsecription 类的描述和介绍
 */
//基于ThreadLocal封装工具类，用户保存和获取当前登录用户id
public class BaseContext {
    private static ThreadLocal<Long> threadLocal=new ThreadLocal<>();

//    设置值
    public static void setCurrentId(Long id){
        threadLocal.set(id);
    }
//    得到值
    public static Long getCurrentId(){
        return threadLocal.get();
    }
}
