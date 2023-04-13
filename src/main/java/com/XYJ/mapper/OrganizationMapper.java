package com.XYJ.mapper;

import com.XYJ.pojo.Organization;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface OrganizationMapper {
//    组织入驻
    void insert(Organization organization);
    @Select("select count(*) from organization where phone = #{phone};")
    Integer selectByPhone(String phone);
    List<Organization> selectByPhonePass(Organization organization);

//    通过组织id查看组织详细信息
    List<Organization> selectByOID(String origanizationID);
    List<Organization> selectOinfoByOID(String origanizationID);

    int selectOraganizationVCount(Organization organization);
    List<Organization> selectOraganizationVFY(@Param("begin") int begin, @Param("size") int size, @Param("organization") Organization organization);

}
