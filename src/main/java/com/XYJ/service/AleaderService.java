package com.XYJ.service;

import com.XYJ.mapper.ActivityMapper;
import com.XYJ.mapper.AleaderMapper;
import com.XYJ.pojo.Activity;
import com.XYJ.pojo.Aleader;
import com.XYJ.pojo.PageFY;
import com.alibaba.fastjson.JSON;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.XYJ.util.SqlSessionFactoryUtils.getSqlSessionFactory;

public class AleaderService {
    SqlSessionFactory factory = getSqlSessionFactory();
    public void insert(Aleader aleader){
        SqlSession sqlSession = factory.openSession();
        AleaderMapper aleadermapper = sqlSession.getMapper(AleaderMapper.class);
        aleadermapper.insert(aleader);
        sqlSession.commit();
        sqlSession.close();
    }

    public PageFY<Aleader> selectActivityByVAleadIDFYSQ(int begin, int size, Aleader aleader){
        SqlSession sqlSession = factory.openSession();
        AleaderMapper aleadermapper = sqlSession.getMapper(AleaderMapper.class);

//        总记录数
        int total = aleadermapper.selectActivityByVAleadIDCountSQ(aleader);
        System.out.println(total);
        begin = (begin - 1) * size;
        List<Aleader> activitys = aleadermapper.selectActivityByVAleadIDFYSQ(begin,size,aleader);

        PageFY<Aleader> page = new PageFY<>();
        page.setTotal(total);
        page.setShuju(activitys);
        sqlSession.close();
        return page;
    }

    public int selectcount( Aleader aleader){
        SqlSession sqlSession = factory.openSession();
        AleaderMapper aleadermapper = sqlSession.getMapper(AleaderMapper.class);

//        总记录数
        int total = aleadermapper.selectcount(aleader);

        sqlSession.close();
        return total;
    }


    public static void main(String[] args) {
        AleaderService aleaderService = new AleaderService();
        Map<String,Object> ainfo = new HashMap<>();
//        ainfo.put("activityid","130304");
        String jsonString = JSON.toJSONString(ainfo);
        Aleader act = JSON.parseObject(jsonString,Aleader.class);
        System.out.println(aleaderService.selectActivityByVAleadIDFYSQ(1,5,act));
    }
}
