package com.lychr.marketfeign.bean;

import java.util.List;

/**
 * @Atuthor:weiyong
 * @Description:购物车商品展示模型
 * @Date:2017/12/25
 */
public class ShopCartGoodsModel {
    public Integer skuid;
    public Integer goodsid;
    public Integer skustatus;
    public int price;
    public int count;
    public int shoppingcartid;
    public String goodspic;
    public String goodsdesc;//商品描述
    public int supplierid;//供应商id
    public List<GoodsPropertySimpleView> properties;

    public Integer getSkustatus() {
        return skustatus;
    }

    public void setSkustatus(Integer skustatus) {
        this.skustatus = skustatus;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public int getShoppingcartid() {
        return shoppingcartid;
    }

    public void setShoppingcartid(int shoppingcartid) {
        this.shoppingcartid = shoppingcartid;
    }

    public int getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(int supplierid) {
        this.supplierid = supplierid;
    }

    public String getGoodsdesc() {
        return goodsdesc;
    }

    public void setGoodsdesc(String goodsdesc) {
        this.goodsdesc = goodsdesc;
    }

    public String getGoodspic() {
        return goodspic;
    }

    public void setGoodspic(String goodspic) {
        this.goodspic = goodspic;
    }


    public Integer getSkuid() {
        return skuid;
    }

    public void setSkuid(Integer skuid) {
        this.skuid = skuid;
    }

    public int getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List getProperties() {
        return properties;
    }

    public void setProperties(List properties) {
        this.properties = properties;
    }
}
