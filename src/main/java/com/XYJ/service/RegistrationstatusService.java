package com.XYJ.service;


import com.XYJ.mapper.RegistrationstatusMapper;

import com.XYJ.pojo.Registrationstatus;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

import static com.XYJ.util.SqlSessionFactoryUtils.getSqlSessionFactory;

public class RegistrationstatusService {
    SqlSessionFactory factory = getSqlSessionFactory();
//    查找全部
    public List<Registrationstatus> selectAll() {
        SqlSession sqlSession = factory.openSession();
        RegistrationstatusMapper registrationstatusmapper = sqlSession.getMapper(RegistrationstatusMapper.class);
        List<Registrationstatus> registrationstatus = registrationstatusmapper.selectAll();
        sqlSession.close();
        return registrationstatus;
    }
}
