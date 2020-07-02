package com.example.demo.service;


import com.example.demo.entity.Login;

import java.util.List;
public interface LoginService {
     List<Login> getAllLogin();

     boolean checkExistUid(int uid);//检查用户名

     boolean checkPasswd(int uid, String passwd);//检查用户名密码是否匹配

}
