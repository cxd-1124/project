package com.example.demo.entity;


import lombok.Data;
@Data

public class Login {
    private Integer uid;//用户名
    private String passwd;//密码


    public void setUid(Integer uid) {
        this.uid = uid;
    }//修改用户名

    public Integer getUid() {
        return uid;
    }//读取用户名

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }//修改密码

    public String getPasswd() {
        return passwd;
    }//读取密码
}
