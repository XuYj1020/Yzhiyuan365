package com.XYJ.service;

import com.XYJ.mapper.AapplicationMapper;
import com.XYJ.mapper.ActivityMapper;
import com.XYJ.mapper.OjoinMapper;
import com.XYJ.pojo.Aapplication;
import com.XYJ.pojo.Activity;
import com.XYJ.pojo.Ojoin;
import com.XYJ.pojo.PageFY;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

import static com.XYJ.util.SqlSessionFactoryUtils.getSqlSessionFactory;

public class OjoinService {
    SqlSessionFactory factory = getSqlSessionFactory();
    public void insert(Ojoin ojoin){
        SqlSession sqlSession = factory.openSession();
        OjoinMapper ojoinmapper = sqlSession.getMapper(OjoinMapper.class);
        ojoinmapper.insert(ojoin);
        sqlSession.commit();
        sqlSession.close();
    }

    public List<Ojoin> selectByOVid(Ojoin ojoin){
        SqlSession sqlSession = factory.openSession();
        OjoinMapper ojoinmapper = sqlSession.getMapper(OjoinMapper.class);
        List<Ojoin> ojoins = ojoinmapper.selectByOVid(ojoin);
        sqlSession.commit();
        sqlSession.close();
        return ojoins;
    }

    public PageFY<Ojoin> selectALLBYOVIDJOINFY(int begin, int size, Ojoin ojoin){
        SqlSession sqlSession = factory.openSession();
        OjoinMapper ojoinmapper = sqlSession.getMapper(OjoinMapper.class);

//        总记录数
        int total = ojoinmapper.selectALLBYOVIDJOINFYCount(ojoin);
        System.out.println(total);
        begin = (begin - 1) * size;
        List<Ojoin> aapplications = ojoinmapper.selectALLBYOVIDJOINFY(begin,size,ojoin);

        PageFY<Ojoin> page = new PageFY<>();
        page.setTotal(total);
        page.setShuju(aapplications);
        sqlSession.close();
        return page;
    }
}
