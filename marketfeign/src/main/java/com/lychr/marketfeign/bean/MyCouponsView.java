package com.lychr.marketfeign.bean;

import java.util.List;

/**
 * @Atuthor:weiyong
 * @Description:我的优惠卷
 * @Date:2018/1/3
 */
public class MyCouponsView {
    private List<CouponView> enablecoupons;
    private List<CouponView> usedcoupons;
    private List<CouponView> expire;

    public List<CouponView> getEnablecoupons() {
        return enablecoupons;
    }

    public void setEnablecoupons(List<CouponView> enablecoupons) {
        this.enablecoupons = enablecoupons;
    }

    public List<CouponView> getUsedcoupons() {
        return usedcoupons;
    }

    public void setUsedcoupons(List<CouponView> usedcoupons) {
        this.usedcoupons = usedcoupons;
    }

    public List<CouponView> getExpire() {
        return expire;
    }

    public void setExpire(List<CouponView> expire) {
        this.expire = expire;
    }
}
