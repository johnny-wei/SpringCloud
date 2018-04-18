package com.lychr.marketfeign.bean;

/**
 * @Atuthor:weiyong
 * @Description:收益
 * @Date:2018/1/2
 */
public class IncomeView {
    private Integer totalIncome;
    private Integer todayIncome;
    private Integer tswkIncome;
    private Integer tsmthIncome;
    private Integer lsmthIncome;

    public Integer getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncom(Integer totalIncome) {
        this.totalIncome = totalIncome;
    }

    public Integer getTodayIncome() {
        return todayIncome;
    }

    public void setTodayIncome(Integer todayIncome) {
        this.todayIncome = todayIncome;
    }

    public Integer getTswkIncome() {
        return tswkIncome;
    }

    public void setTswkIncome(Integer tswkIncome) {
        this.tswkIncome = tswkIncome;
    }

    public Integer getTsmthIncome() {
        return tsmthIncome;
    }

    public void setTsmthIncome(Integer tsmthIncome) {
        this.tsmthIncome = tsmthIncome;
    }

    public Integer getLsmthIncome() {
        return lsmthIncome;
    }

    public void setLsmthIncome(Integer lsmthIncome) {
        this.lsmthIncome = lsmthIncome;
    }
}
