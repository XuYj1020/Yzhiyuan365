package com.XYJ.pojo;


public class Adminr {

  private String daminid;
  private String password;


  public String getDaminid() {
    return daminid;
  }

  public void setDaminid(String daminid) {
    this.daminid = daminid;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString() {
    return "Adminr{" +
            "daminid='" + daminid + '\'' +
            ", password='" + password + '\'' +
            '}';
  }
}
