package com.med.web.study.aop.spring;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

/**
 * @author: Administrator
 * @date : 2016/12/7 0007
 * @Description:
 */
public class TestBeforeAdvice {

    public static void main(String[] args) {
        Waiter target = new NaiveWaiter();
        BeforeAdvice advice = new GreetingBeforeAdvice();

        //提供Spring 提供的代理工厂类
        ProxyFactory pf = new ProxyFactory();

        //设置代理目标
        pf.setTarget(target);

        //为代理目标添加增加
        pf.addAdvice(advice);

        //生成代理实例
        Waiter proxy = (Waiter)pf.getProxy();
        proxy.greetTo("John");
        proxy.serveTo("Tom");
    }
}
