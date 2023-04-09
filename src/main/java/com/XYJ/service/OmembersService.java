package com.XYJ.service;

import com.XYJ.mapper.OmembersMapper;
import com.XYJ.pojo.Omembers;
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
}
