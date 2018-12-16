package com.dream.dataservice.springboot_dataservice.service;

import java.util.List;

import com.dream.dataservice.springboot_dataservice.bean.UserBean;

public interface IUserService
{
    List<UserBean> selectUsers();
}
