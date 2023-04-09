package com.XYJ.service;

import com.XYJ.mapper.AcstyleMapper;
import com.XYJ.mapper.AreaMapper;
import com.XYJ.pojo.Acstyle;
import com.XYJ.pojo.Areas;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

import static com.XYJ.util.SqlSessionFactoryUtils.getSqlSessionFactory;

public class AcstyleService {
    SqlSessionFactory factory = getSqlSessionFactory();

    public List<Acstyle> selectAll() {
        SqlSession sqlSession = factory.openSession();
        AcstyleMapper acstylemapper = sqlSession.getMapper(AcstyleMapper.class);
        List<Acstyle> acstyle = acstylemapper.selectAll();
        sqlSession.close();
        return acstyle;
    }
        public static void main(String[] args) {
        AcstyleService s = new AcstyleService();
//        s.SelectProvince();
        System.out.println(s.selectAll());
        System.out.println(String.format("%04d", 90));

    }
}
