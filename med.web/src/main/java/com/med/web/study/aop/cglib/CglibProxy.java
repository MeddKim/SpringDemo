package com.med.web.study.aop.cglib;

/**
 * @author: Administrator
 * @date : 2016/12/7 0007
 * @Description:
 */
import com.med.web.study.aop.PerformanceMonitor;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor{
    private Enhancer enhancer = new Enhancer();

    public Object getProxy(Class clazz){
        enhancer.setSuperclass(clazz); //设置需要创建子类的类
        enhancer.setCallback(this);
        return enhancer.create(); //同坐字节码技术动态创建子类实例
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, //拦截父类的所有方法调用
                            MethodProxy methodProxy) throws Throwable {
        PerformanceMonitor.begin(obj.getClass().getName()+"."+method.getName());
        Object result = methodProxy.invokeSuper(obj,args); //通过代理类调用父类中的方法
        PerformanceMonitor.end();
        return result;
    }
}
