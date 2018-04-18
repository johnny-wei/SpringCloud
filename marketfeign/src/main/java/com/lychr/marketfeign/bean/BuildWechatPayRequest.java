package com.lychr.marketfeign.bean;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @Atuthor:weiyong
 * @Description:微信下单请求参数类
 * @Date:2017/12/15
 */
@XmlType
@XmlRootElement(name = "xml")
public class BuildWechatPayRequest {
    private String appid;
    private String mch_id;
    private String device_info;
    private String nonce_str;
    private String sign;
    private String sign_type;
    private String body;
    private String detail;
    private String attach;
    private String out_trade_no;
    private String fee_type;
    private int total_fee;
    private String spbill_create_ip;
    private String time_start;
    private String time_expire;
    private String goods_tag;
    private String notify_url;
    private String trade_type;
    private String limit_pay;
    private String scene_info;

    public String getAppid() {
        return appid;
    }
    @XmlAttribute
    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getMch_id() {
        return mch_id;
    }
    @XmlAttribute
    public void setMch_id(String mch_id) {
        this.mch_id = mch_id;
    }

    public String getDevice_info() {
        return device_info;
    }
    @XmlAttribute
    public void setDevice_info(String device_info) {
        this.device_info = device_info;
    }

    public String getNonce_str() {
        return nonce_str;
    }
    @XmlAttribute
    public void setNonce_str(String nonce_str) {
        this.nonce_str = nonce_str;
    }

    public String getSign() {
        return sign;
    }
    @XmlAttribute
    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getSign_type() {
        return sign_type;
    }
    @XmlAttribute
    public void setSign_type(String sign_type) {
        this.sign_type = sign_type;
    }

    public String getBody() {
        return body;
    }
    @XmlAttribute
    public void setBody(String body) {
        this.body = body;
    }

    public String getDetail() {
        return detail;
    }
    @XmlAttribute
    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getAttach() {
        return attach;
    }
    @XmlAttribute
    public void setAttach(String attach) {
        this.attach = attach;
    }

    public String getOut_trade_no() {
        return out_trade_no;
    }
    @XmlAttribute
    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public String getFee_type() {
        return fee_type;
    }
    @XmlAttribute
    public void setFee_type(String fee_type) {
        this.fee_type = fee_type;
    }

    public int getTotal_fee() {
        return total_fee;
    }
    @XmlAttribute
    public void setTotal_fee(int total_fee) {
        this.total_fee = total_fee;
    }

    public String getSpbill_create_ip() {
        return spbill_create_ip;
    }
    @XmlAttribute
    public void setSpbill_create_ip(String spbill_create_ip) {
        this.spbill_create_ip = spbill_create_ip;
    }

    public String getTime_start() {
        return time_start;
    }
    @XmlAttribute
    public void setTime_start(String time_start) {
        this.time_start = time_start;
    }

    public String getTime_expire() {
        return time_expire;
    }
    @XmlAttribute
    public void setTime_expire(String time_expire) {
        this.time_expire = time_expire;
    }

    public String getGoods_tag() {
        return goods_tag;
    }
    @XmlAttribute
    public void setGoods_tag(String goods_tag) {
        this.goods_tag = goods_tag;
    }

    public String getNotify_url() {
        return notify_url;
    }
    @XmlAttribute
    public void setNotify_url(String notify_url) {
        this.notify_url = notify_url;
    }

    public String getTrade_type() {
        return trade_type;
    }
    @XmlAttribute
    public void setTrade_type(String trade_type) {
        this.trade_type = trade_type;
    }

    public String getLimit_pay() {
        return limit_pay;
    }
    @XmlAttribute
    public void setLimit_pay(String limit_pay) {
        this.limit_pay = limit_pay;
    }

    public String getScene_info() {
        return scene_info;
    }
    @XmlAttribute
    public void setScene_info(String scene_info) {
        this.scene_info = scene_info;
    }

    public SortedMap<Object, Object> generateParamsMap() {
        SortedMap<Object, Object> sortedMap = new TreeMap<>();
        sortedMap.put("appid", this.appid);
        sortedMap.put("mch_id", this.mch_id);
        sortedMap.put("device_info", this.device_info);
        sortedMap.put("nonce_str", this.nonce_str);
        sortedMap.put("sign_type", this.sign_type);
        sortedMap.put("body", this.body);
        sortedMap.put("detail", this.detail);
        sortedMap.put("attach", this.attach);
        sortedMap.put("out_trade_no", this.out_trade_no);
        sortedMap.put("fee_type", this.fee_type);
        sortedMap.put("total_fee", this.total_fee);
        sortedMap.put("spbill_create_ip", this.spbill_create_ip);
        sortedMap.put("time_start", this.time_start);
        sortedMap.put("time_expire", this.time_expire);
        sortedMap.put("goods_tag", this.goods_tag);
        sortedMap.put("notify_url", this.notify_url);
        sortedMap.put("trade_type", this.trade_type);
        sortedMap.put("limit_pay", this.limit_pay);
        sortedMap.put("scene_info", this.scene_info);
        return sortedMap;
    }
}
