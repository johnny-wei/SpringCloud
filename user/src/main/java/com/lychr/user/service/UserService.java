package com.lychr.user.service;


import com.lychr.marketfeign.bean.TUser;
import com.lychr.marketfeign.bean.TUserdetail;
import com.lychr.marketfeign.bean.UserInfo;

import java.util.List;

public interface UserService {
    //条件查找
    List<TUser> queryUserByExample(TUser user);
    //根据用户id获取用户信息
    TUser queryUserByUserId(Integer userid);
    //手机号密码登陆
    List<TUser> loginWithMobileAndPassword(String mobile, String password);

    //根据手机号查询用户
    List<TUser> queryByMobile(String mobile);
    //根据手机号查询用户
    TUser queryUserByMobile(String mobile);
    //初步设置用户信息
    int updateUserSimpleInfo(TUser user, TUserdetail userdetail);

    //根据邀请码查询用户
    List<TUserdetail> queryByInviteCode(String code);

    //在校验邀请码后，添加临时用户
    boolean addTempUser(String mob, String invitecode);

    //获取用户详细信息
    UserInfo queryUserinfosByExample(int userid);

    //重置密码
    int resetUserPassword(String mobile, String newpassword);

    //修改密码
    int modifyUserPassword(TUser user);

    //修改用户信息
    int modifyUserInfoByUserId(TUserdetail userdetail);


    //修改用户基本信息
    int modifyUserInfo(TUser user);

}
