package com.XYJ.service;

import com.XYJ.mapper.OrganizationMapper;
import com.XYJ.mapper.UserMapper;
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

    public Integer selectByPhone(String phone){
        SqlSession sqlSession = factory.openSession();
        OrganizationMapper organizationmapper = sqlSession.getMapper(OrganizationMapper.class);
        Integer organizatios =organizationmapper.selectByPhone(phone);
        sqlSession.close();
        return organizatios;
    }

    public Integer selectuserstatusid(String origanizationID){
        SqlSession sqlSession = factory.openSession();
        OrganizationMapper organizationmapper = sqlSession.getMapper(OrganizationMapper.class);
        Integer organizatios =organizationmapper.selectuserstatusid(origanizationID);
        sqlSession.close();
        return organizatios;
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

    public String selectPassword(String origanizationID){
        SqlSession sqlSession = factory.openSession();
        OrganizationMapper organizationmapper = sqlSession.getMapper(OrganizationMapper.class);
        String organizatios =organizationmapper.selectPassword(origanizationID);
        sqlSession.close();
        return organizatios;
    }

    public List<Organization> selectByOIDAll(String organization){
        SqlSession sqlSession = factory.openSession();
        OrganizationMapper organizationmapper = sqlSession.getMapper(OrganizationMapper.class);
        List<Organization> organizations = organizationmapper.selectByOIDAll(organization);
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

    public void updateOphone(Organization organization){
        SqlSession sqlSession = factory.openSession();
        OrganizationMapper organizationmapper = sqlSession.getMapper(OrganizationMapper.class);
        organizationmapper.updateOphone(organization);
        sqlSession.close();
    }

    public void updateOpasd(Organization organization){
        SqlSession sqlSession = factory.openSession();
        OrganizationMapper organizationmapper = sqlSession.getMapper(OrganizationMapper.class);
        organizationmapper.updateOpasd(organization);
        sqlSession.close();
    }
    public void updateOinfo(Organization organization){
        SqlSession sqlSession = factory.openSession();
        OrganizationMapper organizationmapper = sqlSession.getMapper(OrganizationMapper.class);
        organizationmapper.updateOinfo(organization);
        sqlSession.close();
    }

    public PageFY<Organization> selectOraganizationAdminFY(int begin,int size,Organization organization){
        SqlSession sqlSession = factory.openSession();
        OrganizationMapper organizationmapper = sqlSession.getMapper(OrganizationMapper.class);
        int total = organizationmapper.selectOraganizationAdminCount(organization);
        System.out.println(total);
        begin = (begin - 1) * size;
        List<Organization> organizations = organizationmapper.selectOraganizationAdminFY(begin, size, organization);
        PageFY<Organization> page = new PageFY<>();
        page.setShuju(organizations);
        page.setTotal(total);
        return page;
    }

    public void updateuserstatusid(Organization organization){
        SqlSession sqlSession = factory.openSession();
        OrganizationMapper organizationmapper = sqlSession.getMapper(OrganizationMapper.class);
        organizationmapper.updateuserstatusid(organization);
        sqlSession.close();
    }
    public static void main(String[] args) {
        OrganizationService o = new OrganizationService();
        System.out.println(o.selectByOID("1301040503284166"));

        Map<String,Object> ainfo = new HashMap<>();
//        ainfo.put("otype","1");
        String jsonString = JSON.toJSONString(ainfo);
        Organization act = JSON.parseObject(jsonString,Organization.class);
        System.out.println(o.selectOraganizationVFY(1,50,act));
        System.out.println(o.selectByPhone("13698563255"));

    }



}
