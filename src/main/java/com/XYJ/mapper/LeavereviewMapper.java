package com.XYJ.mapper;

import com.XYJ.pojo.Leavereview;
import org.apache.ibatis.annotations.Update;

public interface LeavereviewMapper {

    @Update("update leavereview set auditstatusid = #{auditstatusid} , feedback = #{feedback} , eta = now() ,leaderid = #{leaderid}  where leaveauditid = #{leaveauditid}")
    void update(Leavereview leavereview);
}
