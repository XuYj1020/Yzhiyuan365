package com.XYJ.pojo;


public class Distribute {

  private String recordid;
  private String volunteerid;
  private double volunteerhours;
  private String releasetime;
  private String activityid;


  public String getRecordid() {
    return recordid;
  }

  public void setRecordid(String recordid) {
    this.recordid = recordid;
  }


  public String getVolunteerid() {
    return volunteerid;
  }

  public void setVolunteerid(String volunteerid) {
    this.volunteerid = volunteerid;
  }


  public double getVolunteerhours() {
    return volunteerhours;
  }

  public void setVolunteerhours(double volunteerhours) {
    this.volunteerhours = volunteerhours;
  }


  public String getReleasetime() {
    return releasetime;
  }

  public void setReleasetime(String releasetime) {
    this.releasetime = releasetime;
  }


  public String getActivityid() {
    return activityid;
  }

  public void setActivityid(String activityid) {
    this.activityid = activityid;
  }

  @Override
  public String toString() {
    return "Distribute{" +
            "recordid='" + recordid + '\'' +
            ", volunteerid='" + volunteerid + '\'' +
            ", volunteerhours=" + volunteerhours +
            ", releasetime='" + releasetime + '\'' +
            ", activityid='" + activityid + '\'' +
            '}';
  }
}
