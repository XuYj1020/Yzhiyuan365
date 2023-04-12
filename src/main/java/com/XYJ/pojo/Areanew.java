package com.XYJ.pojo;

//数据完全匹配联级选择器
public class Areanew {

  private String areaCode;
  private int parentCode;
  private int level;
  private String name;
  private String wholeName;
  private String lon;
  private String lat;
  private String cityCode;
  private String zipCode;
  private String pinYin;
  private String simplePy;
  private String perPinYin;


  public String getAreaCode() {
    return areaCode;
  }

  public void setAreaCode(String areaCode) {
    this.areaCode = areaCode;
  }


  public int getParentCode() {
    return parentCode;
  }

  public void setParentCode(int parentCode) {
    this.parentCode = parentCode;
  }


  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getWholeName() {
    return wholeName;
  }

  public void setWholeName(String wholeName) {
    this.wholeName = wholeName;
  }


  public String getLon() {
    return lon;
  }

  public void setLon(String lon) {
    this.lon = lon;
  }


  public String getLat() {
    return lat;
  }

  public void setLat(String lat) {
    this.lat = lat;
  }


  public String getCityCode() {
    return cityCode;
  }

  public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
  }


  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }


  public String getPinYin() {
    return pinYin;
  }

  public void setPinYin(String pinYin) {
    this.pinYin = pinYin;
  }


  public String getSimplePy() {
    return simplePy;
  }

  public void setSimplePy(String simplePy) {
    this.simplePy = simplePy;
  }


  public String getPerPinYin() {
    return perPinYin;
  }

  public void setPerPinYin(String perPinYin) {
    this.perPinYin = perPinYin;
  }

  @Override
  public String toString() {
    return "Areanew{" +
            "areaCode='" + areaCode + '\'' +
            ", parentCode=" + parentCode +
            ", level=" + level +
            ", name='" + name + '\'' +
            ", wholeName='" + wholeName + '\'' +
            ", lon='" + lon + '\'' +
            ", lat='" + lat + '\'' +
            ", cityCode='" + cityCode + '\'' +
            ", zipCode='" + zipCode + '\'' +
            ", pinYin='" + pinYin + '\'' +
            ", simplePy='" + simplePy + '\'' +
            ", perPinYin='" + perPinYin + '\'' +
            '}';
  }
}
