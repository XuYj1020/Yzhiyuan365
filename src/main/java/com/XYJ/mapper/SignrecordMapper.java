package com.XYJ.mapper;

import com.XYJ.pojo.Signrecord;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface SignrecordMapper {

//    @Select("select count(*) from signcode where activityid =#{activityid}")
//    int selectByAIDCount(String activityid);

    @Select("SELECT IFNULL(( select recordid  from signrecord where applicationid =#{applicationid} order by recordid desc limit 1),'0001')")
    String selectByAID(String applicationid);
    @Insert("insert into signrecord(recordid, signinid, applicationid, signintime)values(#{recordid}, #{signinid}, #{applicationid}, now())")
    void insert(Signrecord signrecord);
}
