package com.XYJ.service;

import com.XYJ.mapper.OrganizationMapper;
import com.XYJ.mapper.OrganizeauditMapper;
import com.XYJ.pojo.Organization;
import com.XYJ.pojo.Organizeaudit;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import static com.XYJ.util.SqlSessionFactoryUtils.getSqlSessionFactory;

public class OrganizeauditService {
    SqlSessionFactory factory = getSqlSessionFactory();
    public void update(Organizeaudit organizeaudit){
        SqlSession sqlSession = factory.openSession();
        OrganizeauditMapper organizeauditmapper = sqlSession.getMapper(OrganizeauditMapper.class);
        organizeauditmapper.update(organizeaudit);
        sqlSession.commit();
        sqlSession.close();
    }
}
