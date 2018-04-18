package com.lychr.marketfeign.bean;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.google.gson.Gson;

import java.util.List;

/**
 * @Atuthor:weiyong
 * @Description:自动装格式JSON
 * @Date:2017/11/30
 */
public class JsonStringUtil {
    public static String generateJsonString(String code, String message, List list) {
        JsonResult jr = new JsonResult(code, message, list);
        return JSON.toJSONString(jr, SerializerFeature.WriteMapNullValue);
    }

    public static String generateJsonString(String code, String message, List list, String sessionid) {
        JsonResult jr = new JsonResult(code, message, list, sessionid);
        return JSON.toJSONString(jr,SerializerFeature.WriteMapNullValue);
    }

    public static String generateJsonString(String code, String message, String sessionid, String status) {
        JsonResult jr = new JsonResult(code, message, sessionid, status);
        return JSON.toJSONString(jr,SerializerFeature.WriteMapNullValue);
    }
    public static String generateJsonString(String code, String message,List list ,String sessionid, String status) {
        JsonResult jr = new JsonResult(code, message, sessionid,list, status);
        return JSON.toJSONString(jr,SerializerFeature.WriteMapNullValue);
    }

    public static String generateJsonString(String code, String message) {
        JsonResult jr = new JsonResult(code, message);
        return JSON.toJSONString(jr,SerializerFeature.WriteMapNullValue);
    }

    public static String generateJsonString(String code, String message, String sessionid) {
        JsonResult jr = new JsonResult(code, message, sessionid);
        return JSON.toJSONString(jr,SerializerFeature.WriteMapNullValue);
    }
    public static String generateJsonStringGson(String code, String message, List list) {
        Gson gson=new Gson();
        JsonResult jr = new JsonResult(code, message, list);
        return gson.toJson(jr);
    }
    public static String generateJsonStringGson(String code, String message) {
        Gson gson=new Gson();
        JsonResult jr = new JsonResult(code, message);
        return gson.toJson(jr);
    }
}
