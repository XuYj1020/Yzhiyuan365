package com.XYJ.service;

import com.XYJ.mapper.AleaveMapper;
import com.XYJ.mapper.EvaluationMapper;
import com.XYJ.pojo.Aleave;
import com.XYJ.pojo.Evaluation;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

import static com.XYJ.util.SqlSessionFactoryUtils.getSqlSessionFactory;

public class EvaluationService {
    SqlSessionFactory factory = getSqlSessionFactory();
    public void insert(Evaluation evaluation){
        SqlSession sqlSession = factory.openSession();
        EvaluationMapper evaluationMapper = sqlSession.getMapper(EvaluationMapper.class);
        evaluationMapper.insert(evaluation);
        sqlSession.close();
    }

    public List<Evaluation> selecteva(Evaluation evaluation){
        SqlSession sqlSession = factory.openSession();
        EvaluationMapper evaluationMapper = sqlSession.getMapper(EvaluationMapper.class);
        List<Evaluation> evaluations = evaluationMapper.selecteva(evaluation);
        sqlSession.close();
        return evaluations;
    }

    public String selectByAID(String activityid){
        SqlSession sqlSession = factory.openSession();
        EvaluationMapper evaluationMapper = sqlSession.getMapper(EvaluationMapper.class);
        String evaluationid = evaluationMapper.selectByAID(activityid);
        sqlSession.close();
        return evaluationid;
    }
}
