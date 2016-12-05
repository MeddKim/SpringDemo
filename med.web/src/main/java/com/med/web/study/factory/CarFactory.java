package com.med.web.study.factory;

import com.med.web.study.bean.Car;

/**
 * @author: Administrator
 * @date : 2016/12/5 0005
 * @Description:
 */
public class CarFactory {

    public Car createHongQiCar(){
        Car car = new Car();
        car.setBrand("红旗CA72");
        return car;
    }
}
