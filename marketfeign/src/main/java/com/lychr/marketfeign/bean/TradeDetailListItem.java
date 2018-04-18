package com.lychr.marketfeign.bean;

/**
 * @Atuthor:weiyong
 * @Description:
 * @Date:2018/1/31
 */
public class TradeDetailListItem {
    private String orderNo;
    private String mbrCode;
    private String mbrName;
    private String toMbrCode;
    private String toMbrName;
    private String inoutFlag;
    private String tranAmount;
    private String tranCode;
    private String tradeDate;
    private String remark;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getMbrCode() {
        return mbrCode;
    }

    public void setMbrCode(String mbrCode) {
        this.mbrCode = mbrCode;
    }

    public String getMbrName() {
        return mbrName;
    }

    public void setMbrName(String mbrName) {
        this.mbrName = mbrName;
    }

    public String getToMbrCode() {
        return toMbrCode;
    }

    public void setToMbrCode(String toMbrCode) {
        this.toMbrCode = toMbrCode;
    }

    public String getToMbrName() {
        return toMbrName;
    }

    public void setToMbrName(String toMbrName) {
        this.toMbrName = toMbrName;
    }

    public String getInoutFlag() {
        return inoutFlag;
    }

    public void setInoutFlag(String inoutFlag) {
        this.inoutFlag = inoutFlag;
    }

    public String getTranAmount() {
        return tranAmount;
    }

    public void setTranAmount(String tranAmount) {
        this.tranAmount = tranAmount;
    }

    public String getTranCode() {
        return tranCode;
    }

    public void setTranCode(String tranCode) {
        this.tranCode = tranCode;
    }

    public String getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
