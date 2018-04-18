package com.lychr.marketfeign.bean;

/**
 * @Atuthor:weiyong
 * @Description:
 * @Date:2018/1/31
 */
public class TradeDetailBody {
    private String mbrCode;
    private String beginDate;
    private String endDate;
    private String beginNumber;
    private String queryNumber;
    private String busiTime;

    public String getMbrCode() {
        return mbrCode;
    }

    public void setMbrCode(String mbrCode) {
        this.mbrCode = mbrCode;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getBeginNumber() {
        return beginNumber;
    }

    public void setBeginNumber(String beginNumber) {
        this.beginNumber = beginNumber;
    }

    public String getQueryNumber() {
        return queryNumber;
    }

    public void setQueryNumber(String queryNumber) {
        this.queryNumber = queryNumber;
    }

    public String getBusiTime() {
        return busiTime;
    }

    public void setBusiTime(String busiTime) {
        this.busiTime = busiTime;
    }
}
