package com.XYJ.service;

import com.XYJ.mapper.AapplicationMapper;
import com.XYJ.mapper.ActivityMapper;
import com.XYJ.pojo.Aapplication;
import com.XYJ.pojo.Activity;
import com.XYJ.pojo.PageFY;
import com.XYJ.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static com.XYJ.util.SqlSessionFactoryUtils.getSqlSessionFactory;
import static javafx.scene.input.KeyCode.L;

public class AapplicationService {
    SqlSessionFactory factory = getSqlSessionFactory();
     public void insert(Aapplication aapplication){
         SqlSession sqlSession = factory.openSession();
         AapplicationMapper aapplicationemapper = sqlSession.getMapper(AapplicationMapper.class);
         aapplicationemapper.insert(aapplication);
         sqlSession.close();
     }

    public String applicationid(String activityid){
        SqlSession sqlSession = factory.openSession();
        AapplicationMapper aapplicationemapper = sqlSession.getMapper(AapplicationMapper.class);
        String applicationid = aapplicationemapper.applicationid(activityid);
        sqlSession.close();
        return applicationid;
    }

//    查询用户的最新一条参与活动的记录
    public List<Aapplication> selectByVAID(Aapplication aapplication){
        SqlSession sqlSession = factory.openSession();
        AapplicationMapper aapplicationemapper = sqlSession.getMapper(AapplicationMapper.class);
        List<Aapplication> application = aapplicationemapper.selectByVAID(aapplication);
        sqlSession.close();
        return application;
    }

    public int selectByVAIDCOUNT(Aapplication aapplication){
        SqlSession sqlSession = factory.openSession();
        AapplicationMapper aapplicationemapper = sqlSession.getMapper(AapplicationMapper.class);
        int count = aapplicationemapper.selectByVAIDCOUNT(aapplication);
        sqlSession.close();
        return count;
    }

    public int selectByVAIDjoinCOUNT(Aapplication aapplication){
        SqlSession sqlSession = factory.openSession();
        AapplicationMapper aapplicationemapper = sqlSession.getMapper(AapplicationMapper.class);
        int count = aapplicationemapper.selectByVAIDjoinCOUNT(aapplication);
        sqlSession.close();
        return count;
    }

    public void updateApplicationstatusid(String applicationid){
        SqlSession sqlSession = factory.openSession();
        AapplicationMapper aapplicationemapper = sqlSession.getMapper(AapplicationMapper.class);
        aapplicationemapper.updateApplicationstatusid(applicationid);
        sqlSession.close();
    }

    public void updateApplicationstatusid3(String applicationid){
        SqlSession sqlSession = factory.openSession();
        AapplicationMapper aapplicationemapper = sqlSession.getMapper(AapplicationMapper.class);
        aapplicationemapper.updateApplicationstatusid3(applicationid);
        sqlSession.close();
    }


    public PageFY<Aapplication> selectVinfoByAIDFY(int begin, int size, Aapplication aapplication){
        SqlSession sqlSession = factory.openSession();
        AapplicationMapper aapplicationemapper = sqlSession.getMapper(AapplicationMapper.class);

//        总记录数
        int total = aapplicationemapper.selectVinfoByAIDCount(aapplication);
        System.out.println(total);
        begin = (begin - 1) * size;
        List<Aapplication> aapplications = aapplicationemapper.selectVinfoByAIDFY(begin,size,aapplication);

        PageFY<Aapplication> page = new PageFY<>();
        page.setTotal(total);
        page.setShuju(aapplications);
        sqlSession.close();
        return page;
    }

    public PageFY<Aapplication> selectVinfoByAIDFYstatus(int begin, int size, Aapplication aapplication){
        SqlSession sqlSession = factory.openSession();
        AapplicationMapper aapplicationemapper = sqlSession.getMapper(AapplicationMapper.class);

//        总记录数
        int total = aapplicationemapper.selectVinfoByAIDCountstatus(aapplication);
        System.out.println(total);
        begin = (begin - 1) * size;
        List<Aapplication> aapplications = aapplicationemapper.selectVinfoByAIDFYstatus(begin,size,aapplication);

        PageFY<Aapplication> page = new PageFY<>();
        page.setTotal(total);
        page.setShuju(aapplications);
        sqlSession.close();
        return page;
    }

    public String[] selectVID(Aapplication aapplication){
        SqlSession sqlSession = factory.openSession();
        AapplicationMapper aapplicationemapper = sqlSession.getMapper(AapplicationMapper.class);
        String[] aapplications = aapplicationemapper.selectVID(aapplication);
        sqlSession.close();
        return aapplications;
    }
    public static void main(String[] args) {
        AapplicationService app = new AapplicationService();
//        System.out.println(app.applicationid("HD1302032503304169"));
//        System.out.println("HDBM13020325033041690020".substring(4));
//        String a = "HDBM13020325033041690020".substring(4);
//        System.out.println(a);
//        long num =Long.parseLong(a.substring(a.length()-15))+1;
//        System.out.println(num);
//        String b = a.substring(0,a.length()-15);
//        System.out.println(b);
//        String[] aapplications = app.selectVID("HD1302032503304169");
//        System.out.println(app.selectVID("HD1302032503304169"));
//        System.out.println(Arrays.toString(aapplications));
//        for (int i = 0; i < aapplications.length; i++) {
//            System.out.println(aapplications[i] + " ");
//        }
    }
}
