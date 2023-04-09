package com.XYJ.service;

import com.XYJ.mapper.ActivestatusMapper;
import com.XYJ.pojo.Activestatus;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import java.util.List;

import static com.XYJ.util.SqlSessionFactoryUtils.getSqlSessionFactory;

public class ActivestatusService {
    SqlSessionFactory factory =getSqlSessionFactory();

    public List<Activestatus> selectStatusV(){
        SqlSession sqlSession = factory.openSession();
        ActivestatusMapper activestatusmapper = sqlSession.getMapper(ActivestatusMapper.class);
        List<Activestatus> activestatus = activestatusmapper.selectStatusV();
        sqlSession.close();
        return activestatus;
    }

    public static void main(String[] args) {
        ActivestatusService a = new ActivestatusService();
        System.out.println(a.selectStatusV());
    }
}
