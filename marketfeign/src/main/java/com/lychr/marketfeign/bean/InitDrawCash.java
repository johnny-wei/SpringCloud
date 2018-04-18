package com.lychr.marketfeign.bean;

/**
 * @Atuthor:weiyong
 * @Description:初始化提现信息
 * @Date:2018/3/12
 */
public class InitDrawCash {
    private String lscardno;
    private int tdcount;
    private String bankname;
    private String bankicon;
    private double feerate;
    private String instruction;
    private boolean issetpaypwd;

    public boolean isIssetpaypwd() {
        return issetpaypwd;
    }

    public void setIssetpaypwd(boolean issetpaypwd) {
        this.issetpaypwd = issetpaypwd;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public double getFeerate() {
        return feerate;
    }

    public void setFeerate(double feerate) {
        this.feerate = feerate;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public String getBankicon() {
        return bankicon;
    }

    public void setBankicon(String bankicon) {
        this.bankicon = bankicon;
    }

    public String getLscardno() {
        return lscardno;
    }

    public void setLscardno(String lscardno) {
        this.lscardno = lscardno;
    }

    public int getTdcount() {
        return tdcount;
    }

    public void setTdcount(int tdcount) {
        this.tdcount = tdcount;
    }
}
