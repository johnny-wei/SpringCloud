package com.lychr.marketfeign.bean;

/**
 * @Atuthor:weiyong
 * @Description:支付结果
 * @Date:2017/12/27
 */
public class PayResultView {
    private String payorderid;
    private String name;
    private String paymethod;
    private int payamount;
    private String tradetime;

    public String getPayorderid() {
        return payorderid;
    }

    public void setPayorderid(String payorderid) {
        this.payorderid = payorderid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPaymethod() {
        return paymethod;
    }

    public void setPaymethod(String paymethod) {
        this.paymethod = paymethod;
    }

    public int getPayamount() {
        return payamount;
    }

    public void setPayamount(int payamount) {
        this.payamount = payamount;
    }

    public String getTradetime() {
        return tradetime;
    }

    public void setTradetime(String tradetime) {
        this.tradetime = tradetime;
    }
}
