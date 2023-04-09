package com.XYJ.mapper;

import com.XYJ.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User>selectAll();

    void insert(User user);

    Integer Login(User user);

    Integer selectByPhone(String phone);

    Integer selectByIdnumber(String idnumber);

    List<User>selectByPhonePass(User user);

    List<User>selectByVIDjoinOID(String organizationid);

//    通过活动id找到活动管理员的信息  活动管理员表和志愿者表联合查寻 一找多 志愿者表是多
    List<User>selectByjoinAID(String activityid);
}
