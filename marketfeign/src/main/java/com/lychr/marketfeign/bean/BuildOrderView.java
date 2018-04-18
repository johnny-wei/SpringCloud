package com.lychr.marketfeign.bean;

import java.util.List;

/**
 * @Atuthor:weiyong
 * @Description:下单参数
 * @Date:2018/1/5
 */
public class BuildOrderView {
    //订单内容
    List<BuildOrderItem> orderitems;
    //备注
    public String mark;
    //优惠卷id
    public int preferentialID;
    //收货地址id
    public int addressid;
    //运费金额
    public int freightAmount;
    //优惠金额
    public int cheapamount;
    //实付金额
    public int realpayamount;

    public int getRealpayamount() {
        return realpayamount;
    }

    public int getCheapamount() {
        return cheapamount;
    }

    public void setCheapamount(int cheapamount) {
        this.cheapamount = cheapamount;
    }

    public void setRealpayamount(int realpayamount) {
        this.realpayamount = realpayamount;
    }

    public List<BuildOrderItem> getOrderitems() {
        return orderitems;
    }

    public void setOrderitems(List<BuildOrderItem> orderitems) {
        this.orderitems = orderitems;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getPreferentialID() {
        return preferentialID;
    }

    public void setPreferentialID(int preferentialID) {
        this.preferentialID = preferentialID;
    }

    public int getAddressid() {
        return addressid;
    }

    public void setAddressid(int addressid) {
        this.addressid = addressid;
    }

    public int getFreightAmount() {
        return freightAmount;
    }

    public void setFreightAmount(int freightAmount) {
        this.freightAmount = freightAmount;
    }
}
