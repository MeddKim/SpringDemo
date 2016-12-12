package com.med.web.study.aop.advisor;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author: Administrator
 * @date : 2016/12/12 0012
 * @Description:
 */
public class GreetingBeforeAdvice implements MethodBeforeAdvice{

    @Override
    public void before(Method method, Object[] args, Object obj) throws Throwable {
        //输出切点
        System.out.println(obj.getClass().getName()+"."+method.getName());
        String clientName = (String)args[0];
        System.out.println("How are you ! Mr."+clientName+".");
    }
}
