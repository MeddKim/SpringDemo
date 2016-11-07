package com.med.web.service;

import com.med.web.dao.LoginLogDao;
import com.med.web.dao.UserDao;
import com.med.web.domain.LoginLog;
import com.med.web.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by meddkim on 16-11-5.
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private LoginLogDao loginLogDao;

    public boolean hasMatchUSer(String userName,String password){
        int matchCount = userDao.getMatchCount(userName,password);
        return matchCount > 0;
    }

    public User findUserByUserName(String userName){
        return userDao.findUserbyUserName(userName);
    }

    public void loginSuccess(User user){
        user.setCredits(5+user.getCredits());
        LoginLog loginLog = new LoginLog();
        loginLog.setUserId(user.getUserId());
        loginLog.setIp(user.getLastIp());
        loginLog.setLoginDate(user.getLastVisit());

        userDao.updateLoginInfo(user);
        loginLogDao.insertLoginLog(loginLog);
    }
}
