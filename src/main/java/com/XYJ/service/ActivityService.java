package com.XYJ.service;

import com.XYJ.mapper.ActivityMapper;
import com.XYJ.pojo.Acstyle;
import com.XYJ.pojo.Activity;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

import static com.XYJ.util.SqlSessionFactoryUtils.getSqlSessionFactory;

public class ActivityService {
    SqlSessionFactory factory = getSqlSessionFactory();
    public void insert(Activity activity){
        SqlSession sqlSession = factory.openSession();
        ActivityMapper activitymapper = sqlSession.getMapper(ActivityMapper.class);
        activitymapper.insert(activity);
        sqlSession.commit();
        sqlSession.close();
    }

    public List<Activity> selectByAcstyleid(int acstyle){
        SqlSession sqlSession = factory.openSession();
        ActivityMapper activitymapper = sqlSession.getMapper(ActivityMapper.class);
        List<Activity> activity = activitymapper.selectByAcstyleid(acstyle);
        sqlSession.close();
        return activity;
    }

    public List<Activity> selectByAcstyleidAll(){
        SqlSession sqlSession = factory.openSession();
        ActivityMapper activitymapper = sqlSession.getMapper(ActivityMapper.class);
        List<Activity> activity = activitymapper.selectByAcstyleidAll();
        sqlSession.close();
        return activity;
    }

    public List<Activity> selectByAcstyleidjoin(String activityid){
        SqlSession sqlSession = factory.openSession();
        ActivityMapper activitymapper = sqlSession.getMapper(ActivityMapper.class);
        List<Activity> activity = activitymapper.selectByAcstyleidjoin(activityid);
        sqlSession.close();
        return activity;
    }

    public static void main(String[] args) {
        ActivityService activityService = new ActivityService();
        List<Activity> ac =  activityService.selectByAcstyleidjoin("HD1101019803312778");
        for(Activity activity : ac){
            System.out.println(ac);
            System.out.println(activity.getAcstyles().getAcstyle());
            String a = activity.getAcstyles().getAcstyle();
        }
    }
}
