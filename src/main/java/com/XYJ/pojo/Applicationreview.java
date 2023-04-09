package com.XYJ.pojo;


public class Applicationreview {

  private String auditid;
  private String activityid;
  private String volunteerid;
  private String leaderid;
  private int auditstatusid;
  private String etd;
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


  public String getVolunteerid() {
    return volunteerid;
  }

  public void setVolunteerid(String volunteerid) {
    this.volunteerid = volunteerid;
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


  public String getEtd() {
    return etd;
  }

  public void setEtd(String etd) {
    this.etd = etd;
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
    return "Applicationreview{" +
            "auditid='" + auditid + '\'' +
            ", activityid='" + activityid + '\'' +
            ", volunteerid='" + volunteerid + '\'' +
            ", leaderid='" + leaderid + '\'' +
            ", auditstatusid=" + auditstatusid +
            ", etd='" + etd + '\'' +
            ", eta='" + eta + '\'' +
            ", feedback='" + feedback + '\'' +
            '}';
  }
}
