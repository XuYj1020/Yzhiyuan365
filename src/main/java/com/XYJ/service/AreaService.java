package com.XYJ.service;

import com.XYJ.mapper.AreaMapper;
import com.XYJ.mapper.UserMapper;
import com.XYJ.pojo.Areas;
import com.XYJ.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

import static com.XYJ.util.SqlSessionFactoryUtils.getSqlSessionFactory;

public class AreaService {
    SqlSessionFactory factory = getSqlSessionFactory();

    /* //老代码，不适用
    public List<Areas> SelectProvince() {
        SqlSession sqlSession = factory.openSession();
        AreaMapper areamapper = sqlSession.getMapper(AreaMapper.class);
        List<Areas> areas = areamapper.SelectProvince();
        sqlSession.close();
        return areas;
    }
*/
//    根据区的ID找到省市区
    /*  //老代码，不适用
    public List<Areas> SelectadressByAreaID(String AreaID) {
        SqlSession sqlSession = factory.openSession();
        AreaMapper areamapper = sqlSession.getMapper(AreaMapper.class);
        List<Areas> areas = areamapper.SelectadressByAreaID(AreaID);
        sqlSession.close();
        return areas;
    }
*/

    public String SelectadressByAreaID(String AreaID) {
        SqlSession sqlSession = factory.openSession();
        AreaMapper areamapper = sqlSession.getMapper(AreaMapper.class);
        String areas = areamapper.SelectadressByAreaID(AreaID);
        sqlSession.close();
        return areas;
    }
//    public static void main(String[] args) {
//        AreaService s = new AreaService();
////        s.SelectProvince();
//        System.out.println(s.SelectProvince());
//
//    }

    public static void main(String[] args) {
        AreaService s = new AreaService();
        System.out.println(s.SelectadressByAreaID("330683"));
    }
}
