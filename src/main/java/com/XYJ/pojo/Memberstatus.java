package com.XYJ.pojo;


public class Memberstatus {

  private int memberstatusid;
  private String status;


  public int getMemberstatusid() {
    return memberstatusid;
  }

  public void setMemberstatusid(int memberstatusid) {
    this.memberstatusid = memberstatusid;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "Memberstatus{" +
            "memberstatusid=" + memberstatusid +
            ", status='" + status + '\'' +
            '}';
  }
}
