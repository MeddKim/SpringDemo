package com.med.web.study.aop.spring;

/**
 * @author: Administrator
 * @date : 2016/12/7 0007
 * @Description:
 */
public class NaiveWaiter implements Waiter {
    @Override
    public void greetTo(String name) {
        System.out.println("greet to "+name+" ...");
    }

    @Override
    public void serveTo(String name) {
        System.out.println("serve to "+name+" ...");
    }
}
