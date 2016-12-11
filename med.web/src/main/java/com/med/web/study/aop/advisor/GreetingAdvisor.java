package com.med.web.study.aop.advisor;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcutAdvisor;

import java.lang.reflect.Method;

/**
 * Created by Meddkim on 2016/12/11.
 */
public class GreetingAdvisor extends StaticMethodMatcherPointcutAdvisor{
    //切点方法匹配规则，方法名称为greetTo
    @Override
    public boolean matches(Method method, Class<?> clazz) {
        return "greetTo".equals(method.getName());
    }

    //切点匹配规则，Waiter或者Waiter的子类
    public ClassFilter  getClassFilter(){
        return new ClassFilter() {
            @Override
            public boolean matches(Class<?> clazz) {
                return Waiter.class.isAssignableFrom(clazz);
            }
        };
    }
}
