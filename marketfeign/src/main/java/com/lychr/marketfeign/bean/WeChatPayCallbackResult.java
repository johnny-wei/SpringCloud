package com.lychr.marketfeign.bean;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @Atuthor:weiyong
 * @Description:微信支付回调结果
 * @Date:2017/12/25
 */
public class WeChatPayCallbackResult {
    private String appid;
    private String mch_id;
    private String device_info;
    private String nonce_str;
    private String sign;
    private String return_code;
    private String result_code;
    private String err_code;
    private String err_code_des;
    private String openid;
    private String is_subscribe;
    private String trade_type;
    private String bank_type;
    private int total_fee;
    private String fee_type;
    private int cash_fee;
    private String cash_fee_type;
    private String transaction_id;
    private String out_trade_no;
    private String attach;
    private String time_end;

    public String getReturn_code() {
        return return_code;
    }

    public void setReturn_code(String return_code) {
        this.return_code = return_code;
    }

    public int getTotal_fee() {
        return total_fee;
    }

    public void setTotal_fee(int total_fee) {
        this.total_fee = total_fee;
    }

    public int getCash_fee() {
        return cash_fee;
    }

    public void setCash_fee(int cash_fee) {
        this.cash_fee = cash_fee;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getMch_id() {
        return mch_id;
    }

    public void setMch_id(String mch_id) {
        this.mch_id = mch_id;
    }

    public String getDevice_info() {
        return device_info;
    }

    public void setDevice_info(String device_info) {
        this.device_info = device_info;
    }

    public String getNonce_str() {
        return nonce_str;
    }

    public void setNonce_str(String nonce_str) {
        this.nonce_str = nonce_str;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getResult_code() {
        return result_code;
    }

    public void setResult_code(String result_code) {
        this.result_code = result_code;
    }

    public String getErr_code() {
        return err_code;
    }

    public void setErr_code(String err_code) {
        this.err_code = err_code;
    }

    public String getErr_code_des() {
        return err_code_des;
    }

    public void setErr_code_des(String err_code_des) {
        this.err_code_des = err_code_des;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getIs_subscribe() {
        return is_subscribe;
    }

    public void setIs_subscribe(String is_subscribe) {
        this.is_subscribe = is_subscribe;
    }

    public String getTrade_type() {
        return trade_type;
    }

    public void setTrade_type(String trade_type) {
        this.trade_type = trade_type;
    }

    public String getBank_type() {
        return bank_type;
    }

    public void setBank_type(String bank_type) {
        this.bank_type = bank_type;
    }



    public String getFee_type() {
        return fee_type;
    }

    public void setFee_type(String fee_type) {
        this.fee_type = fee_type;
    }


    public String getCash_fee_type() {
        return cash_fee_type;
    }

    public void setCash_fee_type(String cash_fee_type) {
        this.cash_fee_type = cash_fee_type;
    }

    public String getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public String getTime_end() {
        return time_end;
    }

    public void setTime_end(String time_end) {
        this.time_end = time_end;
    }

    public SortedMap<Object, Object> generateParamsMap() {
        SortedMap<Object, Object> sortedMap = new TreeMap<>();
        sortedMap.put("appid", this.appid);
        sortedMap.put("return_code",this.return_code);
        sortedMap.put("mch_id", this.mch_id);
        sortedMap.put("device_info", this.device_info);
        sortedMap.put("nonce_str", this.nonce_str);
        sortedMap.put("result_code", this.result_code);
        sortedMap.put("err_code", this.err_code);
        sortedMap.put("err_code_des", this.err_code_des);
        sortedMap.put("openid", this.openid);
        sortedMap.put("is_subscribe", this.is_subscribe);
        sortedMap.put("trade_type", this.trade_type);
        sortedMap.put("bank_type", this.bank_type);
        sortedMap.put("total_fee", this.total_fee);
        sortedMap.put("fee_type", this.fee_type);
        sortedMap.put("cash_fee", this.cash_fee);
        sortedMap.put("cash_fee_type", this.cash_fee_type);
        sortedMap.put("transaction_id", this.transaction_id);
        sortedMap.put("out_trade_no", this.out_trade_no);
        sortedMap.put("attach", this.attach);
        sortedMap.put("time_end", this.time_end);
        return sortedMap;
    }




}
