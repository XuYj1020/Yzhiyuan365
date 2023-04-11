package com.XYJ.mapper;

import com.XYJ.pojo.Otype;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OtypeMapper {
    List<Otype>selectByRegistrationstatusid(String registrationsid);

    @Select("select * from otype")
    List<Otype>selectAll();
}
