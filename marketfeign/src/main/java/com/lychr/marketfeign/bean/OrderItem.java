package com.lychr.marketfeign.bean;

import java.util.List;

public class OrderItem{
    public int skuid;
    public int count;
    public int goodsid;
    public String goodspic;
    public int price;
    public String goodsdesc;//商品描述
    public Integer skustatus;
    public Integer isreggoods;

    public Integer getIsreggoods() {
        return isreggoods;
    }

    public void setIsreggoods(Integer isreggoods) {
        this.isreggoods = isreggoods;
    }

    public Integer getSkustatus() {
        return skustatus;
    }

    public void setSkustatus(Integer skustatus) {
        this.skustatus = skustatus;
    }

    public List<GoodsPropertySimpleView> properties;

    public int getSkuid() {
        return skuid;
    }

    public void setSkuid(int skuid) {
        this.skuid = skuid;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(int goodsid) {
        this.goodsid = goodsid;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getGoodspic() {
        return goodspic;
    }

    public void setGoodspic(String goodspic) {
        this.goodspic = goodspic;
    }

    public String getGoodsdesc() {
        return goodsdesc;
    }

    public void setGoodsdesc(String goodsdesc) {
        this.goodsdesc = goodsdesc;
    }

    public List<GoodsPropertySimpleView> getProperties() {
        return properties;
    }

    public void setProperties(List<GoodsPropertySimpleView> properties) {
        this.properties = properties;
    }
}
