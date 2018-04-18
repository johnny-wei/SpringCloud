package com.lychr.marketfeign.bean;

import java.util.Date;

public class TTradedetail {
    private Integer tradedetailid;

    private Integer accountid;

    private Integer amount;

    private Integer inorout;

    private Date tradetime;

    private String orderid;

    private String mark;

    private Integer status;

    private Integer fee;

    private Integer bankcardid;

    public Integer getBankcardid() {
        return bankcardid;
    }

    public void setBankcardid(Integer bankcardid) {
        this.bankcardid = bankcardid;
    }

    public Integer getFee() {
        return fee;
    }

    public void setFee(Integer fee) {
        this.fee = fee;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getTradedetailid() {
        return tradedetailid;
    }

    public void setTradedetailid(Integer tradedetailid) {
        this.tradedetailid = tradedetailid;
    }

    public Integer getAccountid() {
        return accountid;
    }

    public void setAccountid(Integer accountid) {
        this.accountid = accountid;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getInorout() {
        return inorout;
    }

    public void setInorout(Integer inorout) {
        this.inorout = inorout;
    }

    public Date getTradetime() {
        return tradetime;
    }

    public void setTradetime(Date tradetime) {
        this.tradetime = tradetime;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }
}