package com.XYJ.pojo;


public class Leavereview {

  private String leaveauditid;
  private String leaveapplicationid;
  private String leaderid;
  private int auditstatusid;
  private String eta;
  private String feedback;


  public String getLeaveauditid() {
    return leaveauditid;
  }

  public void setLeaveauditid(String leaveauditid) {
    this.leaveauditid = leaveauditid;
  }

  public String getLeaveapplicationid() {
    return leaveapplicationid;
  }

  public void setLeaveapplicationid(String leaveapplicationid) {
    this.leaveapplicationid = leaveapplicationid;
  }


  public String getLeaderid() {
    return leaderid;
  }

  public void setLeaderid(String leaderid) {
    this.leaderid = leaderid;
  }


  public int getAuditstatusid() {
    return auditstatusid;
  }

  public void setAuditstatusid(int auditstatusid) {
    this.auditstatusid = auditstatusid;
  }


  public String getEta() {
    return eta;
  }

  public void setEta(String eta) {
    this.eta = eta;
  }


  public String getFeedback() {
    return feedback;
  }

  public void setFeedback(String feedback) {
    this.feedback = feedback;
  }

  @Override
  public String toString() {
    return "Leavereview{" +
            "leaveauditid='" + leaveauditid + '\'' +
            ", leaveapplicationid='" + leaveapplicationid + '\'' +
            ", leaderid='" + leaderid + '\'' +
            ", auditstatusid=" + auditstatusid +
            ", eta='" + eta + '\'' +
            ", feedback='" + feedback + '\'' +
            '}';
  }
}
