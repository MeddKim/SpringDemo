package com.med.web.study.aop.advisor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;

/**
 * @author: Administrator
 * @date : 2016/12/12 0012
 * @Description:
 */
public class GreetingAdvisorTest {
    public static void main(String[] args) {

        String configPath = "com/med/web/study/aop/advisor/beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
        Waiter waiter = (Waiter)ctx.getBean("waiter");
        Seller seller = (Seller)ctx.getBean("seller");
        waiter.greetTo("John");
        waiter.serveTo("John");
        seller.greetTo("John");
    }
}
