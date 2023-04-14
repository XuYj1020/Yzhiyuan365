package com.XYJ.mapper;

import org.apache.ibatis.annotations.Update;

public interface ActivityreviewMapper {

    @Update("update activityreview set auditstatusid = 4 where auditid = #{auditid}")
    void updateActivityreviewAuditstatusid(String auditid);
}
