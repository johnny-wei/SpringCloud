package com.lychr.marketfeign.bean;

import java.util.List;

/**
 * @Atuthor:weiyong
 * @Description:
 * @Date:2018/1/4
 */
public class RebuyGoodsView {
    private String message;
    private List<OrderItem> items;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }
}
