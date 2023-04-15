package com.XYJ.service;

import com.XYJ.mapper.ApplicationreviewMapper;
import com.XYJ.mapper.LeavereviewMapper;
import com.XYJ.pojo.Applicationreview;
import com.XYJ.pojo.Leavereview;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import static com.XYJ.util.SqlSessionFactoryUtils.getSqlSessionFactory;

public class LeavereviewService {
    SqlSessionFactory factory = getSqlSessionFactory();

    public void update(Leavereview leavereview){
        SqlSession sqlSession = factory.openSession();
        LeavereviewMapper leavereviewMapper = sqlSession.getMapper(LeavereviewMapper.class);
        leavereviewMapper.update(leavereview);
        sqlSession.close();
    }
}
