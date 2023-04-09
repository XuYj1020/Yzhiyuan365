package com.XYJ.pojo;

public class Areas {
   private String AreaID;
   private String AreaName;
   private String ParentnodeID;
   private int IsparentFlag;
   private String Ancester;
   private int level;

    public String getAreaID() {
        return AreaID;
    }

    public void setAreaID(String areaID) {
        AreaID = areaID;
    }

    public String getAreaName() {
        return AreaName;
    }

    public void setAreaName(String areaName) {
        AreaName = areaName;
    }

    public String getParentnodeID() {
        return ParentnodeID;
    }

    public void setParentnodeID(String parentnodeID) {
        ParentnodeID = parentnodeID;
    }

    public int getIsparentFlag() {
        return IsparentFlag;
    }

    public void setIsparentFlag(int isparentFlag) {
        IsparentFlag = isparentFlag;
    }

    public String getAncester() {
        return Ancester;
    }

    public void setAncester(String ancester) {
        Ancester = ancester;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Areas{" +
                "AreaID='" + AreaID + '\'' +
                ", AreaName='" + AreaName + '\'' +
                ", ParentnodeID='" + ParentnodeID + '\'' +
                ", IsparentFlag=" + IsparentFlag +
                ", Ancester='" + Ancester + '\'' +
                ", level=" + level +
                '}';
    }
}
