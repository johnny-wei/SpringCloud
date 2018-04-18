package com.lychr.marketfeign.bean;

public class TPublishfake {
    private Integer fakeid;

    private String fakename;

    private String fakeheadpic;

    private Integer faketype;

    public Integer getFakeid() {
        return fakeid;
    }

    public void setFakeid(Integer fakeid) {
        this.fakeid = fakeid;
    }

    public String getFakename() {
        return fakename;
    }

    public void setFakename(String fakename) {
        this.fakename = fakename == null ? null : fakename.trim();
    }

    public String getFakeheadpic() {
        return fakeheadpic;
    }

    public void setFakeheadpic(String fakeheadpic) {
        this.fakeheadpic = fakeheadpic == null ? null : fakeheadpic.trim();
    }

    public Integer getFaketype() {
        return faketype;
    }

    public void setFaketype(Integer faketype) {
        this.faketype = faketype;
    }
}