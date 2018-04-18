package com.lychr.marketfeign.bean;

public class TFaretemplate {
    private Integer faretemplateid;

    private String templatename;

    private String goodsaddress;

    private Byte iffreeshipping;

    private Byte ifhavecondition;

    private Byte valuationmethod;

    public Integer getFaretemplateid() {
        return faretemplateid;
    }

    public void setFaretemplateid(Integer faretemplateid) {
        this.faretemplateid = faretemplateid;
    }

    public String getTemplatename() {
        return templatename;
    }

    public void setTemplatename(String templatename) {
        this.templatename = templatename == null ? null : templatename.trim();
    }

    public String getGoodsaddress() {
        return goodsaddress;
    }

    public void setGoodsaddress(String goodsaddress) {
        this.goodsaddress = goodsaddress == null ? null : goodsaddress.trim();
    }

    public Byte getIffreeshipping() {
        return iffreeshipping;
    }

    public void setIffreeshipping(Byte iffreeshipping) {
        this.iffreeshipping = iffreeshipping;
    }

    public Byte getIfhavecondition() {
        return ifhavecondition;
    }

    public void setIfhavecondition(Byte ifhavecondition) {
        this.ifhavecondition = ifhavecondition;
    }

    public Byte getValuationmethod() {
        return valuationmethod;
    }

    public void setValuationmethod(Byte valuationmethod) {
        this.valuationmethod = valuationmethod;
    }
}