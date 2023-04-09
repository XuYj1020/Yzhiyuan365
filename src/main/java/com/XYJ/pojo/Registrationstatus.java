package com.XYJ.pojo;

//组织登记状态
public class Registrationstatus {
    private int registrationstatusid;
    private String registrationstatus;

    public int getRegistrationstatusid() {
        return registrationstatusid;
    }

    public void setRegistrationstatusid(int registrationstatusid) {
        this.registrationstatusid = registrationstatusid;
    }

    public String getRegistrationstatus() {
        return registrationstatus;
    }

    public void setRegistrationstatus(String registrationstatus) {
        this.registrationstatus = registrationstatus;
    }

    @Override
    public String toString() {
        return "Registrationstatus{" +
                "registrationstatusid=" + registrationstatusid +
                ", registrationstatus='" + registrationstatus + '\'' +
                '}';
    }
}
