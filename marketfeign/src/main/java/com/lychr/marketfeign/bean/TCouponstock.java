package com.lychr.marketfeign.bean;

public class TCouponstock {
    private Integer couponstockid;

    private Integer amount;

    private Integer cardinality;

    private Integer type;

    private Integer totalcount;

    private Integer supplierid;

    private String discount;

    public Integer getCouponstockid() {
        return couponstockid;
    }

    public void setCouponstockid(Integer couponstockid) {
        this.couponstockid = couponstockid;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getCardinality() {
        return cardinality;
    }

    public void setCardinality(Integer cardinality) {
        this.cardinality = cardinality;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getTotalcount() {
        return totalcount;
    }

    public void setTotalcount(Integer totalcount) {
        this.totalcount = totalcount;
    }

    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount == null ? null : discount.trim();
    }
}