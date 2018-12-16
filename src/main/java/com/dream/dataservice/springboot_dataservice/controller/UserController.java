package com.dream.dataservice.springboot_dataservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dream.dataservice.springboot_dataservice.bean.UserBean;
import com.dream.dataservice.springboot_dataservice.service.IUserService;

@Controller
@RequestMapping(value = "/user")
public class UserController
{
    @Autowired
    IUserService userService;
    
    @ResponseBody
    @GetMapping("/selectUsers")
    public List<UserBean> selectUsers()
    {
        List<UserBean> list = userService.selectUsers();
        return list;
    }
}
