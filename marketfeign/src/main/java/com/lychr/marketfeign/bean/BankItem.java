package com.lychr.marketfeign.bean;

/**
 * @Atuthor:weiyong
 * @Description:银行卡
 * @Date:2018/1/5
 */
public class BankItem {
    private int bankid;
    private String bankname;
    private String pic;

    public BankItem(int bankid, String bankname, String pic) {
        this.bankid = bankid;
        this.bankname = bankname;
        this.pic = pic;
    }

    public int getBankid() {
        return bankid;
    }

    public void setBankid(int bankid) {
        this.bankid = bankid;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

}
