package com.XYJ.mapper;

import com.XYJ.pojo.Activity;
import org.apache.ibatis.annotations.Param;

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

}
