package com.lychr.user.dao;

import com.lychr.marketfeign.bean.TUserdetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TUserdetailMapper {

    int insertSelective(TUserdetail record);

    TUserdetail selectByPrimaryKey(Integer userdetailid);

    int updateByPrimaryKeySelective(TUserdetail record);

    int updateUserDetailInfoByUserId(TUserdetail userDetail);

    List<TUserdetail> queryUserOtherInfoByUExample(TUserdetail tUserdetail);

    //根据邀请码查询用户
    List<TUserdetail> queryUserDetailByInviteCode(@Param("invitecode") String invitecode);

}