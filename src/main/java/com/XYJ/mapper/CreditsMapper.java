package com.XYJ.mapper;

import com.XYJ.pojo.Credits;
import org.apache.ibatis.annotations.Insert;

public interface CreditsMapper {

    @Insert("insert into credits(credit, volunteerid, activityid, time) values (#{credit},#{volunteerid}, #{activityid}, now())")
    void insert(Credits credits);

    @Insert("insert into credits2(credit, applicationid, time) values (#{credit}, #{applicationid}, now())")
    void insertN(Credits credits);

}
