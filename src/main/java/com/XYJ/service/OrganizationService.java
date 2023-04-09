package com.XYJ.service;

import com.XYJ.mapper.OrganizationMapper;
import com.XYJ.pojo.Organization;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

import static com.XYJ.util.SqlSessionFactoryUtils.getSqlSessionFactory;

public class OrganizationService {
    SqlSessionFactory factory = getSqlSessionFactory();

    public void insert(Organization organization){
        SqlSession sqlSession = factory.openSession();
        OrganizationMapper organizationmapper = sqlSession.getMapper(OrganizationMapper.class);
        organizationmapper.insert(organization);
        sqlSession.commit();
        sqlSession.close();

    }

    public List<Organization> selectByPhonePass(Organization organization){
        SqlSession sqlSession = factory.openSession();
        OrganizationMapper organizationmapper = sqlSession.getMapper(OrganizationMapper.class);
        List<Organization> organizations = organizationmapper.selectByPhonePass(organization);
        sqlSession.close();
        return organizations;
    }

    public List<Organization> selectByOID(String organization){
        SqlSession sqlSession = factory.openSession();
        OrganizationMapper organizationmapper = sqlSession.getMapper(OrganizationMapper.class);
        List<Organization> organizations = organizationmapper.selectByOID(organization);
        sqlSession.close();
        return organizations;
    }

    public List<Organization> selectOinfoByOID (String organization){
        SqlSession sqlSession = factory.openSession();
        OrganizationMapper organizationmapper = sqlSession.getMapper(OrganizationMapper.class);
        List<Organization> organizations = organizationmapper.selectOinfoByOID(organization);
        sqlSession.close();
        return organizations;
    }
    public static void main(String[] args) {
        OrganizationService o = new OrganizationService();
        System.out.println(o.selectOinfoByOID("1301040503284166"));
    }

}
