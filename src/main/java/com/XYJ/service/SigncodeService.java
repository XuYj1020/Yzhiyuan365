package com.XYJ.service;

import com.XYJ.mapper.ApplicationreviewMapper;
import com.XYJ.mapper.SigncodeMapper;
import com.XYJ.pojo.Applicationreview;
import com.XYJ.pojo.Signcode;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import static com.XYJ.util.SqlSessionFactoryUtils.getSqlSessionFactory;

public class SigncodeService {
    SqlSessionFactory factory = getSqlSessionFactory();

    public void insert(Signcode signcode){
        SqlSession sqlSession = factory.openSession();
        SigncodeMapper signcodemapper = sqlSession.getMapper(SigncodeMapper.class);
        signcodemapper.insert(signcode);
        sqlSession.close();
    }
}
