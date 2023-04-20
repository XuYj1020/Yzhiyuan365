package com.XYJ.mapper;

import com.XYJ.pojo.Organization;
import com.XYJ.pojo.Organizeaudit;
import org.apache.ibatis.annotations.Update;

public interface OrganizeauditMapper {
    @Update("update organizeaudit set reviewerid = #{reviewerid} , auditstatusid = #{auditstatusid} , eta = now() , feedback = #{feedback} where organizationid = #{organizationid}")
    void update(Organizeaudit organizeaudit);

    @Update("update organizeaudit set reviewerid = null , auditstatusid = 1 , eta = null , feedback = null where organizationid = #{organizationid}")
    void updatexiugai(Organization organization);
}
