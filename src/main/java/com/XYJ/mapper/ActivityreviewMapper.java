package com.XYJ.mapper;

import com.XYJ.pojo.Activityreview;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

public interface ActivityreviewMapper {

    @Update("update activityreview set auditstatusid = 4 where auditid = #{auditid}")
    void updateActivityreviewAuditstatusid(String auditid);

    @Insert("insert into activityreview(auditid, activityid, auditstatusid) values (#{auditid}, #{activityid}, 1)")
    void insert(Activityreview activityreview);

    @Update("update activityreview set auditstatusid = #{auditstatusid} , eta = now() , feedback = #{feedback}, id = #{id} where auditid = #{auditid}")
    void update(Activityreview activityreview);
}
