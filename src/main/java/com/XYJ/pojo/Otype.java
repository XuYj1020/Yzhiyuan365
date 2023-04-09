package com.XYJ.pojo;

public class Otype {
    public int otypeid ;
    public String otype ;
    public int registrationstatusid ;

    public int getOtypeid() {
        return otypeid;
    }

    public void setOtypeid(int otypeid) {
        this.otypeid = otypeid;
    }

    public String getOtype() {
        return otype;
    }

    public void setOtype(String otype) {
        this.otype = otype;
    }

    public int getRegistrationstatusid() {
        return registrationstatusid;
    }

    public void setRegistrationstatusid(int registrationstatusid) {
        this.registrationstatusid = registrationstatusid;
    }

    @Override
    public String toString() {
        return "Otype{" +
                "otypeid=" + otypeid +
                ", otype='" + otype + '\'' +
                ", registrationstatusid=" + registrationstatusid +
                '}';
    }
}
