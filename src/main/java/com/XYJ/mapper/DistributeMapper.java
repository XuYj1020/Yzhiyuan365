package com.XYJ.mapper;

import com.XYJ.pojo.Distribute;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface DistributeMapper {

    @Insert("insert into distribute(recordid,volunteerid,volunteerhours,releasetime,activityid) values(#{recordid},#{volunteerid},#{volunteerhours},NOW(),#{activityid})")
    void insertyqd(Distribute distribute);
    @Insert("insert into distribute(recordid,volunteerid,volunteerhours,releasetime,activityid) values(#{recordid},#{volunteerid},0,NOW(),#{activityid})")
    void insertwqd(Distribute distribute);

    @Select("SELECT IFNULL(( select recordid  from distribute where activityid = #{activityid} order by recordid desc limit 1),'0001')")
    String recordid(String activityid);
}
