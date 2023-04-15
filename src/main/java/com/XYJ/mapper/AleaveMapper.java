package com.XYJ.mapper;

import com.XYJ.pojo.Aleave;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface AleaveMapper {

    @Insert("insert into aleave(leaveapplicationid, applicationid, applicationtime, reason,statusid)values(#{leaveapplicationid}, #{applicationid}, now(), #{reason},1) ")
    void insert(Aleave aleave);

    @Select("SELECT IFNULL(( select leaveapplicationid  from aleave where applicationid =#{applicationid} order by leaveapplicationid desc limit 1),'0001')")
    String selectByAID(String applicationid);

    @Select("SELECT * FROM ALEAVE where applicationid =#{applicationid} and statusid = 1 order by leaveapplicationid desc limit 1 ")
    List<Aleave> selectONEByAID(String applicationid);

    @Update("update aleave set statusid = #{statusid} where leaveapplicationid = #{leaveapplicationid}")
    void update(Aleave aleave);

}
