package com.XYJ.pojo;


public class Activityreview {

  private String auditid;
  private String activityid;
  private String id;
  private int auditstatusid;
  private String eta;
  private String feedback;


  public String getAuditid() {
    return auditid;
  }

  public void setAuditid(String auditid) {
    this.auditid = auditid;
  }


  public String getActivityid() {
    return activityid;
  }

  public void setActivityid(String activityid) {
    this.activityid = activityid;
  }


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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
    return "Activityreview{" +
            "auditid='" + auditid + '\'' +
            ", activityid='" + activityid + '\'' +
            ", id='" + id + '\'' +
            ", auditstatusid=" + auditstatusid +
            ", eta='" + eta + '\'' +
            ", feedback='" + feedback + '\'' +
            '}';
  }
}
