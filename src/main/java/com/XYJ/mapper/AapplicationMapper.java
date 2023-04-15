package com.XYJ.mapper;

import com.XYJ.pojo.Aapplication;
import com.XYJ.pojo.Activity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface AapplicationMapper {

    @Insert("insert into aapplication(applicationid,activityid,volunteerid,applicationstatusid,atime,auditid) values (#{applicationid},#{activityid},#{volunteerid},1,now(),#{auditid})")
    void insert(Aapplication aapplication);

    @Select("SELECT IFNULL(( select applicationid  from aapplication where activityid = #{activityid} order by applicationid desc limit 1),'0001')")
    String applicationid(String activityid);

//    通过活动ID和志愿者ID搜索志愿者是否已报名该活动以及报名详情  最新一条记录
    @Select("select * from aapplication where volunteerid = #{volunteerid} and activityid = #{activityid} order by atime desc limit 1")
    List<Aapplication> selectByVAID(Aapplication aapplication);

    @Update("update aapplication set applicationstatusid = 2 where applicationid = #{applicationid}")
    void updateApplicationstatusid(String applicationid);


    List<Aapplication> selectVinfoByAIDFY(@Param("begin") int begin, @Param("size") int size, @Param("aapplication") Aapplication aapplication);
    int selectVinfoByAIDCount(Aapplication aapplication);

    List<Aapplication> selectVinfoByAIDFYstatus(@Param("begin") int begin, @Param("size") int size, @Param("aapplication") Aapplication aapplication);
    int selectVinfoByAIDCountstatus(Aapplication aapplication);

    @Update("update aapplication set applicationstatusid = 3 where applicationid = #{applicationid}")
    void updateApplicationstatusid3(String applicationid);
}
