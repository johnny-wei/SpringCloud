package com.lychr.marketfeign.bean;

public class TAuth {
    private Integer authid;

    private Integer userid;

    private String idfrontimageurl;

    private String idbackimageurl;

    private String businesslicenceimageurl;

    private String userrelname;

    private String idno;

    private String enterprisename;

    private String businessregisterno;

    private Integer pesonalauthstatus;

    private Integer enterpriseauthstatus;

    public Integer getAuthid() {
        return authid;
    }

    public void setAuthid(Integer authid) {
        this.authid = authid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getIdfrontimageurl() {
        return idfrontimageurl;
    }

    public void setIdfrontimageurl(String idfrontimageurl) {
        this.idfrontimageurl = idfrontimageurl == null ? null : idfrontimageurl.trim();
    }

    public String getIdbackimageurl() {
        return idbackimageurl;
    }

    public void setIdbackimageurl(String idbackimageurl) {
        this.idbackimageurl = idbackimageurl == null ? null : idbackimageurl.trim();
    }

    public String getBusinesslicenceimageurl() {
        return businesslicenceimageurl;
    }

    public void setBusinesslicenceimageurl(String businesslicenceimageurl) {
        this.businesslicenceimageurl = businesslicenceimageurl == null ? null : businesslicenceimageurl.trim();
    }

    public String getUserrelname() {
        return userrelname;
    }

    public void setUserrelname(String userrelname) {
        this.userrelname = userrelname == null ? null : userrelname.trim();
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno == null ? null : idno.trim();
    }

    public String getEnterprisename() {
        return enterprisename;
    }

    public void setEnterprisename(String enterprisename) {
        this.enterprisename = enterprisename == null ? null : enterprisename.trim();
    }

    public String getBusinessregisterno() {
        return businessregisterno;
    }

    public void setBusinessregisterno(String businessregisterno) {
        this.businessregisterno = businessregisterno == null ? null : businessregisterno.trim();
    }

    public Integer getPesonalauthstatus() {
        return pesonalauthstatus;
    }

    public void setPesonalauthstatus(Integer pesonalauthstatus) {
        this.pesonalauthstatus = pesonalauthstatus;
    }

    public Integer getEnterpriseauthstatus() {
        return enterpriseauthstatus;
    }

    public void setEnterpriseauthstatus(Integer enterpriseauthstatus) {
        this.enterpriseauthstatus = enterpriseauthstatus;
    }
}