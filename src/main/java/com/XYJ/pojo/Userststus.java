package com.XYJ.pojo;


public class Userststus {

  private int userstatusid;
  private String status;


  public int getUserstatusid() {
    return userstatusid;
  }

  public void setUserstatusid(int userstatusid) {
    this.userstatusid = userstatusid;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "Userststus{" +
            "userstatusid=" + userstatusid +
            ", status='" + status + '\'' +
            '}';
  }
}
