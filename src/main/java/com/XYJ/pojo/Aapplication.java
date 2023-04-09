package com.XYJ.pojo;


public class Aapplication {

  private String applicationid;
  private String activityid;
  private String volunteerid;
  private int applicationstatusid;
  private String atime;
  private String auditid;



  public String getApplicationid() {
    return applicationid;
  }

  public void setApplicationid(String applicationid) {
    this.applicationid = applicationid;
  }


  public String getActivityid() {
    return activityid;
  }

  public void setActivityid(String activityid) {
    this.activityid = activityid;
  }


  public String getVolunteerid() {
    return volunteerid;
  }

  public void setVolunteerid(String volunteerid) {
    this.volunteerid = volunteerid;
  }


  public int getApplicationstatusid() {
    return applicationstatusid;
  }

  public void setApplicationstatusid(int applicationstatusid) {
    this.applicationstatusid = applicationstatusid;
  }


  public String getAtime() {
    return atime;
  }

  public void setAtime(String atime) {
    this.atime = atime;
  }


  public String getAuditid() {
    return auditid;
  }

  public void setAuditid(String auditid) {
    this.auditid = auditid;
  }

  @Override
  public String toString() {
    return "Aapplication{" +
            "applicationid='" + applicationid + '\'' +
            ", activityid='" + activityid + '\'' +
            ", volunteerid='" + volunteerid + '\'' +
            ", applicationstatusid=" + applicationstatusid +
            ", atime='" + atime + '\'' +
            ", auditid='" + auditid + '\'' +
            '}';
  }
}
