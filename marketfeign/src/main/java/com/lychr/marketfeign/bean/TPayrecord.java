package com.lychr.marketfeign.bean;

import java.util.Date;

public class TPayrecord {
    private String batchpayid;

    private String orderids;

    private Integer userid;

    private Date createtime;

    private Integer realpayamount;

    private String extsorderid;

    private String paymethod;

    private Date resulttime;

    private String receiver;

    private Integer status;

    private String searchwords;

    public String getSearchwords() {
        return searchwords;
    }

    public void setSearchwords(String searchwords) {
        this.searchwords = searchwords;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getBatchpayid() {
        return batchpayid;
    }

    public void setBatchpayid(String batchpayid) {
        this.batchpayid = batchpayid == null ? null : batchpayid.trim();
    }

    public String getOrderids() {
        return orderids;
    }

    public void setOrderids(String orderids) {
        this.orderids = orderids == null ? null : orderids.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getRealpayamount() {
        return realpayamount;
    }

    public void setRealpayamount(Integer realpayamount) {
        this.realpayamount = realpayamount;
    }

    public String getExtsorderid() {
        return extsorderid;
    }

    public void setExtsorderid(String extsorderid) {
        this.extsorderid = extsorderid == null ? null : extsorderid.trim();
    }

    public String getPaymethod() {
        return paymethod;
    }

    public void setPaymethod(String paymethod) {
        this.paymethod = paymethod == null ? null : paymethod.trim();
    }

    public Date getResulttime() {
        return resulttime;
    }

    public void setResulttime(Date resulttime) {
        this.resulttime = resulttime;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver == null ? null : receiver.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}