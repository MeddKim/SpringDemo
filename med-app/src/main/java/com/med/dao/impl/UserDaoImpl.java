package com.med.dao.impl;

import com.med.dao.UserMapper;
import com.med.domain.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: Administrator
 * @date : 2017/1/5 0005
 * @Description:
 */
@Component
public class UserDaoImpl implements UserMapper{

//    @Autowired
//    private SqlSessionTemplate sessionTemplate;

    @Override
    public int deleteByPrimaryKey(Integer userId) {
        return 0;
    }

    @Override
    public int insert(User record) {
        return 0;
    }

    @Override
    public int insertSelective(User record) {
        return 0;
    }

    @Override
    public User selectByPrimaryKey(Integer userId) {
//        return (User) sessionTemplate.selectOne("com.med.dao.UserMapper.selectByPrimaryKey",userId);
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return 0;
    }
}
