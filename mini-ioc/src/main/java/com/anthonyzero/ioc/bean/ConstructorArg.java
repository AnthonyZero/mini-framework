package com.anthonyzero.ioc.bean;

import lombok.Data;

@Data
public class ConstructorArg {
    private int index;
    private String ref;
    private String name;
    private Object value;
}
