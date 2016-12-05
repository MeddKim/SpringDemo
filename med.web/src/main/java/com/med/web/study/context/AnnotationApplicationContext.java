package com.med.web.study.context;

import com.med.web.study.bean.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Administrator
 * @date : 2016/12/5 0005
 * @Description:
 */
public class AnnotationApplicationContext {

    public static void main(String[] args) {
        //通过调用一个带@Configuration的POJO装载Bean配置
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Beans.class);

        Car car = ctx.getBean("car", Car.class);

        System.out.println("brand:"+car.getBrand()+"--"+"color:"+car.getColor()+"--"+"maxSpeed:"+car.getMaxSpeed());
    }

}

/**
 * ApplicationContext中bean的生命周期：
 *
 */
