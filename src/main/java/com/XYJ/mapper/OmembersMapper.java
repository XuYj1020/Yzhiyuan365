package com.XYJ.mapper;

import com.XYJ.pojo.Omembers;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OmembersMapper {
//    申请通过后插入成员表
    @Insert("insert into omembers(stafid,organizationid,volunteerid,memberstatusid,mlevelid,jointime) values (#{stafid},#{organizationid},#{volunteerid},1,#{mlevelid},now())")
    void insert(Omembers omembers);

//    查找该用户在该组织的最新一条记录，根据这条记录的信息判断是否具备申请条件
    @Select("select * from omembers where organizationid = #{organizationid} and volunteerid = #{volunteerid} order by jointime desc LIMIT 1; ")
    List<Omembers> selectByOVid(Omembers omember);


}
