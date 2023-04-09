package com.XYJ.web.servlet;

import com.XYJ.pojo.Activity;
import com.XYJ.pojo.User;
import com.XYJ.service.ActivityService;
import com.XYJ.util.IdAutoCreateUtils;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

@WebServlet( urlPatterns = "/Activity/*")
public class ActivityServlet extends BaseServlet{
    ActivityService activityservice = new ActivityService();
    public void insert(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        //        接收用户注册信息数据
        BufferedReader ac = req.getReader();
        String params = ac.readLine();//获取json字符串
        //        调用自动生成ID的工具生成用户ID  前端生成
//        Activity activity= IdAutoCreateUtils.activityid(params);

        //        转换格式
        Activity activity = JSON.parseObject(params, Activity.class);
        System.out.println(activity);
        //2. 调用service添加
        activityservice.insert(activity);
        //3. 响应成功的标识
        resp.getWriter().write("success");
    }



    public void selectByAcstyleidAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
//        调用activityservice的selectByAcstyleidAll()方法，返回List<Activity>
        List<Activity> activitys = activityservice.selectByAcstyleidAll();
//        将集合转换为JSON数据 序列化
        String jsonString = JSON.toJSONString(activitys);
        System.out.println(jsonString);
//        响应数据 发送给客户端
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write(jsonString);

    }

    public void  selectByAcstyleid(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
 //        接收Acstyleid
        BufferedReader us = req.getReader();
        String params = us.readLine();//获取json字符串
//        转换格式
        int acstyleid = JSON.parseObject(params, int.class);
//        调用方法
        List<Activity> activitys = activityservice.selectByAcstyleid(acstyleid);
//        返回数据
        resp.setContentType("text/json;charset=utf-8");
        String jsonString = JSON.toJSONString(activitys);
        resp.getWriter().write(jsonString);
    }

    public void selectByAcstyleidjoin(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        //        接收Acstyleid
        BufferedReader us = req.getReader();
        String params = us.readLine();//获取json字符串
//        转换格式
        String activity = JSON.parseObject(params, String.class);
        String activityid = req.getParameter("activityid");
//        调用方法
        List<Activity> activitys = activityservice.selectByAcstyleidjoin(activityid);
//        返回数据
        resp.setContentType("text/json;charset=utf-8");
        String jsonString = JSON.toJSONString(activitys);
        resp.getWriter().write(jsonString);
    }
}
