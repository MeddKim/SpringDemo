package com.med.web.study.context;

import com.med.web.study.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Administrator
 * @date : 2016/12/5 0005
 * @Description:
 */

@Configuration //表示是一个配置信息提供类
public class Beans {

    //定义一个Bean
    @Bean(name = "car")
    public Car buildCar(){
        Car car = new Car();
        car.setBrand("红旗CA72");
        car.setColor("黑色");
        car.setMaxSpeed(200);
        return car;
    }
}
