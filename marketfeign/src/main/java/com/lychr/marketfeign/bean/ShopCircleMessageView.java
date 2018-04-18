package com.lychr.marketfeign.bean;

import java.util.Date;

/**
 * @Atuthor:weiyong
 * @Description:购物圈消息
 * @Date:2018/1/5
 */
public class ShopCircleMessageView {
    private Integer favorid;
    private Date favortime;
    private Integer managerid;
    private String headpic;
    private String nickname;
    private Integer goodsid;
    private String pictures;
    private String videothumb;
    private String introduce;
    private Integer goodsintroductionid;
    private String videourl;

    private String type;

    private Date createtime;

    public Integer getGoodsintroductionid() {
        return goodsintroductionid;
    }

    public void setGoodsintroductionid(Integer goodsintroductionid) {
        this.goodsintroductionid = goodsintroductionid;
    }

    public String getVideothumb() {
        return videothumb;
    }

    public void setVideothumb(String videothumb) {
        this.videothumb = videothumb;
    }

    public String getPictures() {
        return pictures;
    }

    public void setPictures(String pictures) {
        this.pictures = pictures;
    }

    public Integer getManagerid() {
        return managerid;
    }

    public Integer getFavorid() {
        return favorid;
    }

    public void setFavorid(Integer favorid) {
        this.favorid = favorid;
    }

    public Date getFavortime() {
        return favortime;
    }

    public void setFavortime(Date favortime) {
        this.favortime = favortime;
    }

    public void setManagerid(Integer managerid) {
        this.managerid = managerid;
    }

    public String getHeadpic() {
        return headpic;
    }

    public void setHeadpic(String headpic) {
        this.headpic = headpic;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getVideourl() {
        return videourl;
    }

    public void setVideourl(String videourl) {
        this.videourl = videourl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}
