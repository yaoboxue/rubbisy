package com.yaoboxue.rubbish_user.controller;


import com.yaoboxue.rubbish_user.bean.UmsMember;
import com.yaoboxue.rubbish_user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {


    @Autowired
    UserService userService;

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        List<UmsMember>UmsMember = userService.getAllUser();
        return UmsMember;
    }

    @RequestMapping("index")
    @ResponseBody
     public String index(){
        return "hello user";
    }
}
