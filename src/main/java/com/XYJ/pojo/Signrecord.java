package com.XYJ.pojo;


public class Signrecord {

  private String recordid;
  private String signinid;
  private String applicationid;
  private String signintime;
  private String signouttime;


  public String getRecordid() {
    return recordid;
  }

  public void setRecordid(String recordid) {
    this.recordid = recordid;
  }


  public String getSigninid() {
    return signinid;
  }

  public void setSigninid(String signinid) {
    this.signinid = signinid;
  }


  public String getApplicationid() {
    return applicationid;
  }

  public void setApplicationid(String applicationid) {
    this.applicationid = applicationid;
  }


  public String getSignintime() {
    return signintime;
  }

  public void setSignintime(String signintime) {
    this.signintime = signintime;
  }


  public String getSignouttime() {
    return signouttime;
  }

  public void setSignouttime(String signouttime) {
    this.signouttime = signouttime;
  }

  @Override
  public String toString() {
    return "Signrecord{" +
            "recordid='" + recordid + '\'' +
            ", signinid='" + signinid + '\'' +
            ", applicationid='" + applicationid + '\'' +
            ", signintime='" + signintime + '\'' +
            ", signouttime='" + signouttime + '\'' +
            '}';
  }
}
