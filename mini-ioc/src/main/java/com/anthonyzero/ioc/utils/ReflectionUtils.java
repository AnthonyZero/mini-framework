package com.anthonyzero.ioc.utils;
import java.lang.reflect.Field;

public class ReflectionUtils {

    // Java 的反射原理来完成对象的依赖注入
    public static void injectField(Field field,Object obj,Object value) throws IllegalAccessException {
        if(field != null) {
            field.setAccessible(true);
            field.set(obj, value);
        }
    }
}
