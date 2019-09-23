package com.anthonyzero.ioc.startup;

import com.anthonyzero.ioc.core.JsonApplicationContext;
import com.anthonyzero.ioc.entity.Robot;

public class Application {

    public static void main(String[] args) throws Exception {
        JsonApplicationContext context = new JsonApplicationContext("app.json");
        context.init(); //注册
        Robot robot = (Robot) context.getBean("robot");
        robot.show();
    }
}
