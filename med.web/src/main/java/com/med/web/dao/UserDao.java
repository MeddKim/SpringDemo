package com.med.web.dao;

import com.med.web.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by meddkim on 16-5-2.
 */

@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    //根据用户名和密码匹配用户数  1表示正确，0表示错误
    public int getMatchCount(String userName,String password){
        String sqlStr = " SELECT count(*) FROM t_user "
                    + " WHERE user_name = ? and password = ?";
        return jdbcTemplate.queryForList(sqlStr,new Object[]{userName,password}).size();
    }

    //根据用户名获取User对象
    public User findUserbyUserName(String userName){
        String sqlStr = " SELECT user_id,user_name,credits "
                    +" FROM t_user WHERE = user_name = ?";
        final User user = new User();
        jdbcTemplate.query(sqlStr, new Object[]{userName},
                new RowCallbackHandler() {
                    @Override
                    public void processRow(ResultSet rs) throws SQLException {
                        user.setUserId(rs.getInt("user_id"));
                        user.setUserName(userName);
                        user.setCredits(rs.getInt("credits"));
                    }
                });

        return user;
    }

    //更新用户积分，最后登陆IP及登陆时间
    public void updateLoginInfo(User user){
        String sqlStr = " UPDATE t_user SET last_visit=?,last_ip=?,credits=? "
                +" WHERE user_id = ?";

        jdbcTemplate.update(sqlStr,new Object[]{user.getLastVisit(),user.getLastIp(),user.getCredits(),user.getUserId()});
    }
}
