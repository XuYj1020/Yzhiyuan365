package com.XYJ.pojo;


public class Credits {

  private int creditid;
  private int credit;
  private String volunteerid;
  private String activityid;
  private String time;

private String applicationid;

  public String getApplicationid() {
    return applicationid;
  }

  public void setApplicationid(String applicationid) {
    this.applicationid = applicationid;
  }

  public int getCreditid() {
    return creditid;
  }

  public void setCreditid(int creditid) {
    this.creditid = creditid;
  }


  public int getCredit() {
    return credit;
  }

  public void setCredit(int credit) {
    this.credit = credit;
  }


  public String getVolunteerid() {
    return volunteerid;
  }

  public void setVolunteerid(String volunteerid) {
    this.volunteerid = volunteerid;
  }


  public String getActivityid() {
    return activityid;
  }

  public void setActivityid(String activityid) {
    this.activityid = activityid;
  }


  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  @Override
  public String toString() {
    return "Credits{" +
            "creditid=" + creditid +
            ", credit=" + credit +
            ", volunteerid='" + volunteerid + '\'' +
            ", activityid='" + activityid + '\'' +
            ", time='" + time + '\'' +
            ", applicationid='" + applicationid + '\'' +
            '}';
  }
}
