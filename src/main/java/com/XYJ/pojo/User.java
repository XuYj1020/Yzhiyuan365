package com.XYJ.pojo;

import java.util.List;

public class User {
  private String  volunteerid        ;
  private String  phone              ;
  private String  password           ;
  private String  name               ;
  private String  idnumber           ;
  private String  gender             ;
  private String  birthday           ;
  private int     province           ;
  private int     city               ;
  private int     district           ;
  private String  address            ;
  private int     education          ;
  private String  occupation         ;
  private String  politicaliandscape ;
  private String  email              ;
  private String  volunteerhours     ;
  private String  volunteercoins     ;
  private int     credit             ;
  private String  registrationtime   ;
  private Integer  userstatusid      ;
  private String  lastlogintime      ;
  private String  pictureaddress     ;

  private Aleader aleaders;

  private Occupation occupations;

  private Education educations;
  private Politicaliandscape politicaliandscapes;

//  private Area areas;

    private Areanew areanews;
    public Occupation getOccupations() {
        return occupations;
    }

    public void setOccupations(Occupation occupations) {
        this.occupations = occupations;
    }

    public Education getEducations() {
        return educations;
    }

    public void setEducations(Education educations) {
        this.educations = educations;
    }

    public Politicaliandscape getPoliticaliandscapes() {
        return politicaliandscapes;
    }

    public void setPoliticaliandscapes(Politicaliandscape politicaliandscapes) {
        this.politicaliandscapes = politicaliandscapes;
    }

    public Areanew getAreanews() {
        return areanews;
    }

    public void setAreanews(Areanew areanews) {
        this.areanews = areanews;
    }

    public Aleader getAleaders() {
        return aleaders;
    }

    public void setAleaders(Aleader aleaders) {
        this.aleaders = aleaders;
    }

    public String getVolunteerid() {
        return volunteerid;
    }

    public void setVolunteerid(String volunteerid) {
        this.volunteerid = volunteerid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getEducation() {
        return education;
    }

    public void setEducation(int education) {
        this.education = education;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getPoliticaliandscape() {
        return politicaliandscape;
    }

    public void setPoliticaliandscape(String politicaliandscape) {
        this.politicaliandscape = politicaliandscape;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVolunteerhours() {
        return volunteerhours;
    }

    public void setVolunteerhours(String volunteerhours) {
        this.volunteerhours = volunteerhours;
    }

    public String getVolunteercoins() {
        return volunteercoins;
    }

    public void setVolunteercoins(String volunteercoins) {
        this.volunteercoins = volunteercoins;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String getRegistrationtime() {
        return registrationtime;
    }

    public void setRegistrationtime(String registrationtime) {
        this.registrationtime = registrationtime;
    }

    public Integer getUserstatusid() {
        return userstatusid;
    }

    public void setUserstatusid(Integer userstatusid) {
        this.userstatusid = userstatusid;
    }

    public String getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(String lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    public String getPictureaddress() {
        return pictureaddress;
    }

    public void setPictureaddress(String pictureaddress) {
        this.pictureaddress = pictureaddress;
    }

    /*
    @Override
    public String toString() {
        return "User{" +
                "volunteerid='" + volunteerid + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", idnumber='" + idnumber + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday='" + birthday + '\'' +
                ", province=" + province +
                ", city=" + city +
                ", district=" + district +
                ", address='" + address + '\'' +
                ", education=" + education +
                ", occupation='" + occupation + '\'' +
                ", politicaliandscape='" + politicaliandscape + '\'' +
                ", email='" + email + '\'' +
                ", volunteerhours='" + volunteerhours + '\'' +
                ", volunteercoins='" + volunteercoins + '\'' +
                ", credit=" + credit +
                ", registrationtime='" + registrationtime + '\'' +
                ", userstatusid=" + userstatusid +
                ", lastlogintime='" + lastlogintime + '\'' +
                ", pictureaddress='" + pictureaddress + '\'' +
                '}';
    }

     */

    @Override
    public String toString() {
        return "User{" +
                "volunteerid='" + volunteerid + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", idnumber='" + idnumber + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday='" + birthday + '\'' +
                ", province=" + province +
                ", city=" + city +
                ", district=" + district +
                ", address='" + address + '\'' +
                ", education=" + education +
                ", occupation='" + occupation + '\'' +
                ", politicaliandscape='" + politicaliandscape + '\'' +
                ", email='" + email + '\'' +
                ", volunteerhours='" + volunteerhours + '\'' +
                ", volunteercoins='" + volunteercoins + '\'' +
                ", credit=" + credit +
                ", registrationtime='" + registrationtime + '\'' +
                ", userstatusid=" + userstatusid +
                ", lastlogintime='" + lastlogintime + '\'' +
                ", pictureaddress='" + pictureaddress + '\'' +
                ", aleaders=" + aleaders +
                ", occupations=" + occupations +
                ", educations=" + educations +
                ", politicaliandscapes=" + politicaliandscapes +
                ", areanews=" + areanews +
                '}';
    }
}
