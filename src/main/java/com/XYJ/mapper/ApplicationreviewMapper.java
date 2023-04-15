package com.XYJ.mapper;

import com.XYJ.pojo.Aapplication;
import com.XYJ.pojo.Applicationreview;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ApplicationreviewMapper {

    @Insert("insert into applicationreview(auditid, activityid, volunteerid, auditstatusid, etd) values (#{auditid}, #{activityid}, #{volunteerid},1,now())")
    void insert(Applicationreview applicationreview);

    @Select("SELECT IFNULL(( select auditid  from applicationreview where activityid = #{activityid} order by auditid desc limit 1),'0001')")
    String auditid(String activityid);

    @Update("update applicationreview set auditstatusid = 4 where auditid = #{auditid}")
    void updateAuditstatusid(String auditid);
    @Update("update applicationreview set auditstatusid = #{auditstatusid} , feedback = #{feedback} , eta = now() ,leaderid = #{leaderid}  where auditid = #{auditid}")
    void updateAuditstatusid1(Applicationreview applicationreview);
    List<Applicationreview> selectVinfoByAIDFYSH(@Param("begin") int begin, @Param("size") int size, @Param("applicationreview") Applicationreview applicationreview);
    int selectVinfoByAIDCountSH(Applicationreview applicationreview);
}
