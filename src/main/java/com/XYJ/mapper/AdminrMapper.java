package com.XYJ.mapper;

import com.XYJ.pojo.Adminr;
import com.XYJ.pojo.Organization;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AdminrMapper {
    @Select("select * from adminr where password = #{password} and daminid = #{daminid}")
    List<Adminr> selectbyap(Adminr adminr);
}
