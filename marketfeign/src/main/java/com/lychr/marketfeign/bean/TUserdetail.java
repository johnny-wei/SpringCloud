package com.lychr.marketfeign.bean;

import java.util.Date;

public class TUserdetail {
    private Integer userdetailid;

    private Integer userid;

    private String nickname;

    private Date birthday;

    private String gender;

    private String region;

    private String invitationid;

    private String wechatqr;

    private String headpic;

    private Integer tdhipp;

    private Integer tmhipp;

    private Integer hipp;

    private Integer directhipp;

    public Integer getDirecthipp() {
        return directhipp;
    }

    public void setDirecthipp(Integer directhipp) {
        this.directhipp = directhipp;
    }

    public Integer getTdhipp() {
        return tdhipp;
    }

    public void setTdhipp(Integer tdhipp) {
        this.tdhipp = tdhipp;
    }

    public Integer getTmhipp() {
        return tmhipp;
    }

    public void setTmhipp(Integer tmhipp) {
        this.tmhipp = tmhipp;
    }

    public Integer getHipp() {
        return hipp;
    }

    public void setHipp(Integer hipp) {
        this.hipp = hipp;
    }


    public Integer getUserdetailid() {
        return userdetailid;
    }

    public void setUserdetailid(Integer userdetailid) {
        this.userdetailid = userdetailid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public String getInvitationid() {
        return invitationid;
    }

    public void setInvitationid(String invitationid) {
        this.invitationid = invitationid == null ? null : invitationid.trim();
    }

    public String getWechatqr() {
        return wechatqr;
    }

    public void setWechatqr(String wechatqr) {
        this.wechatqr = wechatqr == null ? null : wechatqr.trim();
    }

    public String getHeadpic() {
        return headpic;
    }

    public void setHeadpic(String headpic) {
        this.headpic = headpic == null ? null : headpic.trim();
    }

}