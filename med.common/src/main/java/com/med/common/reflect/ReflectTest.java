package com.med.common.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by Meddkim on 2016/11/13.
 */
public class ReflectTest {

    public static Car initByDefualtConst() throws Throwable{

        //通过类加载器获取Car的  **类对象**
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class clazz = loader.loadClass("com.med.common.reflect.Car");

        //获取类的默认构造器并根据该构造器创建实例
        Constructor constructor = clazz.getDeclaredConstructor((Class[])null);
        Car car = (Car)constructor.newInstance();

        //通过反射方法设置属性
        Method setBrand = clazz.getDeclaredMethod("setBrand",String.class);
        setBrand.invoke(car,"劳斯莱斯幻影");
        Method setColor = clazz.getDeclaredMethod("setColor",String.class);
        setColor.invoke(car,"黑色");
        Method setMaxSpeed = clazz.getDeclaredMethod("setMaxSpeed",int.class);
        setMaxSpeed.invoke(car,200);
        
        return car;
    }

    public static void main(String[] args)throws Throwable {
        Car car = initByDefualtConst();
        car.introduce();
    }
}
