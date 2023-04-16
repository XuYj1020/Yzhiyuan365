package com.XYJ.mapper;

import com.XYJ.pojo.Activestatus;
import com.XYJ.pojo.Activityreview;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ActivestatusMapper {

    @Select("select * from activestatus where activestatusid in (1,2,3,4)")
    List<Activestatus> selectStatusV();


}
