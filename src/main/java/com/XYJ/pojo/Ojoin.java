package com.XYJ.pojo;


public class Ojoin {

  private String applicationid;
  private String volunteerid;
  private String organizationid;
  private int    auditstatusid;
  private String applicationtime;
  private String eta;
  private String feedback;

  private Omembers omembers;
  private Organization organizations;
  private User users;

  private Auditstatus auditstatus;


  public Auditstatus getAuditstatus() {
    return auditstatus;
  }

  public void setAuditstatus(Auditstatus auditstatus) {
    this.auditstatus = auditstatus;
  }

  public Omembers getOmembers() {
    return omembers;
  }

  public void setOmembers(Omembers omembers) {
    this.omembers = omembers;
  }

  public Organization getOrganizations() {
    return organizations;
  }

  public void setOrganizations(Organization organizations) {
    this.organizations = organizations;
  }

  public User getUsers() {
    return users;
  }

  public void setUsers(User users) {
    this.users = users;
  }

  public String getApplicationid() {
    return applicationid;
  }

  public void setApplicationid(String applicationid) {
    this.applicationid = applicationid;
  }


  public String getVolunteerid() {
    return volunteerid;
  }

  public void setVolunteerid(String volunteerid) {
    this.volunteerid = volunteerid;
  }


  public String getOrganizationid() {
    return organizationid;
  }

  public void setOrganizationid(String organizationid) {
    this.organizationid = organizationid;
  }


  public int getAuditstatusid() {
    return auditstatusid;
  }

  public void setAuditstatusid(int auditstatusid) {
    this.auditstatusid = auditstatusid;
  }


  public String getApplicationtime() {
    return applicationtime;
  }

  public void setApplicationtime(String applicationtime) {
    this.applicationtime = applicationtime;
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
    return "Ojoin{" +
            "applicationid='" + applicationid + '\'' +
            ", volunteerid='" + volunteerid + '\'' +
            ", organizationid='" + organizationid + '\'' +
            ", auditstatusid=" + auditstatusid +
            ", applicationtime='" + applicationtime + '\'' +
            ", eta='" + eta + '\'' +
            ", feedback='" + feedback + '\'' +
            ", omembers=" + omembers +
            ", organizations=" + organizations +
            ", users=" + users +
            ", auditstatus=" + auditstatus +
            '}';
  }
}
