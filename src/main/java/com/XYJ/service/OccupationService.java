package com.XYJ.service;

import com.XYJ.mapper.OccupationMapper;
import com.XYJ.pojo.Occupation;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

import static com.XYJ.util.SqlSessionFactoryUtils.getSqlSessionFactory;

public class OccupationService {
    SqlSessionFactory factory = getSqlSessionFactory();

    public List<Occupation> selectAll(){
//        获取sqlSession对象
        SqlSession sqlSession = factory.openSession();
//        获取UserMapper接口的代理对象
        OccupationMapper occupationmapper = sqlSession.getMapper(OccupationMapper.class);
//        调用方法
        List<Occupation> occupation = occupationmapper.selectAll();
//        释放资源
        sqlSession.close();
//        返回结果
        return occupation;
    }
    public static void main(String[] args) {
        OccupationService s = new OccupationService();
//        s.SelectProvince();
        System.out.println(s.selectAll());

    }
}
