package com.XYJ.service;

import com.XYJ.mapper.SignrecordMapper;
import com.XYJ.pojo.Signrecord;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import static com.XYJ.util.SqlSessionFactoryUtils.getSqlSessionFactory;

public class SignrecordService {
    SqlSessionFactory factory = getSqlSessionFactory();

    public String selectByAID(String applicationid){
        SqlSession sqlSession = factory.openSession();
        SignrecordMapper signrecordMapper = sqlSession.getMapper(SignrecordMapper.class);
        String recordid = signrecordMapper.selectByAID(applicationid);
        sqlSession.close();
        return recordid;
    }

    public void insert(Signrecord signrecord){
        SqlSession sqlSession = factory.openSession();
        SignrecordMapper signrecordMapper = sqlSession.getMapper(SignrecordMapper.class);
        signrecordMapper.insert(signrecord);
        sqlSession.close();
    }


    public static void main(String[] args) {
        SignrecordService a = new SignrecordService();
    }
}
