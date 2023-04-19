package com.XYJ.service;

import com.XYJ.mapper.AdminrMapper;
import com.XYJ.pojo.Adminr;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import java.util.List;
import static com.XYJ.util.SqlSessionFactoryUtils.getSqlSessionFactory;

public class AdminrService {
    SqlSessionFactory factory = getSqlSessionFactory();
    public List<Adminr> selectbyap(Adminr adminr){
        SqlSession sqlSession = factory.openSession();
        AdminrMapper adminrMapper = sqlSession.getMapper(AdminrMapper.class);
        List<Adminr> adminrs = adminrMapper.selectbyap(adminr);
        sqlSession.close();
        return adminrs;
    }
}
