package com.XYJ.service;

import com.XYJ.mapper.ShenHeShuLiangMapper;
import com.XYJ.pojo.ShenHeShuLiang;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

import static com.XYJ.util.SqlSessionFactoryUtils.getSqlSessionFactory;

public class ShenHeShuLiangService {
    SqlSessionFactory factory = getSqlSessionFactory();
    public List<ShenHeShuLiang> selectindexxinx(){
        SqlSession sqlSession = factory.openSession();
        ShenHeShuLiangMapper shenHeShuLiangMapper = sqlSession.getMapper(ShenHeShuLiangMapper.class);
        List<ShenHeShuLiang> shenHeShuLiangs = shenHeShuLiangMapper.selectindexxinx();
        sqlSession.close();
        return shenHeShuLiangs;
    }

    public List<ShenHeShuLiang> selectv(ShenHeShuLiang shenHeShuLiang){
        SqlSession sqlSession = factory.openSession();
        ShenHeShuLiangMapper shenHeShuLiangMapper = sqlSession.getMapper(ShenHeShuLiangMapper.class);
        List<ShenHeShuLiang> shenHeShuLiangs = shenHeShuLiangMapper.selectv(shenHeShuLiang);
        sqlSession.close();
        return shenHeShuLiangs;
    }

    public List<ShenHeShuLiang> selecto(ShenHeShuLiang shenHeShuLiang){
        SqlSession sqlSession = factory.openSession();
        ShenHeShuLiangMapper shenHeShuLiangMapper = sqlSession.getMapper(ShenHeShuLiangMapper.class);
        List<ShenHeShuLiang> shenHeShuLiangs = shenHeShuLiangMapper.selecto(shenHeShuLiang);
        sqlSession.close();
        return shenHeShuLiangs;
    }
}
