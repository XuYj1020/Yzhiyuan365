package com.XYJ.mapper;

import com.XYJ.pojo.Organization;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;


public interface OrganizationMapper {
//    组织入驻
    void insert(Organization organization);
    @Select("select count(*) from organization where phone = #{phone};")
    Integer selectByPhone(String phone);
    List<Organization> selectByPhonePass(Organization organization);

//    通过组织id查看组织详细信息
    List<Organization> selectByOID(String origanizationID);
    List<Organization> selectByOIDAll(String origanizationID);
    List<Organization> selectOinfoByOID(String origanizationID);

    @Select("select password from organization where organizationid = #{organizationid}")
    String selectPassword(String origanizationID);
    int selectOraganizationVCount(Organization organization);
    List<Organization> selectOraganizationVFY(@Param("begin") int begin, @Param("size") int size, @Param("organization") Organization organization);

    @Update("update organization set phone = #{phone} where organization.organizationid = #{organizationid} ")
    void updateOphone(Organization organization);

    @Update("update organization set password = #{password} where organization.organizationid = #{organizationid} ")
    void updateOpasd(Organization organization);

    void updateOinfo(Organization organization);


    int selectOraganizationAdminCount(Organization organization);
    List<Organization> selectOraganizationAdminFY(@Param("begin") int begin, @Param("size") int size, @Param("organization") Organization organization);

    @Update("update organization set userstatusid = #{userstatusid} where organizationid = #{organizationid}")
    void updateuserstatusid(Organization organization);

}
