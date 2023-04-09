package com.XYJ.pojo;

public class Occupation {
    private int occupationid;
    private String occupation;

    public int getOccupationid() {
        return occupationid;
    }

    public void setOccupationid(int occupationid) {
        this.occupationid = occupationid;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return "Occupation{" +
                "occupationid=" + occupationid +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}
