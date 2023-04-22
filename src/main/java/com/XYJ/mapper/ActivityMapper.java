package com.XYJ.mapper;

import com.XYJ.pojo.Activity;
import com.XYJ.pojo.Credits;
import com.XYJ.pojo.Distribute;
import com.XYJ.pojo.echars;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ActivityMapper {
    void insert(Activity activity);
    List<Activity> selectByAcstyleid(int acstyle);

    List<Activity> selectByAcstyleidAll();

//    根据活动ID查询活动信息，包含活动的类别，发布组织等   联合查询
    List<Activity> selectByAcstyleidjoin(String activityid);

    List<Activity> selectActivityV(Activity activity);

    int selectActivityVCount(Activity activity);

    List<Activity> selectActivityVFY(@Param("begin") int begin, @Param("size") int size, @Param("activity") Activity activity);

    int selectActivityByVIDCount(Activity activity);
    List<Activity> selectActivityByVIDFY(@Param("begin") int begin, @Param("size") int size, @Param("activity") Activity activity);

    List<Activity> selectActivityAID(String activityid);

    List<Activity> selectActivityByVIDFYSQ(@Param("begin") int begin, @Param("size") int size, @Param("activity") Activity activity);

    int selectActivityByVIDCountSQ(Activity activity);

    List<Activity> selectActivityByOIDFYSQ(@Param("begin") int begin, @Param("size") int size, @Param("activity") Activity activity);

    int selectActivityByOIDCountSQ(Activity activity);

    @Update("update activity set activestatusid = 5 where activityid=#{activityid}")
    void updateActivityActivestatusid(String activityid);

    @Update("update activity set activestatusid = 4 where activityid=#{activityid}")
    void updateActivityActivestatusid4(Activity activity);

    @Update("update activity set activestatusid = #{activestatusid} where activityid=#{activityid}")
    void updateActivityActivestatusid71(Activity activity);
    void updateAinfo(Activity activity);

    void updateActivitynumberofenrolledvolunteer(Activity activity);

    List<Activity> selectAcstylelimit3(Activity activity);

    List<Activity> selectCOUNTbyacstyleecharts();

    List<echars> selectcountbyacstatusecharts();

List<Activity> selectcreditsByVid(Activity activity);
    int selectcreditsByVidCount(Credits credits);

    List<Activity> selectcreditsByVidFY(@Param("begin") int begin, @Param("size") int size, @Param("credits") Credits credits);

    int selectdistributeByVidCount(Distribute distribute);

    List<Activity> selectdistributeByVidFY(@Param("begin") int begin, @Param("size") int size, @Param("distribute") Distribute distribute);

    List<echars> selectActivestatuscounts(Activity activity);

    List<echars> selectActivestatuscounts2(Activity activity);

    List<echars> selectActivestatuscounts3(Activity activity);
}
