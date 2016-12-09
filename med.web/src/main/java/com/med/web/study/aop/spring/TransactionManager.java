package com.med.web.study.aop.spring;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

/**
 * @author: Administrator
 * @date : 2016/12/8 0008
 * @Description:
 */
public class TransactionManager implements ThrowsAdvice{
    //定义增强逻辑
    public void afterThrowing(Method method,Object[] args,Object target,
                              Exception ex)throws Throwable{
        System.out.println("-------------");
        System.out.println("method:"+method.getName());
        System.out.println("抛出异常:"+ex.getMessage());
        System.out.println("层共回滚事物。");
    }
}
