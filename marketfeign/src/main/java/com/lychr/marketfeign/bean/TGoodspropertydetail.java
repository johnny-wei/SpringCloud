package com.lychr.marketfeign.bean;

public class TGoodspropertydetail {
    private String pic;

    private Integer goodspropertydetailid;

    private Integer goodspropertyid;

    private String goodspropertyvalue;

    private Integer goodsid;

    public Integer getGoodspropertydetailid() {
        return goodspropertydetailid;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public void setGoodspropertydetailid(Integer goodspropertydetailid) {
        this.goodspropertydetailid = goodspropertydetailid;
    }

    public Integer getGoodspropertyid() {
        return goodspropertyid;
    }

    public void setGoodspropertyid(Integer goodspropertyid) {
        this.goodspropertyid = goodspropertyid;
    }

    public String getGoodspropertyvalue() {
        return goodspropertyvalue;
    }

    public void setGoodspropertyvalue(String goodspropertyvalue) {
        this.goodspropertyvalue = goodspropertyvalue == null ? null : goodspropertyvalue.trim();
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((goodspropertydetailid == null) ? 0 : goodspropertydetailid.hashCode());
        result = prime * result + ((goodspropertyvalue == null) ? 0 : goodspropertyvalue.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        TGoodspropertydetail other = (TGoodspropertydetail) obj;
        if (goodspropertydetailid == null) {
            if (other.goodspropertyid != null)
                return false;
        } else if (!goodspropertydetailid.equals(other.goodspropertydetailid))
            return false;
        if (goodspropertyvalue == null) {
            if (other.goodspropertyvalue != null)
                return false;
        } else if (!goodspropertyvalue.equals(other.goodspropertyvalue))
            return false;
        return true;
    }
}