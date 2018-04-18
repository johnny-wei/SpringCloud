package com.lychr.marketfeign.bean;

import java.util.Date;

public class TGoods {
    private Integer goodsid;

    private Integer goodsclassid;

    private String number;

    private Integer status;

    private Integer supplierid;

    private Integer faretemplateid;

    private Date addtime;

    private String goodsdescription;

    private Integer isreggoods;

    public Integer getIsreggoods() {
        return isreggoods;
    }

    public void setIsreggoods(Integer isreggoods) {
        this.isreggoods = isreggoods;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public Integer getGoodsclassid() {
        return goodsclassid;
    }

    public void setGoodsclassid(Integer goodsclassid) {
        this.goodsclassid = goodsclassid;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    public Integer getFaretemplateid() {
        return faretemplateid;
    }

    public void setFaretemplateid(Integer faretemplateid) {
        this.faretemplateid = faretemplateid;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getGoodsdescription() {
        return goodsdescription;
    }

    public void setGoodsdescription(String goodsdescription) {
        this.goodsdescription = goodsdescription == null ? null : goodsdescription.trim();
    }
}