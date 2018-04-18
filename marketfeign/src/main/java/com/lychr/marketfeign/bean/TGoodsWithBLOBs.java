package com.lychr.marketfeign.bean;

public class TGoodsWithBLOBs extends TGoods {
    private String goodsdetails;
    private String pictures;

    /***************************/
    public String getGoodsdetails() {
        return goodsdetails;
    }

    public void setGoodsdetails(String goodsdetails) {
        this.goodsdetails = goodsdetails == null ? null : goodsdetails.trim();
    }

    public String getPictures() {
        return pictures;
    }

    public void setPictures(String pictures) {
        this.pictures = pictures;
    }
}