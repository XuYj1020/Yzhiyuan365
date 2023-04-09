package com.XYJ.pojo;


public class Activestatus {

  private int activestatusid;
  private String status;


  public int getActivestatusid() {
    return activestatusid;
  }

  public void setActivestatusid(int activestatusid) {
    this.activestatusid = activestatusid;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "Activestatus{" +
            "activestatusid=" + activestatusid +
            ", status='" + status + '\'' +
            '}';
  }
}
