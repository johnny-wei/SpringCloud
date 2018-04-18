package com.lychr.marketfeign.bean;

/**
 * @Atuthor:weiyong
 * @Description:库存价格
 * @Date:2017/12/20
 */
public class StockPriceImageUrlView {
    private int goodsdetailId;
    private int cost;
    private int marketPrice;
    private int professionalPrice;
    private int goldPrice;
    private int generalPrice;
    private int inventory;
    private String pic;

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public int getGoodsdetailId() {
        return goodsdetailId;
    }

    public void setGoodsdetailId(int goodsdetailId) {
        this.goodsdetailId = goodsdetailId;
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
