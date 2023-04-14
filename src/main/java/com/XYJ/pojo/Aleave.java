package com.XYJ.pojo;


public class Aleave {

  private String leaveapplicationid;
  private String applicationid;
  private String applicationtime;
  private String reason;
  private String pictureaddress;
  private int statusid;


  public String getLeaveapplicationid() {
    return leaveapplicationid;
  }

  public void setLeaveapplicationid(String leaveapplicationid) {
    this.leaveapplicationid = leaveapplicationid;
  }


  public String getApplicationid() {
    return applicationid;
  }

  public void setApplicationid(String applicationid) {
    this.applicationid = applicationid;
  }


  public String getApplicationtime() {
    return applicationtime;
  }

  public void setApplicationtime(String applicationtime) {
    this.applicationtime = applicationtime;
  }


  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }


  public String getPictureaddress() {
    return pictureaddress;
  }

  public void setPictureaddress(String pictureaddress) {
    this.pictureaddress = pictureaddress;
  }


  public int getStatusid() {
    return statusid;
  }

  public void setStatusid(int statusid) {
    this.statusid = statusid;
  }

  @Override
  public String toString() {
    return "Aleave{" +
            "leaveapplicationid='" + leaveapplicationid + '\'' +
            ", applicationid='" + applicationid + '\'' +
            ", applicationtime='" + applicationtime + '\'' +
            ", reason='" + reason + '\'' +
            ", pictureaddress='" + pictureaddress + '\'' +
            ", statusid=" + statusid +
            '}';
  }
}
