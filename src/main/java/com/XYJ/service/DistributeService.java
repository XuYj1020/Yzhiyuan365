package com.XYJ.service;

import com.XYJ.mapper.AapplicationMapper;
import com.XYJ.mapper.ApplicationreviewMapper;
import com.XYJ.mapper.DistributeMapper;
import com.XYJ.pojo.Distribute;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import static com.XYJ.util.SqlSessionFactoryUtils.getSqlSessionFactory;

public class DistributeService {
    SqlSessionFactory factory = getSqlSessionFactory();
    public void insertyqd(Distribute distribute){
        SqlSession sqlSession = factory.openSession();
        DistributeMapper distributeMapper = sqlSession.getMapper(DistributeMapper.class);
        distributeMapper.insertyqd(distribute);
        sqlSession.close();
    }
    public  void insertwqd(Distribute distribute){
        SqlSession sqlSession = factory.openSession();
        DistributeMapper distributeMapper = sqlSession.getMapper(DistributeMapper.class);
        distributeMapper.insertwqd(distribute);
        sqlSession.close();
    }

    public String recordid(String activityid){
        SqlSession sqlSession = factory.openSession();
        DistributeMapper distributeMapper = sqlSession.getMapper(DistributeMapper.class);
        String recordid = distributeMapper.recordid(activityid);
        sqlSession.close();
        return recordid;
    }
}
