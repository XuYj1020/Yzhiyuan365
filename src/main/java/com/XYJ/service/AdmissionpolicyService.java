package com.XYJ.service;

import com.XYJ.mapper.AdmissionpolicyMapper;
import com.XYJ.pojo.Admissionpolicy;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

import static com.XYJ.util.SqlSessionFactoryUtils.getSqlSessionFactory;

public class AdmissionpolicyService {

    SqlSessionFactory factory = getSqlSessionFactory();

    public List<Admissionpolicy> selectAll(){
        SqlSession sqlsession = factory.openSession();
        AdmissionpolicyMapper admissionpolicymapper = sqlsession.getMapper(AdmissionpolicyMapper.class);
        List<Admissionpolicy> admissionpolicy = admissionpolicymapper.selectAll();
        sqlsession.close();
        return admissionpolicy;
    }
}
