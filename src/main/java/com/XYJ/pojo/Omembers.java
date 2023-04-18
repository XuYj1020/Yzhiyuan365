package com.XYJ.pojo;


public class Omembers {

  private String stafid;
  private String organizationid;
  private String volunteerid;
  private int    memberstatusid;
  private int    mlevelid;
  private String applicationid;
  private String jointime;

  private Organization organizations;
  private User users;

private Memberlevel memberlevels;
private Memberstatus memberstatus;

  public Memberlevel getMemberlevels() {
    return memberlevels;
  }

  public void setMemberlevels(Memberlevel memberlevels) {
    this.memberlevels = memberlevels;
  }

  public Memberstatus getMemberstatus() {
    return memberstatus;
  }

  public void setMemberstatus(Memberstatus memberstatus) {
    this.memberstatus = memberstatus;
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

  public String getStafid() {
    return stafid;
  }

  public void setStafid(String stafid) {
    this.stafid = stafid;
  }


  public String getOrganizationid() {
    return organizationid;
  }

  public void setOrganizationid(String organizationid) {
    this.organizationid = organizationid;
  }


  public String getVolunteerid() {
    return volunteerid;
  }

  public void setVolunteerid(String volunteerid) {
    this.volunteerid = volunteerid;
  }


  public int getMemberstatusid() {
    return memberstatusid;
  }

  public void setMemberstatusid(int memberstatusid) {
    this.memberstatusid = memberstatusid;
  }


  public int getMlevelid() {
    return mlevelid;
  }

  public void setMlevelid(int mlevelid) {
    this.mlevelid = mlevelid;
  }


  public String getApplicationid() {
    return applicationid;
  }

  public void setApplicationid(String applicationid) {
    this.applicationid = applicationid;
  }


  public String getJointime() {
    return jointime;
  }

  public void setJointime(String jointime) {
    this.jointime = jointime;
  }

  @Override
  public String toString() {
    return "Omembers{" +
            "stafid='" + stafid + '\'' +
            ", organizationid='" + organizationid + '\'' +
            ", volunteerid='" + volunteerid + '\'' +
            ", memberstatusid=" + memberstatusid +
            ", mlevelid=" + mlevelid +
            ", applicationid='" + applicationid + '\'' +
            ", jointime='" + jointime + '\'' +
            ", organizations=" + organizations +
            ", users=" + users +
            ", memberlevels=" + memberlevels +
            ", memberstatus=" + memberstatus +
            '}';
  }
}
