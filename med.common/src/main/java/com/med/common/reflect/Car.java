package com.med.common.reflect;

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
    public Car(String brand,String color,int maxSpeed){
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
