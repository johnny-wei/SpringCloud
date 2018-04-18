package com.lychr.marketfeign.bean;

import java.util.Date;

public class TCoupons {
    private Integer counponid;

    private Integer stockid;

    private Integer userid;

    private Date createdate;

    private Integer status;

    public Integer getCounponid() {
        return counponid;
    }

    public void setCounponid(Integer counponid) {
        this.counponid = counponid;
    }

    public Integer getStockid() {
        return stockid;
    }

    public void setStockid(Integer stockid) {
        this.stockid = stockid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }


    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}