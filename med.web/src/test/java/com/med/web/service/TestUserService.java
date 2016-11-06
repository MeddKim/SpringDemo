package com.med.web.service;

import com.med.web.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by meddkim on 16-11-6.
 */
@RunWith(SpringJUnit4ClassRunner.class) //基于Junit4 的spring的测试框架
@ContextConfiguration(locations = {"classpath:applicationContext.xml"}) //启动Spring容器
public class TestUserService {
    @Autowired
    private UserService userService;

    @Test
    public void hasMatchUser(){
        boolean b1 = userService.hasMatchUSer("admin","123456");
        boolean b2 = userService.hasMatchUSer("aaa","234");

//        assertTrue(b1);
        System.out.println(b1);
        System.out.println(b2);
    }

    @Test
    public void findUserByName(){
        User user =  userService.findUserByUserName("admin");

        System.out.println(user.getUserName());
    }
}
