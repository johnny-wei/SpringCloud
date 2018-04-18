package com.lychr.marketfeign.bean;

import java.util.List;

/**
 * @Atuthor:weiyong
 * @Description:未支付订单展示
 * @Date:2017/12/28
 */
public class OrderView {
    private String orderid;//订单id
    private int status;//订单状态 0未支付 1待发货 2待收货
    private int price;//价格
    private String batchpayid;//批量支付id
    private String supplier;//供应商
    private List<OrderItem> items;//订单信息

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBatchpayid() {
        return batchpayid;
    }

    public void setBatchpayid(String batchpayid) {
        this.batchpayid = batchpayid;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }
}

