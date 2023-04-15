package com.XYJ.pojo;


public class Signcode {

  private String signinid;
  private String activityid;
  private String leaderid;
  private String buildtime;
  private String pictureaddress;


  public String getSigninid() {
    return signinid;
  }

  public void setSigninid(String signinid) {
    this.signinid = signinid;
  }


  public String getActivityid() {
    return activityid;
  }

  public void setActivityid(String activityid) {
    this.activityid = activityid;
  }


  public String getLeaderid() {
    return leaderid;
  }

  public void setLeaderid(String leaderid) {
    this.leaderid = leaderid;
  }


  public String getBuildtime() {
    return buildtime;
  }

  public void setBuildtime(String buildtime) {
    this.buildtime = buildtime;
  }


  public String getPictureaddress() {
    return pictureaddress;
  }

  public void setPictureaddress(String pictureaddress) {
    this.pictureaddress = pictureaddress;
  }

  @Override
  public String toString() {
    return "Signcode{" +
            "signinid='" + signinid + '\'' +
            ", activityid='" + activityid + '\'' +
            ", leaderid='" + leaderid + '\'' +
            ", buildtime='" + buildtime + '\'' +
            ", pictureaddress='" + pictureaddress + '\'' +
            '}';
  }
}
