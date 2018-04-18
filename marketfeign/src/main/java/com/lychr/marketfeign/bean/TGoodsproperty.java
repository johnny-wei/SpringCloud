package com.lychr.marketfeign.bean;

public class TGoodsproperty {
    private Integer goodspropertyid;

    private String goodspropertyname;

    public Integer getGoodspropertyid() {
        return goodspropertyid;
    }

    public void setGoodspropertyid(Integer goodspropertyid) {
        this.goodspropertyid = goodspropertyid;
    }

    public String getGoodspropertyname() {
        return goodspropertyname;
    }

    public void setGoodspropertyname(String goodspropertyname) {
        this.goodspropertyname = goodspropertyname == null ? null : goodspropertyname.trim();
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((goodspropertyid == null) ? 0 : goodspropertyid.hashCode());
        result = prime * result + ((goodspropertyname == null) ? 0 : goodspropertyname.hashCode());
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
        TGoodsproperty other = (TGoodsproperty) obj;
        if (goodspropertyid == null) {
            if (other.goodspropertyid != null)
                return false;
        } else if (!goodspropertyid.equals(other.goodspropertyid))
            return false;
        if (goodspropertyname == null) {
            if (other.goodspropertyname != null)
                return false;
        } else if (!goodspropertyname.equals(other.goodspropertyname))
            return false;
        return true;
    }
}