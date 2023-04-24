package com.XYJ.service;

import com.XYJ.mapper.AreaMapper;
import com.XYJ.mapper.CreditsMapper;
import com.XYJ.pojo.Credits;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import static com.XYJ.util.SqlSessionFactoryUtils.getSqlSessionFactory;

public class CreditsService {
    SqlSessionFactory factory = getSqlSessionFactory();

    public void insert(Credits credits) {
        SqlSession sqlSession = factory.openSession();
        CreditsMapper creditsMapper = sqlSession.getMapper(CreditsMapper.class);
        creditsMapper.insert(credits);
        sqlSession.close();
    }

    public void insertN(Credits credits) {
        SqlSession sqlSession = factory.openSession();
        CreditsMapper creditsMapper = sqlSession.getMapper(CreditsMapper.class);
        creditsMapper.insertN(credits);
        sqlSession.close();
    }
}
