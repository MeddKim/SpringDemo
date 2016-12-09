package com.med.web.study.aop.spring;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author: Administrator
 * @date : 2016/12/8 0008
 * @Description:
 */
public class GreetingInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Object[] args = invocation.getArguments(); //目标方法的入参
        String clientName = (String)args[0];
        System.out.println("How are you ! Mr."+clientName+".");
        Object obj = invocation.proceed();
        System.out.println("Please enjoy yourself !");
        return obj;
    }
}
