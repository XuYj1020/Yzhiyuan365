package com.XYJ.pojo;

public class Education {
    private int educationid;
    private String education;

    public int getEducationid() {
        return educationid;
    }

    public void setEducationid(int educationid) {
        this.educationid = educationid;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return "Education{" +
                "educationid=" + educationid +
                ", education='" + education + '\'' +
                '}';
    }
}
