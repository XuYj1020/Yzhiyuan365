package com.XYJ.mapper;

import com.XYJ.pojo.Organizeaudit;
import org.apache.ibatis.annotations.Update;

public interface OrganizeauditMapper {
    @Update("update organizeaudit set reviewerid = #{reviewerid} , auditstatusid = #{auditstatusid} , eta = now() , feedback = #{feedback} where organizationid = #{organizationid}")
    void update(Organizeaudit organizeaudit);
}
