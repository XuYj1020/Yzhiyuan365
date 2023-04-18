package com.XYJ.pojo;


public class Memberlevel {

  private int mlevelid;
  private String mlevel;


  public int getMlevelid() {
    return mlevelid;
  }

  public void setMlevelid(int mlevelid) {
    this.mlevelid = mlevelid;
  }


  public String getMlevel() {
    return mlevel;
  }

  public void setMlevel(String mlevel) {
    this.mlevel = mlevel;
  }

  @Override
  public String toString() {
    return "Memberlevel{" +
            "mlevelid=" + mlevelid +
            ", mlevel='" + mlevel + '\'' +
            '}';
  }
}
