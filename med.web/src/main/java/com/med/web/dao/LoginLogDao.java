package com.med.web.dao;

import com.med.web.domain.LoginLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by meddkim on 16-5-2.
 */
@Repository
public class LoginLogDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insertLoginLog(LoginLog loginLog){
        String sqlStr = " INSERT INTO t_login_log(user_id,ip,login_datetime) "
                +" VALUES(?,?,?)";
        jdbcTemplate.update(sqlStr,new Object[]{loginLog.getUserId(),loginLog.getIp(),loginLog.getLoginDate()});
    }
}
