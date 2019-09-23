package com.anthonyzero.ioc.utils;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;

import java.lang.reflect.Constructor;

public class BeanUtils {

    /**
     * 通过cglib 反射实例化 对象
     * @param clz
     * @param ctr 构造函数
     * @param args 参数值
     * @param <T>
     * @return
     */
    public static <T> T instanceByCglib(Class<T> clz, Constructor ctr, Object[] args)  {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clz);
        enhancer.setCallback(NoOp.INSTANCE);

        if(ctr == null){
            return (T) enhancer.create();
        }else {
            return (T) enhancer.create(ctr.getParameterTypes(),args);
        }
    }
}
