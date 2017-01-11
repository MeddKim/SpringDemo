package com.med.domain;

import java.io.Serializable;
import java.util.Date;

public class LoginLog implements Serializable {
    private Integer loginLogId;

    private Integer userId;

    private String ip;

    private Date loginDatetime;

    private static final long serialVersionUID = 1L;

    public Integer getLoginLogId() {
        return loginLogId;
    }

    public void setLoginLogId(Integer loginLogId) {
        this.loginLogId = loginLogId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Date getLoginDatetime() {
        return loginDatetime;
    }

    public void setLoginDatetime(Date loginDatetime) {
        this.loginDatetime = loginDatetime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", loginLogId=").append(loginLogId);
        sb.append(", userId=").append(userId);
        sb.append(", ip=").append(ip);
        sb.append(", loginDatetime=").append(loginDatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}