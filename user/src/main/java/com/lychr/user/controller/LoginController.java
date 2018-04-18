package com.lychr.user.controller;

import com.lychr.marketfeign.bean.JsonStringUtil;
import com.lychr.marketfeign.bean.TUser;
import com.lychr.user.service.UserService;
import com.lychr.utils.Base64Util;
import com.lychr.utils.RSAKey;
import com.lychr.utils.RSAUtil;
import com.lychr.utils.SecurityUtil;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/login")
public class LoginController {
    private Logger LOG = LoggerFactory.getLogger(LoginController.class);
    @Autowired
    private UserService userService;

    //手机号密码登陆
    @RequestMapping(value = "/loginWithPassword", method = RequestMethod.POST)
    @ResponseBody
    public String loginWithPssword(@RequestParam("mobile") String mobile, @RequestParam("password") String password) throws Exception {
        String relmob = new String(RSAUtil.decryptByPrivateKeyForSpilt(Base64Util.decode(mobile), Base64Util.decode(RSAKey.LOGIN_PRIVATEKEY)));
        String relpassword = new String(RSAUtil.decryptByPrivateKeyForSpilt(Base64Util.decode(password), Base64Util.decode(RSAKey.LOGIN_PRIVATEKEY)));
        String passwordmd5str = SecurityUtil.MD5Encode(relpassword,"UTF-8");
        List<TUser> loginresult = userService.loginWithMobileAndPassword(relmob, passwordmd5str);
        if (loginresult.size() == 1) {
//            //登陆成功，将用户信息存入redis据
//            TUser user = loginresult.get(0);
//            String sessionid = getUserSessionid();
//            jedisUtil.setString(sessionid, JSON.toJSONString(user));
//            //如果有密码，那肯定是正式用户或测试账户
            return JsonStringUtil.generateJsonString("0", "登陆成功");
        } else {
            return JsonStringUtil.generateJsonString("1", "手机号或密码错误");
        }
    }


}
