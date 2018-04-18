package com.lychr.marketfeign.bean;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @Atuthor:weiyong
 * @Description:支付参数
 * @Date:2017/12/15
 */
public class WechatPayRequest {
    private String appid;
    private String partnerid;
    private String prepayid;
    private String Package;
    private String noncestr;
    private String timestamp;
    private String sign;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getPartnerid() {
        return partnerid;
    }

    public void setPartnerid(String partnerid) {
        this.partnerid = partnerid;
    }

    public String getPrepayid() {
        return prepayid;
    }

    public void setPrepayid(String prepayid) {
        this.prepayid = prepayid;
    }

    public String getPackage() {
        return Package;
    }

    public void setPackage(String aPackage) {
        Package = aPackage;
    }

    public String getNoncestr() {
        return noncestr;
    }

    public void setNoncestr(String noncestr) {
        this.noncestr = noncestr;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public SortedMap<Object, Object> generateParamsMap() {
        SortedMap<Object, Object> sortedMap = new TreeMap<>();
        sortedMap.put("appid", appid);
        sortedMap.put("partnerid", partnerid);
        sortedMap.put("prepayid", prepayid);
        sortedMap.put("package", Package);
        sortedMap.put("noncestr", noncestr);
        sortedMap.put("timestamp", timestamp);
        sortedMap.put("package", Package);
        return sortedMap;
    }
}
