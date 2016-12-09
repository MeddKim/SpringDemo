package com.med.web.study.aop.spring;

import java.sql.SQLException;

/**
 * @author: Administrator
 * @date : 2016/12/8 0008
 * @Description:
 */
public class ForumServiceDemo {

    public void removeForum(int forumId){
        //do sth ...
        throw  new RuntimeException("运行异常");
    }

    public void updateForum() throws SQLException {
        //do sth ...
        throw new SQLException("数据更新操作异常");
    }
}
