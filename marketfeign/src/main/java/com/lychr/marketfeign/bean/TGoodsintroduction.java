package com.lychr.marketfeign.bean;

import java.util.Date;

public class TGoodsintroduction {
    private Integer goodsintroductionid;

    private Integer fakeid;

    private Integer goodsid;

    private String introduce;

    private String videourl;

    private String type;

    private Date createtime;

    private String videothumb;

    private Integer status;

    private Date pushtime;

    private Date offlinetime;

    private String pictures;

    public Integer getGoodsintroductionid() {
        return goodsintroductionid;
    }

    public void setGoodsintroductionid(Integer goodsintroductionid) {
        this.goodsintroductionid = goodsintroductionid;
    }

    public Integer getFakeid() {
        return fakeid;
    }

    public void setFakeid(Integer fakeid) {
        this.fakeid = fakeid;
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
        this.introduce = introduce == null ? null : introduce.trim();
    }

    public String getVideourl() {
        return videourl;
    }

    public void setVideourl(String videourl) {
        this.videourl = videourl == null ? null : videourl.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getVideothumb() {
        return videothumb;
    }

    public void setVideothumb(String videothumb) {
        this.videothumb = videothumb == null ? null : videothumb.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getPushtime() {
        return pushtime;
    }

    public void setPushtime(Date pushtime) {
        this.pushtime = pushtime;
    }

    public Date getOfflinetime() {
        return offlinetime;
    }

    public void setOfflinetime(Date offlinetime) {
        this.offlinetime = offlinetime;
    }

    public String getPictures() {
        return pictures;
    }

    public void setPictures(String pictures) {
        this.pictures = pictures == null ? null : pictures.trim();
    }
}