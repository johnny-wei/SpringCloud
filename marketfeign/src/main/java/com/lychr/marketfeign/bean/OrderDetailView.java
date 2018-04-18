package com.lychr.marketfeign.bean;

/**
 * @Atuthor:weiyong
 * @Description:订单详情
 * @Date:2018/1/2
 */
public class OrderDetailView {
    private int orderstatus;//订单状态
    private String receiver;//收件人
    private String tel;//收件电话
    private String province;//收件省
    private String city;//收件市
    private String area;//收件区县
    private String addressinfo;//收件地址
    private long remaintime;//订单剩余时间（自动关闭）
    private OrderView orderView;//订单内容

    private int coupon;//优惠卷
    private int freight;//运费
    private int cheap;//为您节省
    private int needpay;//应付金额

    private String orderid;//订单编号
    private String payway;//支付方式
    private String batchpayid;//支付交易编号
    private String transactiontime;//交易时间

    public long getRemaintime() {
        return remaintime;
    }

    public void setRemaintime(long remaintime) {
        this.remaintime = remaintime;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(int orderstatus) {
        this.orderstatus = orderstatus;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddressinfo() {
        return addressinfo;
    }

    public void setAddressinfo(String addressinfo) {
        this.addressinfo = addressinfo;
    }

    public OrderView getOrderView() {
        return orderView;
    }

    public void setOrderView(OrderView orderView) {
        this.orderView = orderView;
    }

    public int getCoupon() {
        return coupon;
    }

    public void setCoupon(int coupon) {
        this.coupon = coupon;
    }



    public int getFreight() {
        return freight;
    }

    public void setFreight(int freight) {
        this.freight = freight;
    }

    public int getCheap() {
        return cheap;
    }

    public void setCheap(int cheap) {
        this.cheap = cheap;
    }

    public int getNeedpay() {
        return needpay;
    }

    public void setNeedpay(int needpay) {
        this.needpay = needpay;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getPayway() {
        return payway;
    }

    public void setPayway(String payway) {
        this.payway = payway;
    }

    public String getBatchpayid() {
        return batchpayid;
    }

    public void setBatchpayid(String batchpayid) {
        this.batchpayid = batchpayid;
    }

    public String getTransactiontime() {
        return transactiontime;
    }

    public void setTransactiontime(String transactiontime) {
        this.transactiontime = transactiontime;
    }
}
