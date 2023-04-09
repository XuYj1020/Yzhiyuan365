package com.XYJ.mapper;

import com.XYJ.pojo.Applicationreview;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface ApplicationreviewMapper {

    @Insert("insert into applicationreview(auditid, activityid, volunteerid, auditstatusid, etd) values (#{auditid}, #{activityid}, #{volunteerid},1,now())")
    void insert(Applicationreview applicationreview);

    @Select("SELECT IFNULL(( select auditid  from applicationreview where activityid = #{activityid} order by auditid desc limit 1),'0001')")
    String auditid(String activityid);
}
