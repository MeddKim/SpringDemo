package com.med.web.study.aop.cglib;

import com.med.web.study.aop.ForumServiceImpl;

/**
 * @author: Administrator
 * @date : 2016/12/7 0007
 * @Description:
 */
public class TestCGlibService {
    public static void main(String[] args) {
        CglibProxy proxy = new CglibProxy();
        ForumServiceImpl forumService = (ForumServiceImpl)proxy.getProxy(ForumServiceImpl.class);
        forumService.removeTopic(10);
        forumService.removeTopic(1023);
    }
}
