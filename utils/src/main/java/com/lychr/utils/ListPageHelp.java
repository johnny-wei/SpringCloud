package com.lychr.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Atuthor:weiyong
 * @Description:对list分页
 * @Date:2017/12/29
 */
public class ListPageHelp<T> {
    private int pagesize;
    private List<T> list;
    private int pageno;
    public int getPagesize() {
        return pagesize;
    }
    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public int getPageno() {
        return pageno;
    }

    public void setPageno(int pageno) {
        this.pageno = pageno;
    }

    public ListPageHelp(List<T> list,int pagesize, int pageno) {
        this.pagesize = pagesize;
        this.list = list;
        this.pageno = pageno;
    }
    public List<T> getResult(){
        int pagenum;
        int model=list.size()%pagesize;
        if (model==0){
            pagenum=list.size()/pagesize;
        }else {
            pagenum=list.size()/pagesize+1;
        }
        if (pageno<0){
            pageno=1;
        }
        if (pageno>pagenum){
            return new ArrayList<>();
        }
        int from=(pageno-1)*pagesize;
        int end=from+pagesize;
        if (end>list.size()-1){
            end=list.size();
        }
        return list.subList(from,end);
    }
}
