package com.med.core.dao;



import org.apache.log4j.Logger;
import com.alibaba.fastjson.JSON;
import com.med.core.bean.Member;
import com.med.core.service.IMemberService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:/spring-mvc.xml","classpath*:/spring-mybatis.xml"})
public class DaoTest {

    private static Logger logger = Logger.getLogger(DaoTest.class);

    @Resource
    private IMemberService userService = null;

    @Test
    public void hasMatchUser(){
        Member member = userService.getMemberById(1);
        // System.out.println(user.getUserName());
        // logger.info("值："+user.getUserName());
        logger.info(JSON.toJSONString(member));
    }
}