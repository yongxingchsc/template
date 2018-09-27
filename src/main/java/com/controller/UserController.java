package com.controller;

import com.entity.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping("/")
    public String ajax() {
        return "user/user";
    }

    @RequestMapping("/userlist")
    @ResponseBody
    public List<User> userList(){
        List<User> baseDictWithTypeCode = userService.findBaseDictWithTypeCode("yang");

        return baseDictWithTypeCode;
    }
}
