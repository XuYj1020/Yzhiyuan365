package com.XYJ.pojo;


public class Aleader {

  private String leaderid;
  private String activityid;
  private String stafid;


  public String getLeaderid() {
    return leaderid;
  }

  public void setLeaderid(String leaderid) {
    this.leaderid = leaderid;
  }


  public String getActivityid() {
    return activityid;
  }

  public void setActivityid(String activityid) {
    this.activityid = activityid;
  }


  public String getStafid() {
    return stafid;
  }

  public void setStafid(String stafid) {
    this.stafid = stafid;
  }

  @Override
  public String toString() {
    return "Aleader{" +
            "leaderid='" + leaderid + '\'' +
            ", activityid='" + activityid + '\'' +
            ", stafid='" + stafid + '\'' +
            '}';
  }
}
