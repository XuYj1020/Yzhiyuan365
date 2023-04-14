package com.XYJ.mapper;

import com.XYJ.pojo.Activityreview;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

public interface ActivityreviewMapper {

    @Update("update activityreview set auditstatusid = 4 where auditid = #{auditid}")
    void updateActivityreviewAuditstatusid(String auditid);

    @Insert("insert into activityreview(auditid, activityid, auditstatusid) values (#{auditid}, #{activityid}, 1)")
    void insert(Activityreview activityreview);
}
