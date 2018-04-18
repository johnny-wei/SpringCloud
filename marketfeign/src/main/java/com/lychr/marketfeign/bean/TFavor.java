package com.lychr.marketfeign.bean;

import java.util.Date;

public class TFavor {
    private Integer favorid;

    private Integer userid;

    private Integer goodsintroductionid;

    private Date createtime;

    public Integer getFavorid() {
        return favorid;
    }

    public void setFavorid(Integer favorid) {
        this.favorid = favorid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getGoodsintroductionid() {
        return goodsintroductionid;
    }

    public void setGoodsintroductionid(Integer goodsintroductionid) {
        this.goodsintroductionid = goodsintroductionid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}