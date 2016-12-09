package com.med.web.study.aop.spring;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @author: Administrator
 * @date : 2016/12/8 0008
 * @Description:
 */
public class GreetingAfterAdvice implements AfterReturningAdvice{
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("Please enjoy yourself!");
    }
}
