package com.lychr.marketfeign.bean;

import java.util.Set;

/**
 * @Atuthor:weiyong
 * @Description:
 * @Date:2017/12/21
 */
public class GoodsPropertyView {
    private String propertyname;
    private Set<TGoodspropertydetail> propertyvalues;


    public String getPropertyname() {
        return propertyname;
    }

    public void setPropertyname(String propertyname) {
        this.propertyname = propertyname;
    }

    public Set<TGoodspropertydetail> getPropertyvalues() {
        return propertyvalues;
    }

    public void setPropertyvalues(Set<TGoodspropertydetail> propertyvalues) {
        this.propertyvalues = propertyvalues;
    }
}
