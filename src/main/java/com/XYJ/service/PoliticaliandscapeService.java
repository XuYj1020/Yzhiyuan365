package com.XYJ.service;

import com.XYJ.mapper.PoliticaliandscapeMapper;
import com.XYJ.pojo.Politicaliandscape;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

import static com.XYJ.util.SqlSessionFactoryUtils.getSqlSessionFactory;

public class PoliticaliandscapeService {
    SqlSessionFactory factory = getSqlSessionFactory();

    public List<Politicaliandscape> selectAll(){
//        获取sqlSession对象
        SqlSession sqlSession = factory.openSession();
//        获取UserMapper接口的代理对象
        PoliticaliandscapeMapper politicaliandscapemapper = sqlSession.getMapper(PoliticaliandscapeMapper.class);
//        调用方法
        List<Politicaliandscape> politicaliandscape = politicaliandscapemapper.selectAll();
//        释放资源
        sqlSession.close();
//        返回结果
        return politicaliandscape;
    }
}
