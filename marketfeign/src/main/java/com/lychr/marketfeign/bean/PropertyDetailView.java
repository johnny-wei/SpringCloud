package com.lychr.marketfeign.bean;

import java.util.Map;

/**
 * @Atuthor:weiyong
 * @Description:属性详情
 * @Date:2017/12/18
 */
public class PropertyDetailView {
    public Integer propertyId;
    public String propertyName;
    public Map<Integer, String> valuelist;

    public Integer getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }

    public Map<Integer, String> getValuelist() {
        return valuelist;
    }

    public void setValuelist(Map<Integer, String> valuelist) {
        this.valuelist = valuelist;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }
}
