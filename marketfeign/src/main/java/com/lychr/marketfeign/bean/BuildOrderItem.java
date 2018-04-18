package com.lychr.marketfeign.bean;

import java.util.Map;

//下单参数
public class BuildOrderItem {
    //供应商id
    public int supplierid;
    //数量
    public Map<String,Integer> goodsdetailcount;
    //单价
    public Map<String,Integer> goodsdetailprice;
    //商品共计金额
    public int productamount;

    public int getProductamount() {
        return productamount;
    }

    public void setProductamount(int productamount) {
        this.productamount = productamount;
    }


    public Map<String, Integer> getGoodsdetailcount() {
        return goodsdetailcount;
    }

    public void setGoodsdetailcount(Map<String, Integer> goodsdetailcount) {
        this.goodsdetailcount = goodsdetailcount;
    }

    public Map<String, Integer> getGoodsdetailprice() {
        return goodsdetailprice;
    }

    public void setGoodsdetailprice(Map<String, Integer> goodsdetailprice) {
        this.goodsdetailprice = goodsdetailprice;
    }

    public int getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(int supplierid) {
        this.supplierid = supplierid;
    }

}
