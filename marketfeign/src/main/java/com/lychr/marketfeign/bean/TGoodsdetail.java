package com.lychr.marketfeign.bean;

public class TGoodsdetail {
    private Integer goodsdetailid;

    private Integer goodsid;

    private String sku;

    private Integer status;

    private Integer inventory;

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getGoodsdetailid() {
        return goodsdetailid;
    }

    public void setGoodsdetailid(Integer goodsdetailid) {
        this.goodsdetailid = goodsdetailid;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku == null ? null : sku.trim();
    }
}