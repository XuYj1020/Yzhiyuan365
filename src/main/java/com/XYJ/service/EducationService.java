package com.XYJ.service;

import com.XYJ.mapper.EducationMapper;
import com.XYJ.mapper.UserMapper;
import com.XYJ.pojo.Education;
import com.XYJ.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

import static com.XYJ.util.SqlSessionFactoryUtils.getSqlSessionFactory;

public class EducationService {
    SqlSessionFactory factory = getSqlSessionFactory();

    public List<Education> selectAll(){
//        获取sqlSession对象
        SqlSession sqlSession = factory.openSession();
//        获取UserMapper接口的代理对象
        EducationMapper educationmapper = sqlSession.getMapper(EducationMapper.class);
//        调用方法
        List<Education> education = educationmapper.selectAll();
//        释放资源
        sqlSession.close();
//        返回结果
        return education;
    }
//    public static void main(String[] args) {
//        EducationService s = new EducationService();
//        s.selectAll();
//        System.out.println(s.selectAll());
//
//    }
}
