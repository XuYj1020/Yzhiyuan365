package com.XYJ.service;

import com.XYJ.mapper.OtypeMapper;
import com.XYJ.mapper.RegistrationstatusMapper;
import com.XYJ.pojo.Otype;
import com.XYJ.pojo.Registrationstatus;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

import static com.XYJ.util.SqlSessionFactoryUtils.getSqlSessionFactory;

public class OtypeService {
    SqlSessionFactory factory = getSqlSessionFactory();
    //    查找全部
    public List<Otype> selectByRegistrationstatusid(String registrationstatusid) {
        SqlSession sqlSession = factory.openSession();
        OtypeMapper otypemapper = sqlSession.getMapper(OtypeMapper.class);
        List<Otype> otype = otypemapper.selectByRegistrationstatusid(registrationstatusid);
        sqlSession.close();
        return otype;
    }
}
