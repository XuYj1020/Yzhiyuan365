package com.XYJ.mapper;

import com.XYJ.pojo.Aleader;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

public interface AleaderMapper {

//    新增活动管理员  以注解的形式写语句
    @Insert("insert into aleader(leaderid,activityid,stafid) values(#{leaderid},#{activityid},#{stafid})")
    void insert(Aleader aleader);
}
