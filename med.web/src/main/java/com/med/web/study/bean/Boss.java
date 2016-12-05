package com.med.web.study.bean;

import java.util.*;

/**
 * @author: Administrator
 * @date : 2016/12/5 0005
 * @Description:
 */
public class Boss {
    private Car car;
    private List favorites = new ArrayList();
    private Map jobs = new HashMap();
    private Properties mails = new Properties();


    public void setCar(Car car){
        this.car = car;
    }

    public List getFavorites() {
        return favorites;
    }

    public void setFavorites(List favorites) {
        this.favorites = favorites;
    }

    public Map getJobs() {
        return jobs;
    }

    public void setJobs(Map jobs) {
        this.jobs = jobs;
    }

    public Properties getMails() {
        return mails;
    }

    public void setMails(Properties mails) {
        this.mails = mails;
    }
}
