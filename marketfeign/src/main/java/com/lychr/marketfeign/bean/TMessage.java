package com.lychr.marketfeign.bean;

import java.util.Date;

public class TMessage {
    private Integer messageid;

    private String type;

    private String content;

    private Date createtime;

    private Integer count;

    private Integer ifsuccess;

    private String errreason;

    private String receiver;

    public Integer getMessageid() {
        return messageid;
    }

    public void setMessageid(Integer messageid) {
        this.messageid = messageid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getIfsuccess() {
        return ifsuccess;
    }

    public void setIfsuccess(Integer ifsuccess) {
        this.ifsuccess = ifsuccess;
    }

    public String getErrreason() {
        return errreason;
    }

    public void setErrreason(String errreason) {
        this.errreason = errreason == null ? null : errreason.trim();
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver == null ? null : receiver.trim();
    }
}