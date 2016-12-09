package com.med.web.study.aop.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Administrator
 * @date : 2016/12/8 0008
 * @Description:
 */
public class XmlConfigTest {
    public static void main(String[] args) {
        String configPath = "com/med/web/study/aop/spring/beans.xml";

        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);

//        Waiter waiter = (Waiter)ctx.getBean("waiter");
//        waiter.greetTo("John");

//        Waiter waiter = (Waiter)ctx.getBean("waiter1");
//        waiter.greetTo("John");

        Waiter waiter = (Waiter)ctx.getBean("waiter2");
        waiter.greetTo("John");
    }
}

