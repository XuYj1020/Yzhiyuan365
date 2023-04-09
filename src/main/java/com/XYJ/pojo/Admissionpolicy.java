 package com.XYJ.pojo;


public class Admissionpolicy {

  private int admissionpolicyid;
  private String admissionpolicy;


  public int getAdmissionpolicyid() {
    return admissionpolicyid;
  }

  public void setAdmissionpolicyid(int admissionpolicyid) {
    this.admissionpolicyid = admissionpolicyid;
  }


  public String getAdmissionpolicy() {
    return admissionpolicy;
  }

  public void setAdmissionpolicy(String admissionpolicy) {
    this.admissionpolicy = admissionpolicy;
  }

  @Override
  public String toString() {
    return "Admissionpolicy{" +
            "admissionpolicyid=" + admissionpolicyid +
            ", admissionpolicy='" + admissionpolicy + '\'' +
            '}';
  }
}
