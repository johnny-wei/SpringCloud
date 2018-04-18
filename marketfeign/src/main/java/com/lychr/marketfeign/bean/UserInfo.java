package com.lychr.marketfeign.bean;


import java.util.Date;

/**
 * @Atuthor:weiyong
 * @Description:用户详细信息
 * @Date:2017/12/1
 */
public class UserInfo {
    private Integer userid;

    private Integer userdetailid;

    private int myprofit;

    private String password;

    private String level;

    private String inviterid;

    private String superior;

    private String telnum;

    private String status;

    private String nickname;

    private Date birthday;

    private String gender;

    private String region;

    private String invitationid;

    private String wechatqr;

    private String headpic;

    private TAddress defaultaddress;

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

    public Integer getUserdetailid() {
        return userdetailid;
    }

    public void setUserdetailid(Integer userdetailid) {
        this.userdetailid = userdetailid;
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

    public TAddress getDefaultaddress() {
        return defaultaddress;
    }

    public void setDefaultaddress(TAddress defaultaddress) {
        this.defaultaddress = defaultaddress;
    }

    public int getMyprofit() {
        return myprofit;
    }

    public void setMyprofit(int myprofit) {
        this.myprofit = myprofit;
    }

    public String getHeadpic() {
        return headpic;
    }

    public void setHeadpic(String headpic) {
        this.headpic = headpic;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getInviterid() {
        return inviterid;
    }

    public void setInviterid(String inviterid) {
        this.inviterid = inviterid;
    }

    public String getSuperior() {
        return superior;
    }

    public void setSuperior(String superior) {
        this.superior = superior;
    }

    public String getTelnum() {
        return telnum;
    }

    public void setTelnum(String telnum) {
        this.telnum = telnum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
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
        this.gender = gender;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getInvitationid() {
        return invitationid;
    }

    public void setInvitationid(String invitationid) {
        this.invitationid = invitationid;
    }

    public String getWechatqr() {
        return wechatqr;
    }

    public void setWechatqr(String wechatqr) {
        this.wechatqr = wechatqr;
    }
}
