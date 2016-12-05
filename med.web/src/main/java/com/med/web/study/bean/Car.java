package com.med.web.study.bean;

import org.springframework.context.annotation.Configuration;

/**
 * Created by Meddkim on 2016/11/13.
 */


public class Car {

    private String color;
    private String brand;
    private int maxSpeed;

    //构造函数
    public Car(){}


    //带参数的构造函数
    public Car(String brand, String color, int maxSpeed){
        this.color = color;
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    //
    public void introduce(){
        System.out.println("brand"+brand+";color:"+color+";maxSpeed:"+maxSpeed);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
/**
 *Bean的配置信息是Bean的元数据信息，包括四个部分
 * bean的实现类
 * bean的属性信息，如数据源的连接数，用户名，密码等
 * bean的依赖关系，Spring根据依赖关系配置完成Bean之间的装配
 * bean的行为配置，如声明周期范围和生命周期各过程的回调函数
 */