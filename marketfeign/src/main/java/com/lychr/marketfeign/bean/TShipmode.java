package com.lychr.marketfeign.bean;

public class TShipmode {
    private Integer shipmodeid;

    private Integer templateid;

    private String region;

    private Integer firstpiece;

    private Long firstweight;

    private Long firstvolumn;

    private Long firstamount;

    private Integer continuedpiece;

    private Long continuedheavy;

    private Long continuedvolumn;

    private Long continuedamount;

    private Integer shipmethod;

    private Integer ifdefault;

    public Integer getShipmodeid() {
        return shipmodeid;
    }

    public void setShipmodeid(Integer shipmodeid) {
        this.shipmodeid = shipmodeid;
    }

    public Integer getTemplateid() {
        return templateid;
    }

    public void setTemplateid(Integer templateid) {
        this.templateid = templateid;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public Integer getFirstpiece() {
        return firstpiece;
    }

    public void setFirstpiece(Integer firstpiece) {
        this.firstpiece = firstpiece;
    }

    public Long getFirstweight() {
        return firstweight;
    }

    public void setFirstweight(Long firstweight) {
        this.firstweight = firstweight;
    }

    public Long getFirstvolumn() {
        return firstvolumn;
    }

    public void setFirstvolumn(Long firstvolumn) {
        this.firstvolumn = firstvolumn;
    }

    public Long getFirstamount() {
        return firstamount;
    }

    public void setFirstamount(Long firstamount) {
        this.firstamount = firstamount;
    }

    public Integer getContinuedpiece() {
        return continuedpiece;
    }

    public void setContinuedpiece(Integer continuedpiece) {
        this.continuedpiece = continuedpiece;
    }

    public Long getContinuedheavy() {
        return continuedheavy;
    }

    public void setContinuedheavy(Long continuedheavy) {
        this.continuedheavy = continuedheavy;
    }

    public Long getContinuedvolumn() {
        return continuedvolumn;
    }

    public void setContinuedvolumn(Long continuedvolumn) {
        this.continuedvolumn = continuedvolumn;
    }

    public Long getContinuedamount() {
        return continuedamount;
    }

    public void setContinuedamount(Long continuedamount) {
        this.continuedamount = continuedamount;
    }

    public Integer getShipmethod() {
        return shipmethod;
    }

    public void setShipmethod(Integer shipmethod) {
        this.shipmethod = shipmethod;
    }

    public Integer getIfdefault() {
        return ifdefault;
    }

    public void setIfdefault(Integer ifdefault) {
        this.ifdefault = ifdefault;
    }
}