package com.dream.dataservice.springboot_dataservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dream.dataservice.springboot_dataservice.bean.UserBean;
import com.dream.dataservice.springboot_dataservice.dao.IUserDao;
import com.dream.dataservice.springboot_dataservice.service.IUserService;

@Service
public class IUserServiceImpl implements IUserService
{
    @Autowired
    IUserDao userdao;
    
    @Override
    public List<UserBean> selectUsers()
    {
        return userdao.selectUsers();
    }
    
}
