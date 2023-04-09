package com.XYJ.mapper;

import com.XYJ.pojo.Activestatus;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ActivestatusMapper {

    @Select("select * from activestatus where activestatusid in (1,2,3,4)")
    List<Activestatus> selectStatusV();
}
