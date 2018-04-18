package com.lychr.user.dao;

import com.lychr.marketfeign.bean.UserInfo;
import com.lychr.marketfeign.bean.TUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TUserMapper {
    int insertSelective(TUser record);

    TUser selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);

    //根据条件查询用户
    List<TUser> queryUserByExample(TUser user);

    //查询用户详细信息
    List<UserInfo> queryUserDetailInfoByExample(UserInfo uinfo);

    //更新用户信息
    int updateUserInfoByTelNum(TUser user);

    //根据邀请码查询用户信息
    UserInfo selectByInviteCode(@Param("invitecode") String invitecode);

    //根据手机号查询用户
    TUser selectUserByMobile(@Param("telnum") String mobile);

}