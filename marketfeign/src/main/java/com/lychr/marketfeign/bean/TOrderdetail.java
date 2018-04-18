package com.lychr.marketfeign.bean;

public class TOrderdetail {
    private Integer orderdetailid;

    private String orderid;

    private Integer goodsdetailid;

    private Integer goodscount;

    private Integer unitprice;

    private Integer aprice;

    private Integer bprice;

    private Integer cprice;

    public Integer getAprice() {
        return aprice;
    }

    public void setAprice(Integer aprice) {
        this.aprice = aprice;
    }

    public Integer getBprice() {
        return bprice;
    }

    public void setBprice(Integer bprice) {
        this.bprice = bprice;
    }

    public Integer getCprice() {
        return cprice;
    }

    public void setCprice(Integer cprice) {
        this.cprice = cprice;
    }

    public Integer getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(Integer unitprice) {
        this.unitprice = unitprice;
    }

    public Integer getOrderdetailid() {
        return orderdetailid;
    }

    public void setOrderdetailid(Integer orderdetailid) {
        this.orderdetailid = orderdetailid;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public Integer getGoodsdetailid() {
        return goodsdetailid;
    }

    public void setGoodsdetailid(Integer goodsdetailid) {
        this.goodsdetailid = goodsdetailid;
    }

    public Integer getGoodscount() {
        return goodscount;
    }

    public void setGoodscount(Integer goodscount) {
        this.goodscount = goodscount;
    }
}