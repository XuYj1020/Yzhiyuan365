package com.XYJ.service;

import com.XYJ.mapper.AapplicationMapper;
import com.XYJ.mapper.ApplicationreviewMapper;
import com.XYJ.pojo.Applicationreview;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import static com.XYJ.util.SqlSessionFactoryUtils.getSqlSessionFactory;

public class ApplicationreviewService {
    SqlSessionFactory factory = getSqlSessionFactory();

    public void insert(Applicationreview applicationreview){
        SqlSession sqlSession = factory.openSession();
        ApplicationreviewMapper applicationreviewmapper = sqlSession.getMapper(ApplicationreviewMapper.class);
        applicationreviewmapper.insert(applicationreview);
        sqlSession.close();
    }

    public String auditid(String activityid){
        SqlSession sqlSession = factory.openSession();
        ApplicationreviewMapper applicationreviewmapper = sqlSession.getMapper(ApplicationreviewMapper.class);
        String auditid = applicationreviewmapper.auditid(activityid);
        sqlSession.close();
        return auditid;
    }

    public void updateAuditstatusid(String auditid){
        SqlSession sqlSession = factory.openSession();
        ApplicationreviewMapper applicationreviewMapper = sqlSession.getMapper(ApplicationreviewMapper.class);
        applicationreviewMapper.updateAuditstatusid(auditid);
        sqlSession.close();
    }

    public static void main(String[] args) {
        ApplicationreviewService a = new ApplicationreviewService();
        System.out.println(a.auditid("HD1101017903314795"));
    }
}
