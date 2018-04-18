package com.lychr.marketfeign.controller;

import com.lychr.marketfeign.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Atuthor:weiyong
 * @Description:
 * @Date:2018/4/16
 */
@Controller
@RequestMapping("/login")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/loginWithPassword")
    @ResponseBody
    public String loginWithPassword(@RequestParam("mobile")String mobile,@RequestParam("password") String password){
        return userService.loginWithPassword(mobile,password);
    }
}
