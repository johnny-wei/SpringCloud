package com.lychr.marketfeign.bean;


import java.util.List;
import java.util.Map;

/**
 * @Atuthor:weiyong
 * @Description:商品详细信息
 * @Date:2017/12/15
 */
public class GoodsDetailView {
    //商品编号
    private String goodsno;
    //轮播图json
    private String pictures;
    //供应商信息
    private TSupplier supplier;
    //商品简单描述
    private String simpledescription;
    //商家信息(优惠卷)todo
    private String preferentialinfo;
    //默认价格
    private int defaultprice;
    //默认图片
    private String defaultpic;
    //默认金牌买手价
    private int defaultgoldprice;
    //默认专业买手价
    private int defaultproprice;
    //默认普通买手价
    private int defaultgenprice;
    //默认市场零售价
    private int defaultmarketprice;
    //属性
    private List<GoodsPropertyView> goodsproperties;
    //运费信息
    private String fareinfo;
    //商品图文详情
    private String goodsImagesAndDetailInfo;
    //库存匹配用map
    private Map<String,StockPriceImageUrlView> matchmap;
    //商品状态
    private int status;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getDefaultgoldprice() {
        return defaultgoldprice;
    }

    public void setDefaultgoldprice(int defaultgoldprice) {
        this.defaultgoldprice = defaultgoldprice;
    }

    public int getDefaultproprice() {
        return defaultproprice;
    }

    public void setDefaultproprice(int defaultproprice) {
        this.defaultproprice = defaultproprice;
    }

    public int getDefaultgenprice() {
        return defaultgenprice;
    }

    public void setDefaultgenprice(int defaultgenprice) {
        this.defaultgenprice = defaultgenprice;
    }

    public int getDefaultmarketprice() {
        return defaultmarketprice;
    }

    public void setDefaultmarketprice(int defaultmarketprice) {
        this.defaultmarketprice = defaultmarketprice;
    }

    public int getDefaultprice() {
        return defaultprice;
    }

    public void setDefaultprice(int defaultprice) {
        this.defaultprice = defaultprice;
    }

    public String getDefaultpic() {
        return defaultpic;
    }

    public void setDefaultpic(String defaultpic) {
        this.defaultpic = defaultpic;
    }

    public String getGoodsno() {
        return goodsno;
    }

    public void setGoodsno(String goodsno) {
        this.goodsno = goodsno;
    }

    public Map<String, StockPriceImageUrlView> getMatchmap() {
        return matchmap;
    }

    public void setMatchmap(Map<String, StockPriceImageUrlView> matchmap) {
        this.matchmap = matchmap;
    }

    public String getGoodsImagesAndDetailInfo() {
        return goodsImagesAndDetailInfo;
    }

    public void setGoodsImagesAndDetailInfo(String goodsImagesAndDetailInfo) {
        this.goodsImagesAndDetailInfo = goodsImagesAndDetailInfo;
    }

    public List<GoodsPropertyView> getGoodsproperties() {
        return goodsproperties;
    }

    public void setGoodsproperties(List<GoodsPropertyView> goodsproperties) {
        this.goodsproperties = goodsproperties;
    }

    public String getPictures() {
        return pictures;
    }

    public void setPictures(String pictures) {
        this.pictures = pictures;
    }

    public TSupplier getSupplier() {
        return supplier;
    }

    public void setSupplier(TSupplier supplier) {
        this.supplier = supplier;
    }


    public String getSimpledescription() {
        return simpledescription;
    }

    public void setSimpledescription(String simpledescription) {
        this.simpledescription = simpledescription;
    }

    public String getPreferentialinfo() {
        return preferentialinfo;
    }

    public void setPreferentialinfo(String preferentialinfo) {
        this.preferentialinfo = preferentialinfo;
    }

    public String getFareinfo() {
        return fareinfo;
    }

    public void setFareinfo(String fareinfo) {
        this.fareinfo = fareinfo;
    }
}
