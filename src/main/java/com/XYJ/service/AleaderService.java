package com.XYJ.service;

import com.XYJ.mapper.ActivityMapper;
import com.XYJ.mapper.AleaderMapper;
import com.XYJ.pojo.Activity;
import com.XYJ.pojo.Aleader;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

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
}
