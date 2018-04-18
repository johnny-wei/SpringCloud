package com.lychr.marketfeign.bean;


import java.util.Date;

public class TShoppingcart {
    private Integer shoppingcartid;

    private Integer userid;

    private Integer goodscount;

    private Integer goodsdetailid;

    private Integer supplierid;

    private Date createtime;

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    public Integer getShoppingcartid() {
        return shoppingcartid;
    }

    public void setShoppingcartid(Integer shoppingcartid) {
        this.shoppingcartid = shoppingcartid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getGoodscount() {
        return goodscount;
    }

    public void setGoodscount(Integer goodscount) {
        this.goodscount = goodscount;
    }

    public Integer getGoodsdetailid() {
        return goodsdetailid;
    }

    public void setGoodsdetailid(Integer goodsdetailid) {
        this.goodsdetailid = goodsdetailid;
    }
}