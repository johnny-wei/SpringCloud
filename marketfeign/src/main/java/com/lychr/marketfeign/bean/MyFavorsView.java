package com.lychr.marketfeign.bean;

import java.util.List;

/**
 * @Atuthor:weiyong
 * @Description:我的收藏
 * @Date:2018/1/12
 */
public class MyFavorsView {
    private long favordate;
    private List<ShopCircleMessageView> items;

    public long getFavordate() {
        return favordate;
    }

    public void setFavordate(long favordate) {
        this.favordate = favordate;
    }

    public List<ShopCircleMessageView> getItems() {
        return items;
    }

    public void setItems(List<ShopCircleMessageView> items) {
        this.items = items;
    }
}
