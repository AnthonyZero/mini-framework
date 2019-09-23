package com.anthonyzero.ioc.entity;

public class Robot {
    //需要注入 hand 和 mouth
    private Hand hand;
    private Mouth mouth;
    private int sex;
    private String name;

    public void show(){
        hand.waveHand();
        mouth.speak();
        System.out.println(this.sex + ":" + this.name);
    }


    public Robot(Integer sex, String name) {
        this.sex = sex;
        this.name = name;
    }

}
