package com.aijiao.core.controller;

import com.aijiao.core.model.User;
import com.aijiao.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 25858 on 2017/5/13.
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findUser")
    public String findByid() {
        User user = userService.findUserById(1);
        System.out.println("打印:"+user.getUserName());
        return "index";
    }

}
