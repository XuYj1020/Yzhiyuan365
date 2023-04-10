package com.XYJ.pojo;

import java.util.List;

public class PageFY<pojo> {

    private int total;
    private List<pojo> shuju;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<pojo> getShuju() {
        return shuju;
    }

    public void setShuju(List<pojo> shuju) {
        this.shuju = shuju;
    }

    @Override
    public String toString() {
        return "PageFY{" +
                "total=" + total +
                ", shuju=" + shuju +
                '}';
    }
}
