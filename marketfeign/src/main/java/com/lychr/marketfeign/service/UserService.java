package com.lychr.marketfeign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Atuthor:weiyong
 * @Description:
 * @Date:2018/4/16
 */
@FeignClient("service-user")
public interface UserService {
    @RequestMapping(value = "/login/loginWithPassword",method = RequestMethod.POST)
    String loginWithPassword(@RequestParam("mobile")String mobile,@RequestParam("password")String password);

}
