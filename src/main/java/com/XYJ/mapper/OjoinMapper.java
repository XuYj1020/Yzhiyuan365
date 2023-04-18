package com.XYJ.mapper;

import com.XYJ.pojo.Activity;
import com.XYJ.pojo.Ojoin;
import com.XYJ.pojo.Omembers;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface OjoinMapper {

//    志愿者申请加入组织先生成申请表
    @Insert("insert into ojoin(applicationid,volunteerid,organizationid,applicationtime,auditstatusid) values(#{applicationid},#{volunteerid},#{organizationid},now(),1)")
    void insert(Ojoin ojoin);


//    查看志愿者在该组织是否有正在申请的记录
    @Select("select * from ojoin where auditstatusid=1 and organizationid = #{organizationid} and volunteerid = #{volunteerid} order by applicationtime desc LIMIT 1; ")
    List<Ojoin> selectByOVid(Ojoin ojoin);

    List<Ojoin> selectALLBYOVIDJOINFY(@Param("begin") int begin, @Param("size") int size, @Param("ojoin")Ojoin ojoin);
    int selectALLBYOVIDJOINFYCount(Ojoin ojoin);

    void updateauditstatusid(Ojoin ojoin);

    int selectshifoujiaruhoushenhe(Ojoin ojoin);

}
