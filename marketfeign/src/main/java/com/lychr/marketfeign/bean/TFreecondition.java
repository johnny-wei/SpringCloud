package com.lychr.marketfeign.bean;

public class TFreecondition {
    private Integer freeconditionid;

    private Integer templateid;

    private String freeshippingarea;

    private Integer freeshippingcount;

    private Long freeshippingweight;

    private Long freeshippingvolumn;

    private Integer freeshippingamount;

    public Integer getFreeconditionid() {
        return freeconditionid;
    }

    public void setFreeconditionid(Integer freeconditionid) {
        this.freeconditionid = freeconditionid;
    }

    public Integer getTemplateid() {
        return templateid;
    }

    public void setTemplateid(Integer templateid) {
        this.templateid = templateid;
    }

    public String getFreeshippingarea() {
        return freeshippingarea;
    }

    public void setFreeshippingarea(String freeshippingarea) {
        this.freeshippingarea = freeshippingarea == null ? null : freeshippingarea.trim();
    }

    public Integer getFreeshippingcount() {
        return freeshippingcount;
    }

    public void setFreeshippingcount(Integer freeshippingcount) {
        this.freeshippingcount = freeshippingcount;
    }

    public Long getFreeshippingweight() {
        return freeshippingweight;
    }

    public void setFreeshippingweight(Long freeshippingweight) {
        this.freeshippingweight = freeshippingweight;
    }

    public Long getFreeshippingvolumn() {
        return freeshippingvolumn;
    }

    public void setFreeshippingvolumn(Long freeshippingvolumn) {
        this.freeshippingvolumn = freeshippingvolumn;
    }

    public Integer getFreeshippingamount() {
        return freeshippingamount;
    }

    public void setFreeshippingamount(Integer freeshippingamount) {
        this.freeshippingamount = freeshippingamount;
    }
}