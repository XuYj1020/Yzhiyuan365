package com.XYJ.mapper;

import com.XYJ.pojo.Evaluation;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface EvaluationMapper {

    @Insert("insert into evaluation(evaluationid, volunteerid, activityid, evaluationtime, content,score) values (#{evaluationid}, #{volunteerid}, #{activityid}, now(), #{content},#{score})")
    void insert(Evaluation evaluation);

    @Select("SELECT IFNULL(( select evaluationid  from evaluation where activityid =#{activityid} order by evaluationid desc limit 1),'0001')")
    String selectByAID(String activityid);

    List<Evaluation> selecteva(Evaluation evaluation);

}
