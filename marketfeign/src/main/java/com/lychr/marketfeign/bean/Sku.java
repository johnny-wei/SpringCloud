package com.lychr.marketfeign.bean;


import java.util.HashMap;

/**
 * @Atuthor:weiyong
 * @Description:
 * @Date:2017/12/14
 */
public class Sku {
    private String picUrl;
    private int cost;
    private int marketPrice;
    private int professionalPrice;
    private int goldPrice;
    private int generalPrice;
    private int inventory;
    //sku属性
    public HashMap<TGoodsproperty,TGoodspropertydetail> properties;

    public HashMap<TGoodsproperty, TGoodspropertydetail> getProperties() {
        return properties;
    }

    public void setProperties(HashMap<TGoodsproperty, TGoodspropertydetail> properties) {
        this.properties = properties;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(int marketPrice) {
        this.marketPrice = marketPrice;
    }

    public int getProfessionalPrice() {
        return professionalPrice;
    }

    public void setProfessionalPrice(int professionalPrice) {
        this.professionalPrice = professionalPrice;
    }

    public int getGoldPrice() {
        return goldPrice;
    }

    public void setGoldPrice(int goldPrice) {
        this.goldPrice = goldPrice;
    }

    public int getGeneralPrice() {
        return generalPrice;
    }

    public void setGeneralPrice(int generalPrice) {
        this.generalPrice = generalPrice;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }
}
