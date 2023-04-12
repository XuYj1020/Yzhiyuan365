package com.XYJ.pojo;

public class Organization {
    private String organizationid ;
    private String phone ;
    private String password ;
    private int     otype ;
    private int     registrationstatus ;
    private String  unifiedcode ;
    private String  name ;
    private String idnumber ;
    private String  oname ;
    private int     province ;
    private int     city ;
    private int     district ;
    private String  oaddress ;
    private String  oemail ;
    private String  ointroduce ;
    private String  olevel ;
    private String  registrationtime ;
    private String  lastlogintime ;
    private String  pictureaddress ;

    private int     userstatusid ;

//    连接查询，在多方创建一方的对象
    private Otype otypes;
    private Registrationstatus registrationstatuss;

//    private Area areas;

    private Areanew areanews;

    public Areanew getAreanews() {
        return areanews;
    }

    public void setAreanews(Areanew areanews) {
        this.areanews = areanews;
    }

    public String getOrganizationid() {
        return organizationid;
    }

    public void setOrganizationid(String organizationid) {
        this.organizationid = organizationid;
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

    public int getOtype() {
        return otype;
    }

    public void setOtype(int otype) {
        this.otype = otype;
    }

    public int getRegistrationstatus() {
        return registrationstatus;
    }

    public void setRegistrationstatus(int registrationstatus) {
        this.registrationstatus = registrationstatus;
    }

    public String getUnifiedcode() {
        return unifiedcode;
    }

    public void setUnifiedcode(String unifiedcode) {
        this.unifiedcode = unifiedcode;
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

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname;
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

    public String getOaddress() {
        return oaddress;
    }

    public void setOaddress(String oaddress) {
        this.oaddress = oaddress;
    }

    public String getOemail() {
        return oemail;
    }

    public void setOemail(String oemail) {
        this.oemail = oemail;
    }

    public String getOintroduce() {
        return ointroduce;
    }

    public void setOintroduce(String ointroduce) {
        this.ointroduce = ointroduce;
    }

    public String getOlevel() {
        return olevel;
    }

    public void setOlevel(String olevel) {
        this.olevel = olevel;
    }

    public String getRegistrationtime() {
        return registrationtime;
    }

    public void setRegistrationtime(String registrationtime) {
        this.registrationtime = registrationtime;
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

    public int getUserstatusid() {
        return userstatusid;
    }

    public void setUserstatusid(int userstatusid) {
        this.userstatusid = userstatusid;
    }

    public Otype getOtypes() {
        return otypes;
    }

    public void setOtypes(Otype otypes) {
        this.otypes = otypes;
    }

    public Registrationstatus getRegistrationstatuss() {
        return registrationstatuss;
    }

    public void setRegistrationstatuss(Registrationstatus registrationstatuss) {
        this.registrationstatuss = registrationstatuss;
    }

    /*
    @Override
    public String toString() {
        return "Organization{" +
                "organizationid='" + organizationid + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", otype=" + otype +
                ", registrationstatus=" + registrationstatus +
                ", unifiedcode='" + unifiedcode + '\'' +
                ", name='" + name + '\'' +
                ", idnumber='" + idnumber + '\'' +
                ", oname='" + oname + '\'' +
                ", province=" + province +
                ", city=" + city +
                ", district=" + district +
                ", oaddress='" + oaddress + '\'' +
                ", oemail='" + oemail + '\'' +
                ", ointroduce='" + ointroduce + '\'' +
                ", olevel='" + olevel + '\'' +
                ", registrationtime='" + registrationtime + '\'' +
                ", lastlogintime='" + lastlogintime + '\'' +
                ", pictureaddress='" + pictureaddress + '\'' +
                ", userstatusid=" + userstatusid +
                '}';
    }
     */

    @Override
    public String toString() {
        return "Organization{" +
                "organizationid='" + organizationid + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", otype=" + otype +
                ", registrationstatus=" + registrationstatus +
                ", unifiedcode='" + unifiedcode + '\'' +
                ", name='" + name + '\'' +
                ", idnumber='" + idnumber + '\'' +
                ", oname='" + oname + '\'' +
                ", province=" + province +
                ", city=" + city +
                ", district=" + district +
                ", oaddress='" + oaddress + '\'' +
                ", oemail='" + oemail + '\'' +
                ", ointroduce='" + ointroduce + '\'' +
                ", olevel='" + olevel + '\'' +
                ", registrationtime='" + registrationtime + '\'' +
                ", lastlogintime='" + lastlogintime + '\'' +
                ", pictureaddress='" + pictureaddress + '\'' +
                ", userstatusid=" + userstatusid +
                ", otypes=" + otypes +
                ", registrationstatuss=" + registrationstatuss +
                ", areanews=" + areanews +
                '}';
    }
}
