package com.XYJ.service;

import com.XYJ.mapper.ActivityMapper;
import com.XYJ.pojo.Acstyle;
import com.XYJ.pojo.Activity;

import com.XYJ.pojo.Applicationreview;
import com.XYJ.pojo.PageFY;
import com.alibaba.fastjson.JSON;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public List<Activity> selectByAcstyleidjoin(String activityids){
        SqlSession sqlSession = factory.openSession();
        ActivityMapper activitymapper = sqlSession.getMapper(ActivityMapper.class);
        List<Activity> activity = activitymapper.selectByAcstyleidjoin(activityids);
        sqlSession.close();
        return activity;
    }

    public List<Activity> selectActivityV(Activity activity){
        SqlSession sqlSession = factory.openSession();
        ActivityMapper activitymapper = sqlSession.getMapper(ActivityMapper.class);
        List<Activity> activitys = activitymapper.selectActivityV(activity);
        sqlSession.close();
        return activitys;
    }

    public PageFY<Activity> selectActivityVFY(int begin,int size,Activity activity){
        SqlSession sqlSession = factory.openSession();
        ActivityMapper activitymapper = sqlSession.getMapper(ActivityMapper.class);

//        总记录数
        int total = activitymapper.selectActivityVCount(activity);
        System.out.println(total);
        begin = (begin - 1) * size;
        List<Activity> activitys = activitymapper.selectActivityVFY(begin,size,activity);

        PageFY<Activity> page = new PageFY<>();
        page.setTotal(total);
        page.setShuju(activitys);
        sqlSession.close();
        return page;
    }

    public PageFY<Activity> selectActivityBYVIDFY(int begin,int size,Activity activity){
        SqlSession sqlSession = factory.openSession();
        ActivityMapper activitymapper = sqlSession.getMapper(ActivityMapper.class);

//        总记录数
        int total = activitymapper.selectActivityByVIDCount(activity);
        System.out.println(total);
        begin = (begin - 1) * size;
        List<Activity> activitys = activitymapper.selectActivityByVIDFY(begin,size,activity);

        PageFY<Activity> page = new PageFY<>();
        page.setTotal(total);
        page.setShuju(activitys);
        sqlSession.close();
        return page;
    }

    public PageFY<Activity> selectActivityBYVIDFYSQ(int begin,int size,Activity activity){
        SqlSession sqlSession = factory.openSession();
        ActivityMapper activitymapper = sqlSession.getMapper(ActivityMapper.class);

//        总记录数
        int total = activitymapper.selectActivityByVIDCountSQ(activity);
        System.out.println(total);
        begin = (begin - 1) * size;
        List<Activity> activitys = activitymapper.selectActivityByVIDFYSQ(begin,size,activity);

        PageFY<Activity> page = new PageFY<>();
        page.setTotal(total);
        page.setShuju(activitys);
        sqlSession.close();
        return page;
    }

    public PageFY<Activity> selectActivityBYOIDFYSQ(int begin,int size,Activity activity){
        SqlSession sqlSession = factory.openSession();
        ActivityMapper activitymapper = sqlSession.getMapper(ActivityMapper.class);

//        总记录数
        int total = activitymapper.selectActivityByOIDCountSQ(activity);
        System.out.println(total);
        begin = (begin - 1) * size;
        List<Activity> activitys = activitymapper.selectActivityByOIDFYSQ(begin,size,activity);

        PageFY<Activity> page = new PageFY<>();
        page.setTotal(total);
        page.setShuju(activitys);
        sqlSession.close();
        return page;
    }

    public List<Activity> selectActivityAID(String activityid){
        SqlSession sqlSession = factory.openSession();
        ActivityMapper activitymapper = sqlSession.getMapper(ActivityMapper.class);
        List<Activity> activitys = activitymapper.selectActivityAID(activityid);
        sqlSession.close();
        return activitys;
    }

    public void updateActivityActivestatusid(String activityid){
        SqlSession sqlSession = factory.openSession();
        ActivityMapper activitymapper = sqlSession.getMapper(ActivityMapper.class);
        activitymapper.updateActivityActivestatusid(activityid);
        sqlSession.close();
    }

    public void updateActivityActivestatusid4(Activity activity){
        SqlSession sqlSession = factory.openSession();
        ActivityMapper activitymapper = sqlSession.getMapper(ActivityMapper.class);
        activitymapper.updateActivityActivestatusid4(activity);
        sqlSession.close();
    }

    public void updateAinfo(Activity activity){
        SqlSession sqlSession = factory.openSession();
        ActivityMapper activitymapper = sqlSession.getMapper(ActivityMapper.class);
        activitymapper.updateAinfo(activity);
        sqlSession.close();
    }

    public void updateActivitynumberofenrolledvolunteer(Activity activity){
        SqlSession sqlSession = factory.openSession();
        ActivityMapper activitymapper = sqlSession.getMapper(ActivityMapper.class);
        activitymapper.updateActivitynumberofenrolledvolunteer(activity);
        sqlSession.close();
    }




    public static void main(String[] args) {
        ActivityService activityService = new ActivityService();
        List<Activity> ac =  activityService.selectByAcstyleidjoin("HD1101019803312778");
        for(Activity activity : ac){
            System.out.println(ac);
            System.out.println(activity.getAcstyles().getAcstyle());
            String a = activity.getAcstyles().getAcstyle();
        }


        Map<String,Object> ainfo = new HashMap<>();
//        ainfo.put("activityid","130304");
        String jsonString = JSON.toJSONString(ainfo);
        Activity act = JSON.parseObject(jsonString,Activity.class);
        List<Activity> acts =  activityService.selectActivityV(act);
//        System.out.println(acts);
        System.out.println("---------------------");
//        System.out.println(activityService.selectByAcstyleidjoin("HD1101019303317360"));
        System.out.println("---------------------");
        System.out.println(activityService.selectActivityBYVIDFY(1,5,act));
        System.out.println("---------------------");
        System.out.println(activityService.selectActivityAID("HD1402136804081804"));
    }
}
