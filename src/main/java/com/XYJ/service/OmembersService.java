package com.XYJ.service;

import com.XYJ.mapper.DistributeMapper;
import com.XYJ.mapper.OjoinMapper;
import com.XYJ.mapper.OmembersMapper;
import com.XYJ.pojo.Ojoin;
import com.XYJ.pojo.Omembers;
import com.XYJ.pojo.PageFY;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

import static com.XYJ.util.SqlSessionFactoryUtils.getSqlSessionFactory;

public class OmembersService {
    SqlSessionFactory factory = getSqlSessionFactory();
    public void insert(Omembers omembers){
        SqlSession sqlSession = factory.openSession();
        OmembersMapper omembersmapper = sqlSession.getMapper(OmembersMapper.class);
        omembersmapper.insert(omembers);
        sqlSession.commit();
        sqlSession.close();
    }

    public String stafid(String organizationid){
        SqlSession sqlSession = factory.openSession();
        OmembersMapper omembersmapper = sqlSession.getMapper(OmembersMapper.class);
        String stafid = omembersmapper.stafid(organizationid);
        sqlSession.close();
        return stafid;
    }


    public List<Omembers> selectByOVid(Omembers omember){
        SqlSession sqlSession = factory.openSession();
        OmembersMapper omembersmapper = sqlSession.getMapper(OmembersMapper.class);
        List<Omembers> omembers = omembersmapper.selectByOVid(omember);
        sqlSession.commit();
        sqlSession.close();
        return omembers;
    }

    public List<Omembers> selectmembersByOID(Omembers omember){
        SqlSession sqlSession = factory.openSession();
        OmembersMapper omembersmapper = sqlSession.getMapper(OmembersMapper.class);
        List<Omembers> omembers = omembersmapper.selectByOVid(omember);
        sqlSession.commit();
        sqlSession.close();
        return omembers;
    }

    public PageFY<Omembers> selectALLBYOVIDJOINFY(int begin, int size, Omembers omember){
        SqlSession sqlSession = factory.openSession();
        OmembersMapper omembersmapper = sqlSession.getMapper(OmembersMapper.class);

//        总记录数
        int total = omembersmapper.selectALLBYOVIDJOINFYCount(omember);
        System.out.println(total);
        begin = (begin - 1) * size;
        List<Omembers> omembers = omembersmapper.selectALLBYOVIDJOINFY(begin,size,omember);

        PageFY<Omembers> page = new PageFY<>();
        page.setTotal(total);
        page.setShuju(omembers);
        sqlSession.close();
        return page;
    }

    public void updateombers(Omembers omembers){
        SqlSession sqlSession = factory.openSession();
        OmembersMapper omembersmapper = sqlSession.getMapper(OmembersMapper.class);
        omembersmapper.updateombers(omembers);
        sqlSession.commit();
        sqlSession.close();
    }
}
