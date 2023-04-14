package com.XYJ.pojo;


public class Evaluation {

  private String evaluationid;
  private String volunteerid;
  private String activityid;
  private String evaluationtime;
  private String content;
  private int score;


  public String getEvaluationid() {
    return evaluationid;
  }

  public void setEvaluationid(String evaluationid) {
    this.evaluationid = evaluationid;
  }


  public String getVolunteerid() {
    return volunteerid;
  }

  public void setVolunteerid(String volunteerid) {
    this.volunteerid = volunteerid;
  }


  public String getActivityid() {
    return activityid;
  }

  public void setActivityid(String activityid) {
    this.activityid = activityid;
  }


  public String getEvaluationtime() {
    return evaluationtime;
  }

  public void setEvaluationtime(String evaluationtime) {
    this.evaluationtime = evaluationtime;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  @Override
  public String toString() {
    return "Evaluation{" +
            "evaluationid='" + evaluationid + '\'' +
            ", volunteerid='" + volunteerid + '\'' +
            ", activityid='" + activityid + '\'' +
            ", evaluationtime='" + evaluationtime + '\'' +
            ", content='" + content + '\'' +
            ", score=" + score +
            '}';
  }
}
