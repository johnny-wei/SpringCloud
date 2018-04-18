package com.lychr.marketfeign.bean;

/**
 * @Atuthor:weiyong
 * @Description:实名验证状态
 * @Date:2017/12/29
 */
public class AuthStatusView {
    private int personalauth;
    private int entauth;
    private String userrelname;
    private String idno;
    private String enterprisename;
    private String businessregisterno;

    public String getUserrelname() {
        return userrelname;
    }

    public void setUserrelname(String userrelname) {
        this.userrelname = userrelname;
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno;
    }

    public String getEnterprisename() {
        return enterprisename;
    }

    public void setEnterprisename(String enterprisename) {
        this.enterprisename = enterprisename;
    }

    public String getBusinessregisterno() {
        return businessregisterno;
    }

    public void setBusinessregisterno(String businessregisterno) {
        this.businessregisterno = businessregisterno;
    }

    public AuthStatusView(int personalauth, int entauth, String userrelname, String idno, String enterprisename, String businessregisterno) {
        this.personalauth = personalauth;
        this.entauth = entauth;
        this.userrelname = userrelname;
        this.idno = idno;
        this.enterprisename = enterprisename;
        this.businessregisterno = businessregisterno;
    }

    public AuthStatusView(int personalauth, int entauth) {
        this.personalauth = personalauth;
        this.entauth = entauth;
    }

    public int getPersonalauth() {
        return personalauth;
    }

    public void setPersonalauth(int personalauth) {
        this.personalauth = personalauth;
    }

    public int getEntauth() {
        return entauth;
    }

    public void setEntauth(int entauth) {
        this.entauth = entauth;
    }
}
