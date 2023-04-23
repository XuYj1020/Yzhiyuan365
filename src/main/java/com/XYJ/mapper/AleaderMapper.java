package com.XYJ.mapper;

import com.XYJ.pojo.Activity;
import com.XYJ.pojo.Aleader;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AleaderMapper {

//    新增活动管理员  以注解的形式写语句
    @Insert("insert into aleader(leaderid,activityid,stafid) values(#{leaderid},#{activityid},#{stafid})")
    void insert(Aleader aleader);

    List<Aleader> selectActivityByVAleadIDFYSQ(@Param("begin") int begin, @Param("size") int size, @Param("aleader") Aleader aleader);
    int selectActivityByVAleadIDCountSQ(Aleader aleader);

    int selectcount(Aleader aleader);
}
