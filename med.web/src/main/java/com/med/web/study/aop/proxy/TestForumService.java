package com.med.web.study.aop.proxy;

import com.med.web.study.aop.ForumService;

import java.lang.reflect.Proxy;

/**
 * @author: Administrator
 * @date : 2016/12/7 0007
 * @Description:
 */
public class TestForumService  {
    public static void main(String[] args) {

        ForumServiceImpl2 target = new ForumServiceImpl2(); //希望被代理的目标业务类

        PerformanceHandler handler = new PerformanceHandler(target); //将目标业务额类和横切代码编织到一起

        ForumService proxy = (ForumService) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                handler
        );
        //不能用类下面的代码是错误的
//        ForumServiceImpl2 proxy = (ForumServiceImpl2) Proxy.newProxyInstance(
//                target.getClass().getClassLoader(),
//                target.getClass().getInterfaces(),
//                handler
//        );


        proxy.removeForum(10);
        proxy.removeTopic(1012);
    }
}
