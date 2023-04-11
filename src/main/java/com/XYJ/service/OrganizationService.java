package com.XYJ.service;

import com.XYJ.mapper.OrganizationMapper;
import com.XYJ.pojo.Organization;
import com.XYJ.pojo.PageFY;
import com.alibaba.fastjson.JSON;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public PageFY<Organization> selectOraganizationVFY(int begin,int size,Organization organization){
        SqlSession sqlSession = factory.openSession();
        OrganizationMapper organizationmapper = sqlSession.getMapper(OrganizationMapper.class);
        int total = organizationmapper.selectOraganizationVCount(organization);
        System.out.println(total);
        begin = (begin - 1) * size;
        List<Organization> organizations = organizationmapper.selectOraganizationVFY(begin, size, organization);
        PageFY<Organization> page = new PageFY<>();
        page.setShuju(organizations);
        page.setTotal(total);
        return page;
    }
    public static void main(String[] args) {
        OrganizationService o = new OrganizationService();
        System.out.println(o.selectOinfoByOID("1301040503284166"));

        Map<String,Object> ainfo = new HashMap<>();
//        ainfo.put("otype","1");
        String jsonString = JSON.toJSONString(ainfo);
        Organization act = JSON.parseObject(jsonString,Organization.class);
        System.out.println(o.selectOraganizationVFY(1,50,act));

    }

}
