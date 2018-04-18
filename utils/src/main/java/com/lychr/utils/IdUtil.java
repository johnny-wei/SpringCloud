package com.lychr.utils;
//id生成工具
public class IdUtil {
    //生成订单id
    public static String getOrderId(int userid){
        String time=StringUtil.getCurrentDataStr("yyyyMMddHHmmssSSS");
        return userid+time;
    }

    //生成支付订单id
    public static String getBatchPayId(int userid){
        String time=StringUtil.getCurrentDataStr("yyyyMMddHHmmssSSS");
        return time+userid;
    }
    public static void main(String args[]){
        System.out.print(getOrderId(999));
    }
}
