package com.lychr.marketfeign.bean;

/**
 * @Atuthor:weiyong
 * @Description:钱包明细
 * @Date:2018/1/2
 */
public class WalletDetailView {
    private String way;//用途说明
    private String transactiontime;//交易时间
    private String amount;//金额
    private Integer status;//交易状态 1处理中 2成功 3失败
    private Integer fee;//业务手续费
    private Integer inorout;//进账1/出账2

    public Integer getInorout() {
        return inorout;
    }

    public void setInorout(Integer inorout) {
        this.inorout = inorout;
    }

    public Integer getFee() {
        return fee;
    }

    public void setFee(Integer fee) {
        this.fee = fee;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getWay() {
        return way;
    }

    public void setWay(String way) {
        this.way = way;
    }

    public String getTransactiontime() {
        return transactiontime;
    }

    public void setTransactiontime(String transactiontime) {
        this.transactiontime = transactiontime;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
