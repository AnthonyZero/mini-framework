package com.anthonyzero.ioc.core;


import com.anthonyzero.ioc.bean.BeanDefinition;
import com.anthonyzero.ioc.utils.JsonUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.InputStream;
import java.util.List;

public class JsonApplicationContext extends BeanFactoryContext {

    private String fileName;

    public JsonApplicationContext(String fileName) {
        this.fileName = fileName;
    }

    public void init(){
        loadFile();
    }

    private void loadFile(){

        InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);

        List<BeanDefinition> beanDefinitions = JsonUtils.readValue(is, new TypeReference<List<BeanDefinition>>(){});

        if(beanDefinitions != null && !beanDefinitions.isEmpty()) {

            for (BeanDefinition beanDefinition : beanDefinitions) {
                System.out.println(beanDefinition);
                registerBean(beanDefinition.getName(), beanDefinition);
            }
        }

    }
}
