package com.med.web.study.mybatis;

import com.med.web.domain.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author: Administrator
 * @date : 2016/12/22 0022
 * @Description:
 */
public class UserMyBatisTemplateDao {
    @Autowired
    private SqlSessionTemplate sessionTemplate;

    public User getUser(int userId){
        return (User)sessionTemplate.selectOne("com.med.web,domain.User.getUser",userId);
    }
}
