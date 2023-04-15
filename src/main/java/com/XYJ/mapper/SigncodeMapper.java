package com.XYJ.mapper;

import com.XYJ.pojo.Signcode;
import org.apache.ibatis.annotations.Insert;

public interface SigncodeMapper {

    @Insert("insert into signcode(signinid, activityid, leaderid, buildtime, pictureaddress) values (#{signinid}, #{activityid}, #{leaderid}, now(), #{pictureaddress})")
    void insert(Signcode signcode);
}
