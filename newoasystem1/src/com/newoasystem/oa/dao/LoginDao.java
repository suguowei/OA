package com.newoasystem.oa.dao;

import com.newoasystem.oa.modle.Renyuandangan;

public interface LoginDao {
public Renyuandangan checkLogin(String xingming,String mima);//检验登录的用户名和密码是否一致
}
