package com.anthonyzero.ioc.bean;

import lombok.Data;

import java.util.List;

@Data
public class BeanDefinition {

    private String name;
    private String className;
    private String interfaceName;
    private List<ConstructorArg> constructorArgs;
    private List<PropertyArg> propertyArgs;
}
