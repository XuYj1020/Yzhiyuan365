package com.XYJ.service;

import com.XYJ.mapper.AapplicationMapper;
import com.XYJ.mapper.ApplicationreviewMapper;
import com.XYJ.pojo.Aapplication;
import com.XYJ.pojo.Applicationreview;
import com.XYJ.pojo.PageFY;
import com.XYJ.pojo.ShenHeShuLiang;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

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

    public void updateAuditstatusid1(Applicationreview applicationreview){
        SqlSession sqlSession = factory.openSession();
        ApplicationreviewMapper applicationreviewMapper = sqlSession.getMapper(ApplicationreviewMapper.class);
        applicationreviewMapper.updateAuditstatusid1(applicationreview);
        sqlSession.close();
    }
    public PageFY<Applicationreview> selectVinfoByAIDFYSH(int begin, int size, Applicationreview applicationreview){
        SqlSession sqlSession = factory.openSession();
        ApplicationreviewMapper applicationreviewmapper = sqlSession.getMapper(ApplicationreviewMapper.class);

//        总记录数
        int total = applicationreviewmapper.selectVinfoByAIDCountSH(applicationreview);
        System.out.println(total);
        begin = (begin - 1) * size;
        List<Applicationreview> applicationreviews = applicationreviewmapper.selectVinfoByAIDFYSH(begin,size,applicationreview);

        PageFY<Applicationreview> page = new PageFY<>();
        page.setTotal(total);
        page.setShuju(applicationreviews);
        sqlSession.close();
        return page;
    }

    public List<ShenHeShuLiang> selectshenhshul(String activityid){
        SqlSession sqlSession = factory.openSession();
        ApplicationreviewMapper applicationreviewMapper = sqlSession.getMapper(ApplicationreviewMapper.class);
        List<ShenHeShuLiang> selectshenhshul = applicationreviewMapper.selectshenhshul(activityid);
        sqlSession.close();
        return selectshenhshul;
    }
    public static void main(String[] args) {
        ApplicationreviewService a = new ApplicationreviewService();
        System.out.println(a.auditid("HD1101017903314795"));

        List<ShenHeShuLiang> aapplications = a.selectshenhshul("HD1303047604159249");
        System.out.println(aapplications);
    }
}
