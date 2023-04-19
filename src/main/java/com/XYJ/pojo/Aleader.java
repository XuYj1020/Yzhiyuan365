package com.XYJ.pojo;


public class Aleader {

  private String leaderid;
  private String activityid;
  private String stafid;
  private Activity activitys;
  private Acstyle acstyles;
private int activestatusid;

  private Areanew areanews;

  //  录取方式
  private Admissionpolicy admissionpolicys;

  private Aapplication aapplications;
  private Activestatus activestatus;

  private Signrecord signrecords;

  private int auditstatusid;
  private int isaleava;

  private Applicationreview applicationreviews;

  private Activityreview activityreview;

  private Organization organizations;

  public int getActivestatusid() {
    return activestatusid;
  }

  public void setActivestatusid(int activestatusid) {
    this.activestatusid = activestatusid;
  }

  public Organization getOrganizations() {
    return organizations;
  }

  public void setOrganizations(Organization organizations) {
    this.organizations = organizations;
  }

  public Activity getActivitys() {
    return activitys;
  }

  public void setActivitys(Activity activitys) {
    this.activitys = activitys;
  }

  public Acstyle getAcstyles() {
    return acstyles;
  }

  public void setAcstyles(Acstyle acstyles) {
    this.acstyles = acstyles;
  }

  public Areanew getAreanews() {
    return areanews;
  }

  public void setAreanews(Areanew areanews) {
    this.areanews = areanews;
  }

  public Admissionpolicy getAdmissionpolicys() {
    return admissionpolicys;
  }

  public void setAdmissionpolicys(Admissionpolicy admissionpolicys) {
    this.admissionpolicys = admissionpolicys;
  }

  public Aapplication getAapplications() {
    return aapplications;
  }

  public void setAapplications(Aapplication aapplications) {
    this.aapplications = aapplications;
  }

  public Activestatus getActivestatus() {
    return activestatus;
  }

  public void setActivestatus(Activestatus activestatus) {
    this.activestatus = activestatus;
  }

  public Signrecord getSignrecords() {
    return signrecords;
  }

  public void setSignrecords(Signrecord signrecords) {
    this.signrecords = signrecords;
  }

  public int getAuditstatusid() {
    return auditstatusid;
  }

  public void setAuditstatusid(int auditstatusid) {
    this.auditstatusid = auditstatusid;
  }

  public int getIsaleava() {
    return isaleava;
  }

  public void setIsaleava(int isaleava) {
    this.isaleava = isaleava;
  }

  public Applicationreview getApplicationreviews() {
    return applicationreviews;
  }

  public void setApplicationreviews(Applicationreview applicationreviews) {
    this.applicationreviews = applicationreviews;
  }

  public Activityreview getActivityreview() {
    return activityreview;
  }

  public void setActivityreview(Activityreview activityreview) {
    this.activityreview = activityreview;
  }

  public String getLeaderid() {
    return leaderid;
  }

  public void setLeaderid(String leaderid) {
    this.leaderid = leaderid;
  }


  public String getActivityid() {
    return activityid;
  }

  public void setActivityid(String activityid) {
    this.activityid = activityid;
  }


  public String getStafid() {
    return stafid;
  }

  public void setStafid(String stafid) {
    this.stafid = stafid;
  }

  @Override
  public String toString() {
    return "Aleader{" +
            "leaderid='" + leaderid + '\'' +
            ", activityid='" + activityid + '\'' +
            ", stafid='" + stafid + '\'' +
            ", activitys=" + activitys +
            ", acstyles=" + acstyles +
            ", activestatusid=" + activestatusid +
            ", areanews=" + areanews +
            ", admissionpolicys=" + admissionpolicys +
            ", aapplications=" + aapplications +
            ", activestatus=" + activestatus +
            ", signrecords=" + signrecords +
            ", auditstatusid=" + auditstatusid +
            ", isaleava=" + isaleava +
            ", applicationreviews=" + applicationreviews +
            ", activityreview=" + activityreview +
            ", organizations=" + organizations +
            '}';
  }
}
