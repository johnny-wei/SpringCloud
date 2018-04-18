package com.lychr.marketfeign.bean;

import java.util.Date;

//优惠券
public class CouponView {
    //库存id
    private Integer couponstockid;
    //优惠金额
    private Integer amount;
    //满减金额
    private Integer cardinality;
    //优惠券类型：0满减券；1打折券；2无门槛
    private Integer type;
    //优惠卷id
    private Integer counponid;
    //描述
    private String description;
    //使用范围
    private String scope;
    //创建日期（领取日期）
    private Date createdate;
    //过期日期
    private Date invailddate;
    //状态 0可用 1已使用 2已过期 3不可用
    private Integer status;
    //用户id
    private Integer userid;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

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

    public Integer getCounponid() {
        return counponid;
    }

    public void setCounponid(Integer counponid) {
        this.counponid = counponid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getInvailddate() {
        return invailddate;
    }

    public void setInvailddate(Date invailddate) {
        this.invailddate = invailddate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
