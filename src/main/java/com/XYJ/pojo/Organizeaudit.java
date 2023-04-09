package com.XYJ.pojo;


public class Organizeaudit {

  private String auditid;
  private String organizationid;
  private String reviewerid;
  private int auditstatusid;
  private String eta;
  private String feedback;


  public String getAuditid() {
    return auditid;
  }

  public void setAuditid(String auditid) {
    this.auditid = auditid;
  }


  public String getOrganizationid() {
    return organizationid;
  }

  public void setOrganizationid(String organizationid) {
    this.organizationid = organizationid;
  }


  public String getReviewerid() {
    return reviewerid;
  }

  public void setReviewerid(String reviewerid) {
    this.reviewerid = reviewerid;
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
    return "Organizeaudit{" +
            "auditid='" + auditid + '\'' +
            ", organizationid='" + organizationid + '\'' +
            ", reviewerid='" + reviewerid + '\'' +
            ", auditstatusid=" + auditstatusid +
            ", eta='" + eta + '\'' +
            ", feedback='" + feedback + '\'' +
            '}';
  }
}
