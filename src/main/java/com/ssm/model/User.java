package com.ssm.model;

import java.util.Date;

/**
 *   `uid` int(11) NOT NULL AUTO_INCREMENT,
 *   `uname` varchar(255) DEFAULT NULL,
 *   `upwd` varchar(255) DEFAULT NULL,
 *   `sex` char(5) DEFAULT NULL,
 *   `birthday` date DEFAULT NULL,
 *   `money` double(255,0) DEFAULT NULL,
 *   PRIMARY KEY (`uid`)
 */
public class User {
    private Integer uid;
    private String uname;
    private String upwd;
    private String sex;
    private Date birthday;
    private Double money;


    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", upwd='" + upwd + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", money=" + money +
                '}';
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
