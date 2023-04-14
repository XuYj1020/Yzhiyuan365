package com.XYJ.service;

import com.XYJ.mapper.ActivityreviewMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import static com.XYJ.util.SqlSessionFactoryUtils.getSqlSessionFactory;

public class ActivityreviewService{
    SqlSessionFactory factory = getSqlSessionFactory();
    public void updateActivityreviewAuditstatusid(String auditid){
        SqlSession sqlSession = factory.openSession();
        ActivityreviewMapper activityreviewMapper = sqlSession.getMapper(ActivityreviewMapper.class);
        activityreviewMapper.updateActivityreviewAuditstatusid(auditid);
        sqlSession.close();
    }
}
