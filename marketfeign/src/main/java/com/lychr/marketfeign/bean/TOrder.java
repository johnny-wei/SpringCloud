package com.lychr.marketfeign.bean;

import java.util.Date;

public class TOrder {
    private String orderid;

    private Integer userid;

    private Integer addressid;

    private Integer supplierid;

    private Integer totalamount;

    private Integer preferentialid;

    private Date ordertime;

    private Integer status;

    private Integer freightamount;

    private Integer cheapamount;

    private Integer productamount;

    private String paymethod;

    private Date paytime;

    private String mark;

    private Integer thischeapamount;

    private String batchpayid;

    private Integer isprofit;

    public Integer getIsprofit() {
        return isprofit;
    }

    public void setIsprofit(Integer isprofit) {
        this.isprofit = isprofit;
    }

    public String getBatchpayid() {
        return batchpayid;
    }

    public void setBatchpayid(String batchpayid) {
        this.batchpayid = batchpayid;
    }

    public Integer getThischeapamount() {
        return thischeapamount;
    }

    public void setThischeapamount(Integer thischeapamount) {
        this.thischeapamount = thischeapamount;
    }


    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getAddressid() {
        return addressid;
    }

    public void setAddressid(Integer addressid) {
        this.addressid = addressid;
    }

    public Integer getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(Integer totalamount) {
        this.totalamount = totalamount;
    }

    public Integer getPreferentialid() {
        return preferentialid;
    }

    public void setPreferentialid(Integer preferentialid) {
        this.preferentialid = preferentialid;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getFreightamount() {
        return freightamount;
    }

    public void setFreightamount(Integer freightamount) {
        this.freightamount = freightamount;
    }

    public Integer getCheapamount() {
        return cheapamount;
    }

    public void setCheapamount(Integer cheapamount) {
        this.cheapamount = cheapamount;
    }

    public Integer getProductamount() {
        return productamount;
    }

    public void setProductamount(Integer productamount) {
        this.productamount = productamount;
    }

    public String getPaymethod() {
        return paymethod;
    }

    public void setPaymethod(String paymethod) {
        this.paymethod = paymethod == null ? null : paymethod.trim();
    }

    public Date getPaytime() {
        return paytime;
    }

    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }
}