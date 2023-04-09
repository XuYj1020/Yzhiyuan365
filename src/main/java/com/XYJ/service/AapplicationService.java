package com.XYJ.service;

import com.XYJ.mapper.AapplicationMapper;
import com.XYJ.pojo.Aapplication;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.List;

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
    public static void main(String[] args) {
        AapplicationService app = new AapplicationService();
        System.out.println(app.applicationid("HD1302032503304169"));
        System.out.println("HDBM13020325033041690020".substring(4));
        String a = "HDBM13020325033041690020".substring(4);
        System.out.println(a);
        long num =Long.parseLong(a.substring(a.length()-15))+1;
        System.out.println(num);
        String b = a.substring(0,a.length()-15);
        System.out.println(b);
    }
}
