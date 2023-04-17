package com.XYJ.pojo;

public class ShenHeShuLiang {
    private int shenqingshu;
    private int yishenhe;
    private int yiluqu;

    private int numberofrequiredvolunteer;
    private int numberofenrolledvolunteer;
    public int getShenqingshu() {
        return shenqingshu;
    }

    public void setShenqingshu(int shenqingshu) {
        this.shenqingshu = shenqingshu;
    }

    public int getYishenhe() {
        return yishenhe;
    }

    public void setYishenhe(int yishenhe) {
        this.yishenhe = yishenhe;
    }

    public int getYiluqu() {
        return yiluqu;
    }

    public void setYiluqu(int yiluqu) {
        this.yiluqu = yiluqu;
    }

    public int getNumberofrequiredvolunteer() {
        return numberofrequiredvolunteer;
    }

    public void setNumberofrequiredvolunteer(int numberofrequiredvolunteer) {
        this.numberofrequiredvolunteer = numberofrequiredvolunteer;
    }

    public int getNumberofenrolledvolunteer() {
        return numberofenrolledvolunteer;
    }

    public void setNumberofenrolledvolunteer(int numberofenrolledvolunteer) {
        this.numberofenrolledvolunteer = numberofenrolledvolunteer;
    }

    @Override
    public String toString() {
        return "ShenHeShuLiang{" +
                "shenqingshu=" + shenqingshu +
                ", yishenhe=" + yishenhe +
                ", yiluqu=" + yiluqu +
                ", numberofrequiredvolunteer=" + numberofrequiredvolunteer +
                ", numberofenrolledvolunteer=" + numberofenrolledvolunteer +
                '}';
    }
}
