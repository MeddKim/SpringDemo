package com.med.web.study.aop.spring;

import com.jfinal.plugin.activerecord.Model;
import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author: Administrator
 * @date : 2016/12/7 0007
 * @Description:
 */
public class GreetingBeforeAdvice implements MethodBeforeAdvice{
    //在目标方法调用前执行
    public void before(Method method,Object[] args, Object obj) throws Throwable{
        String clientName = (String)args[0];
        System.out.println("How are you! Mr."+clientName+".");

    }
}
