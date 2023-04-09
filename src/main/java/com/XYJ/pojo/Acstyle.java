package com.XYJ.pojo;

public class Acstyle {
    private int acstyleid;
    private String acstyle;

    public int getAcstyleid() {
        return acstyleid;
    }

    public void setAcstyleid(int acstyleid) {
        this.acstyleid = acstyleid;
    }

    public String getAcstyle() {
        return acstyle;
    }

    public void setAcstyle(String acstyle) {
        this.acstyle = acstyle;
    }

    @Override
    public String toString() {
        return "Acstyle{" +
                "acstyleid=" + acstyleid +
                ", acstyle='" + acstyle + '\'' +
                '}';
    }
}
