package com.XYJ.service;

import com.XYJ.mapper.AleaveMapper;
import com.XYJ.mapper.SignrecordMapper;
import com.XYJ.pojo.Aleave;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import static com.XYJ.util.SqlSessionFactoryUtils.getSqlSessionFactory;

public class AleaveService {
    SqlSessionFactory factory = getSqlSessionFactory();
    public void insert(Aleave aleave){
        SqlSession sqlSession = factory.openSession();
        AleaveMapper aleaveMapper = sqlSession.getMapper(AleaveMapper.class);
        aleaveMapper.insert(aleave);
        sqlSession.close();
    }

    public String selectByAID(String applicationid){
        SqlSession sqlSession = factory.openSession();
        AleaveMapper aleaveMapper = sqlSession.getMapper(AleaveMapper.class);
        String leaveapplicationid = aleaveMapper.selectByAID(applicationid);
        sqlSession.close();
        return leaveapplicationid;
    }
}
