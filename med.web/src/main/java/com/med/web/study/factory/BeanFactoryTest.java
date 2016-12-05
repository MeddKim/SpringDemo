package com.med.web.study.factory;

import com.med.web.study.bean.Car;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

/**
 * @author: Administrator
 * @date : 2016/12/5 0005
 * @Description:
 */
public class BeanFactoryTest {
    public static void main(String[] args) throws Throwable{
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource res = resolver.getResource("classpath:com/med/web/study/factory/beans.xml");
        BeanFactory bf = new XmlBeanFactory(res); //XmlBeanFactory is deprecated 该类已经不推荐使用

        System.out.println("init BeanFactory.");
        Car car =  bf.getBean("car1",Car.class);
        System.out.println("car bean is ready for use !");
        System.out.println("brand:"+car.getBrand()+"--"+"color:"+car.getColor()+"--"+"maxSpeed"+car.getMaxSpeed());
    }
}
/**
 * BeanFactory中bean的生命周期：
 *      singleton:在Spring Ioc容器中仅存在一个Bean实例,Bean以单例的方式存在
 *      prototype:每次调用都会返回一个Bean实例，即每次调用getBean()时，相当于执行new XxxBean()的操作
 *      request:每次http请求都会创建一个新的Bean,该作用域仅适用于WebApplicationContext环境
 *      session:同一个HTTP Session共享一个Bean，不同的HTTP Session使用不同的Bean,该作用域仅适用于WebApplicationContext环境
 *      globalSession:同一个全局Session共享一个Bean，一般作用与Portlet应用环境，该作用域仅适用于WebApplicationContext环境
 */
