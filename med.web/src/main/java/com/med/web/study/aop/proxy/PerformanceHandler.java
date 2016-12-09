package com.med.web.study.aop.proxy;

import com.med.web.study.aop.PerformanceMonitor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: Administrator
 * @date : 2016/12/7 0007
 * @Description:
 */
public class PerformanceHandler implements InvocationHandler{

    private Object target;

    //target为目标的业务类
    public PerformanceHandler(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        /**
         * 横切代码
         */
        PerformanceMonitor.begin(target.getClass().getName()+"."+method.getName()); //
        Object obj = method.invoke(target,args); //通过反射方法调用业务类的目标方法
        PerformanceMonitor.end();


        return obj;
    }
}
