package com.XYJ.mapper;

import com.XYJ.pojo.Organization;
import com.XYJ.pojo.User;

import java.util.List;


public interface OrganizationMapper {
//    组织入驻
    void insert(Organization organization);

    List<Organization> selectByPhonePass(Organization organization);

//    通过组织id查看组织详细信息
    List<Organization> selectByOID(String origanizationID);
    List<Organization> selectOinfoByOID(String origanizationID);

}
