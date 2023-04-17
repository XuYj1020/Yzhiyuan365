package com.XYJ.pojo;


public class Auditstatus {

  private int auditstatusid;
  private String status;


  public int getAuditstatusid() {
    return auditstatusid;
  }

  public void setAuditstatusid(int auditstatusid) {
    this.auditstatusid = auditstatusid;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "Auditstatus{" +
            "auditstatusid=" + auditstatusid +
            ", status='" + status + '\'' +
            '}';
  }
}
