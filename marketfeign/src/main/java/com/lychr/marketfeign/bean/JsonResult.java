package com.lychr.marketfeign.bean;

import java.util.List;

/**
 * @Author:weiyong
 * @Description:格式化json
 * @Date:2017/11/30
 */
public class JsonResult<T> {
    //结果 0成功 1失败
    private String code;
    //信息
    private String message;
    //数据
    private List<T> data;
    //sessionid
    private String sessionid;
    //用户状态 0临时用户 1用户登陆
    private String status;


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public JsonResult(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public JsonResult(String code, String message, List<T> data, String sessionid) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.sessionid = sessionid;
    }


    public String getSessionid() {
        return sessionid;
    }

    public void setSessionid(String sessionid) {
        this.sessionid = sessionid;
    }

    public JsonResult(String code, String message, List<T> data) {
        this.code = code;
        this.message = message;
        if (message == null) {
            this.message = "";
        }
        this.data = data;
    }

    public JsonResult(String code, String message, String sessionid, String status) {
        this.code = code;
        this.message = message;
        this.sessionid = sessionid;
        this.status = status;
    }
    public JsonResult(String code, String message, String sessionid,List list, String status) {
        this.code = code;
        this.message = message;
        this.sessionid = sessionid;
        this.status = status;
        this.data=list;
    }

    public JsonResult(String code, String message, String sessionid) {
        this.code = code;
        this.message = message;
        this.sessionid = sessionid;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public static void main(String[] args) {
//        List<User> userlist=new ArrayList<>();
//
//        for (int i=0;i<10;i++) {
//            User u = new User();
//            u.setUsername("user"+String.valueOf(i));
//            userlist.add(u);
//        }
        //  System.out.print(JSON.toJSONString(new JsonResult<Object>("1","密码错误",null)
//));
//
        // System.out.println(JSON.toJSONString(new JsonResult<User>("0","",userlist)));
    }
}
