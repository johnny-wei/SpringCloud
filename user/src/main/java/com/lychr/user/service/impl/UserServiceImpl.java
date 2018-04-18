package com.lychr.user.service.impl;

import ch.qos.logback.core.util.FileUtil;
import com.lychr.marketfeign.bean.TUser;
import com.lychr.marketfeign.bean.TUserdetail;
import com.lychr.marketfeign.bean.UserInfo;
import com.lychr.user.dao.TUserMapper;
import com.lychr.user.dao.TUserdetailMapper;
import com.lychr.user.service.UserService;
import com.lychr.utils.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private Logger LOG = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private TUserMapper usermapper;
    @Autowired
    private TUserdetailMapper tuserdetailmapper;
//    @Autowired
//    public FileUtil fileUtil;
//    @Autowired
//    private ConfigKit configKit;

    @Override
    public List<TUser> queryUserByExample(TUser user) {
        return usermapper.queryUserByExample(user);
    }

    @Override
    public List<TUser> loginWithMobileAndPassword(String mobile, String password) {
        TUser user = new TUser();
        user.setTelnum(mobile);
        user.setPassword(password);
        user.setStatus("1");
        List<TUser> result = usermapper.queryUserByExample(user);
        return result;
    }

    @Override
    public List<TUser> queryByMobile(String mobile) {
        TUser user = new TUser();
        user.setTelnum(mobile);
        List<TUser> result = usermapper.queryUserByExample(user);
        return result;
    }

    @Override
    @Transactional
    public int updateUserSimpleInfo(TUser user, TUserdetail userdetail) {
        TUser tempUser = new TUser();
        tempUser.setUserid(user.getUserid());
        List<TUser> list = usermapper.queryUserByExample(tempUser);
        if (list.size() == 1) {
            usermapper.updateByPrimaryKeySelective(user);
            tuserdetailmapper.updateUserDetailInfoByUserId(userdetail);
            return 1;
        } else {
            //基本不会到这来
            LOG.error("用户信息丢失或手机号重复");
            return 0;
        }

    }

    @Override
    public List<TUserdetail> queryByInviteCode(String code) {
        TUserdetail user = new TUserdetail();
        user.setInvitationid(code);
        List<TUserdetail> result = tuserdetailmapper.queryUserOtherInfoByUExample(user);
        return result;
    }

    @Override
    @Transactional
    public boolean addTempUser(String mob, String invitecode) {
        TUser user = usermapper.selectUserByMobile(mob);
        if (user != null) {
            //之前注册过，但不成功
            user.setInviterid(invitecode);
            UserInfo inviterinfo = usermapper.selectByInviteCode(invitecode);
            if (inviterinfo.getLevel().equals("C")) {
                user.setSuperior(inviterinfo.getSuperior());
            } else {
                user.setSuperior(invitecode);
            }
            usermapper.updateByPrimaryKey(user);
            return true;
        }
        //获取邀请人信息
        UserInfo inviterinfo = usermapper.selectByInviteCode(invitecode);
        //新用户信息
        TUser newuser = new TUser();
        newuser.setTelnum(mob);
        newuser.setStatus("0");//0为临时用户
        newuser.setInviterid(invitecode);
        newuser.setLevel("C");//用户走注册渠道，等级默认为C
        if (!inviterinfo.getLevel().equals("C")) {
            //如果邀请他的人等级不为C，则设他为新人的上级
            newuser.setSuperior(invitecode);
        } else {
            //如果是C，则设新人的上级为邀请人的上级
            newuser.setSuperior(inviterinfo.getSuperior());
        }
        usermapper.insertSelective(newuser);
        //用户具体信息
        TUserdetail userdetail = new TUserdetail();
        userdetail.setUserid(newuser.getUserid());
        userdetail.setHipp(0);
        userdetail.setTdhipp(0);
        userdetail.setTmhipp(0);
        userdetail.setDirecthipp(0);
        //生成邀请码
        String newinvitecode = "";
        while (true) {
            newinvitecode = StringUtil.getCharAndNumr(8);
            List<TUserdetail> list = tuserdetailmapper.queryUserDetailByInviteCode(newinvitecode);
            if (list.size() == 0)
                break;
        }
        userdetail.setInvitationid(newinvitecode);
        tuserdetailmapper.insertSelective(userdetail);
        return true;
    }

    @Override
    public UserInfo queryUserinfosByExample(int userid) {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserid(userid);
        return usermapper.queryUserDetailInfoByExample(userInfo).get(0);
    }

    @Override
    public int resetUserPassword(String mobile, String newpassword) {
        TUser user = new TUser();
        user.setPassword(newpassword);
        user.setTelnum(mobile);
        return usermapper.updateUserInfoByTelNum(user);
    }

    @Override
    public int modifyUserPassword(TUser user) {
        return usermapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public int modifyUserInfoByUserId(TUserdetail userdetail) {
        if (userdetail.getUserid() == null) {
            LOG.error("修改个人信息，userid为空");
            return 0;
        }
        return tuserdetailmapper.updateUserDetailInfoByUserId(userdetail);
    }

    @Override
    public TUser queryUserByMobile(String mobile) {
        return usermapper.selectUserByMobile(mobile);
    }


    @Override
    public int modifyUserInfo(TUser user) {
        return usermapper.updateByPrimaryKeySelective(user);
    }


    @Override
    public TUser queryUserByUserId(Integer userid) {
        return usermapper.selectByPrimaryKey(userid);
    }
}
