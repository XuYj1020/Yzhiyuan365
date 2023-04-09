package com.XYJ.pojo;

public class Politicaliandscape {
    private int politicaliandscapeid;
    private String politicaliandscape;

    public int getPoliticaliandscapeid() {
        return politicaliandscapeid;
    }

    public void setPoliticaliandscapeid(int politicaliandscapeid) {
        this.politicaliandscapeid = politicaliandscapeid;
    }

    public String getPoliticaliandscape() {
        return politicaliandscape;
    }

    public void setPoliticaliandscape(String politicaliandscape) {
        this.politicaliandscape = politicaliandscape;
    }

    @Override
    public String toString() {
        return "Politicaliandscape{" +
                "politicaliandscapeid=" + politicaliandscapeid +
                ", politicaliandscape='" + politicaliandscape + '\'' +
                '}';
    }
}
