package com.dream.dataservice.springboot_dataservice.dao;

import java.util.List;

import com.dream.dataservice.springboot_dataservice.bean.UserBean;

public interface IUserDao
{
    List<UserBean> selectUsers();
}
