package com.XYJ.pojo;


import java.sql.Timestamp;

public class Activity {

  private String activityid;
  private String organizationid;
  private String title;
  private String introduction;
  private String starttime;
  private String endtime;
  private int province;
  private int city;
  private int district;
  private String place;
  private int numberofrequiredvolunteer;
  private int numberofenrolledvolunteer;
  private int activestatusid;
  private String creationtime;
  private String enrolmentopeningtime;
  private String enrolmentdeadline;
  private double volunteerhours;
  private String pictureaddress;
  private int admissionpolicy;
  private int creditscorerequirement;
  private int leaveapproval;
  private int acstyle;

  private int havealeader;
  private Acstyle acstyles;

  private Aleave aleaves;
  private Organization organizations;

//  private Area area;

  private Areanew areanews;

//  录取方式
  private Admissionpolicy admissionpolicys;

  private Aapplication aapplications;
  private Activestatus activestatus;

  private Signrecord signrecords;

  private int isaleava;

  public Aleave getAleaves() {
    return aleaves;
  }

  public void setAleaves(Aleave aleaves) {
    this.aleaves = aleaves;
  }

  public int getIsaleava() {
    return isaleava;
  }

  public void setIsaleava(int isaleava) {
    this.isaleava = isaleava;
  }

  public Signrecord getSignrecords() {
    return signrecords;
  }

  public void setSignrecords(Signrecord signrecords) {
    this.signrecords = signrecords;
  }

  private String volunteerid;
  private String applicationstatusid;

  public String getVolunteerid() {
    return volunteerid;
  }

  public void setVolunteerid(String volunteerid) {
    this.volunteerid = volunteerid;
  }

  public String getApplicationstatusid() {
    return applicationstatusid;
  }

  public void setApplicationstatusid(String applicationstatusid) {
    this.applicationstatusid = applicationstatusid;
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

  public int getHavealeader() {
    return havealeader;
  }

  public void setHavealeader(int havealeader) {
    this.havealeader = havealeader;
  }

  public Organization getOrganizations() {
    return organizations;
  }

  public void setOrganizations(Organization organizations) {
    this.organizations = organizations;
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

  public Acstyle getAcstyles() {
    return acstyles;
  }

  public void setAcstyles(Acstyle acstyles) {
    this.acstyles = acstyles;
  }

  public String getActivityid() {
    return activityid;
  }

  public void setActivityid(String activityid) {
    this.activityid = activityid;
  }


  public String getOrganizationid() {
    return organizationid;
  }

  public void setOrganizationid(String organizationid) {
    this.organizationid = organizationid;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getIntroduction() {
    return introduction;
  }

  public void setIntroduction(String introduction) {
    this.introduction = introduction;
  }


  public String getStarttime() {
    return starttime;
  }

  public void setStarttime(String starttime) {
    this.starttime = starttime;
  }


  public String getEndtime() {
    return endtime;
  }

  public void setEndtime(String endtime) {
    this.endtime = endtime;
  }


  public int getProvince() {
    return province;
  }

  public void setProvince(int province) {
    this.province = province;
  }


  public int getCity() {
    return city;
  }

  public void setCity(int city) {
    this.city = city;
  }


  public int getDistrict() {
    return district;
  }

  public void setDistrict(int district) {
    this.district = district;
  }


  public String getPlace() {
    return place;
  }

  public void setPlace(String place) {
    this.place = place;
  }


  public int getNumberofrequiredvolunteer() {
    return numberofrequiredvolunteer;
  }

  public void setNumberofrequiredvolunteer(int numberofrequiredvolunteer) {
    this.numberofrequiredvolunteer = numberofrequiredvolunteer;
  }


  public int getNumberofenrolledvolunteer() {
    return numberofenrolledvolunteer;
  }

  public void setNumberofenrolledvolunteer(int numberofenrolledvolunteer) {
    this.numberofenrolledvolunteer = numberofenrolledvolunteer;
  }


  public int getActivestatusid() {
    return activestatusid;
  }

  public void setActivestatusid(int activestatusid) {
    this.activestatusid = activestatusid;
  }


  public String getCreationtime() {
    return creationtime;
  }

  public void setCreationtime(String creationtime) {
    this.creationtime = creationtime;
  }


  public String getEnrolmentopeningtime() {
    return enrolmentopeningtime;
  }

  public void setEnrolmentopeningtime(String enrolmentopeningtime) {
    this.enrolmentopeningtime = enrolmentopeningtime;
  }


  public String getEnrolmentdeadline() {
    return enrolmentdeadline;
  }

  public void setEnrolmentdeadline(String enrolmentdeadline) {
    this.enrolmentdeadline = enrolmentdeadline;
  }


  public double getVolunteerhours() {
    return volunteerhours;
  }

  public void setVolunteerhours(double volunteerhours) {
    this.volunteerhours = volunteerhours;
  }


  public String getPictureaddress() {
    return pictureaddress;
  }

  public void setPictureaddress(String pictureaddress) {
    this.pictureaddress = pictureaddress;
  }


  public int getAdmissionpolicy() {
    return admissionpolicy;
  }

  public void setAdmissionpolicy(int admissionpolicy) {
    this.admissionpolicy = admissionpolicy;
  }


  public int getCreditscorerequirement() {
    return creditscorerequirement;
  }

  public void setCreditscorerequirement(int creditscorerequirement) {
    this.creditscorerequirement = creditscorerequirement;
  }


  public int getLeaveapproval() {
    return leaveapproval;
  }

  public void setLeaveapproval(int leaveapproval) {
    this.leaveapproval = leaveapproval;
  }


  public int getAcstyle() {
    return acstyle;
  }

  public void setAcstyle(int acstyle) {
    this.acstyle = acstyle;
  }


//  @Override
//  public String toString() {
//    return "Activity{" +
//            "activityid='" + activityid + '\'' +
//            ", organizationid='" + organizationid + '\'' +
//            ", title='" + title + '\'' +
//            ", introduction='" + introduction + '\'' +
//            ", starttime='" + starttime + '\'' +
//            ", endtime='" + endtime + '\'' +
//            ", province=" + province +
//            ", city=" + city +
//            ", district=" + district +
//            ", place='" + place + '\'' +
//            ", numberofrequiredvolunteer=" + numberofrequiredvolunteer +
//            ", numberofenrolledvolunteer=" + numberofenrolledvolunteer +
//            ", activestatusid=" + activestatusid +
//            ", creationtime='" + creationtime + '\'' +
//            ", enrolmentopeningtime='" + enrolmentopeningtime + '\'' +
//            ", enrolmentdeadline='" + enrolmentdeadline + '\'' +
//            ", volunteerhours=" + volunteerhours +
//            ", pictureaddress='" + pictureaddress + '\'' +
//            ", admissionpolicy=" + admissionpolicy +
//            ", creditscorerequirement=" + creditscorerequirement +
//            ", leaveapproval=" + leaveapproval +
//            ", acstyle=" + acstyle +
//            '}';
//  }


  @Override
  public String toString() {
    return "Activity{" +
            "activityid='" + activityid + '\'' +
            ", organizationid='" + organizationid + '\'' +
            ", title='" + title + '\'' +
            ", introduction='" + introduction + '\'' +
            ", starttime='" + starttime + '\'' +
            ", endtime='" + endtime + '\'' +
            ", province=" + province +
            ", city=" + city +
            ", district=" + district +
            ", place='" + place + '\'' +
            ", numberofrequiredvolunteer=" + numberofrequiredvolunteer +
            ", numberofenrolledvolunteer=" + numberofenrolledvolunteer +
            ", activestatusid=" + activestatusid +
            ", creationtime='" + creationtime + '\'' +
            ", enrolmentopeningtime='" + enrolmentopeningtime + '\'' +
            ", enrolmentdeadline='" + enrolmentdeadline + '\'' +
            ", volunteerhours=" + volunteerhours +
            ", pictureaddress='" + pictureaddress + '\'' +
            ", admissionpolicy=" + admissionpolicy +
            ", creditscorerequirement=" + creditscorerequirement +
            ", leaveapproval=" + leaveapproval +
            ", acstyle=" + acstyle +
            ", havealeader=" + havealeader +
            ", acstyles=" + acstyles +
            ", aleaves=" + aleaves +
            ", organizations=" + organizations +
            ", areanews=" + areanews +
            ", admissionpolicys=" + admissionpolicys +
            ", aapplications=" + aapplications +
            ", activestatus=" + activestatus +
            ", signrecords=" + signrecords +
            ", isaleava=" + isaleava +
            ", volunteerid='" + volunteerid + '\'' +
            ", applicationstatusid='" + applicationstatusid + '\'' +
            '}';
  }
}
