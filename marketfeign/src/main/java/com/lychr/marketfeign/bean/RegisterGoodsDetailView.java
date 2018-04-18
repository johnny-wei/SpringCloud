package com.lychr.marketfeign.bean;

import java.util.List;

/**
 * @Atuthor:weiyong
 * @Description:注册商品详情
 * @Date:2018/1/8
 */
public class RegisterGoodsDetailView {
    private String pic;
    private String goodsdesc;
    private int price;
    private Integer supplier;
    public List<GoodsPropertySimpleView> properties;

    public Integer getSupplier() {
        return supplier;
    }

    public void setSupplier(Integer supplier) {
        this.supplier = supplier;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getGoodsdesc() {
        return goodsdesc;
    }

    public void setGoodsdesc(String goodsdesc) {
        this.goodsdesc = goodsdesc;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<GoodsPropertySimpleView> getProperties() {
        return properties;
    }

    public void setProperties(List<GoodsPropertySimpleView> properties) {
        this.properties = properties;
    }
}
