package com.XYJ.web.servlet;

import com.XYJ.pojo.Activity;
import com.XYJ.pojo.Aleader;
import com.XYJ.pojo.Organization;
import com.XYJ.pojo.PageFY;
import com.XYJ.service.ActivityService;
import com.XYJ.service.AleaderService;
import com.XYJ.util.IdAutoCreateUtils;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebFault;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@WebServlet(urlPatterns = "/aleader/*")

public class AleaderServlet extends BaseServlet{
    AleaderService aleaderservice = new AleaderService();
    public void insert(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        //        接收活动管理员数据
        BufferedReader ac = req.getReader();
        String params = ac.readLine();//获取json字符串
        //        调用自动生成ID的工具生成用户ID
//        Aleader aleader= IdAutoCreateUtils.activityid(params);


        System.out.println("AleaderServlet里面的" + params);

//        把前端传入的数据转成map类型
        Map mapTypes = JSON.parseObject(params);
//        循环遍历map，取出键名为leader的值，是一个数组，将其存入list
        List<String> list = (List<String>) mapTypes.get("leader");
        System.out.println( list);
        System.out.println( mapTypes.get("activityid"));
        String activityid = (String) mapTypes.get("activityid");
        activityid.replaceFirst("HD","HDGL");

        /*
//        对list进行循环遍历取出每个数组里面每个值
        for (String a : list){
            System.out.println(a);
            int i = 1;
            System.out.println(i);
            i++;
        }

         */
//        对list进行循环遍历取出每个数组里面每个值
        for (int i = 0; i < list.size(); i++){
            String volunteerid = list.get(i);
//            System.out.println(volunteerid);
//            补0，补到四位
            String n = String.format("%04d", i+1);
            String leaderid = activityid + n ;
//            把值封装进map
            mapTypes.put("stafid",volunteerid);
            mapTypes.put("leaderid",leaderid);
//            System.out.println(mapTypes);
//            把map转为json字符串
            String jsonString = JSON.toJSONString(mapTypes);
//            把json字符串转成aleader类型
            Aleader aleader = JSON.parseObject(jsonString, Aleader.class);
        //2. 调用service添加
            aleaderservice.insert(aleader);
        }

//        System.out.println(aleader);
//        //2. 调用service添加
//        aleaderservice.insert(aleader);
        //3. 响应成功的标识
        resp.getWriter().write("success");
    }

    public void selectActivityByVAleadIDFYSQ(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        BufferedReader us = req.getReader();
        String params = us.readLine();
        String begin = req.getParameter("begin");
        int currentpage = Integer.parseInt(begin);

        String size = req.getParameter("size");
        int pagesize = Integer.parseInt(size);

        Aleader aleader = JSON.parseObject(params,Aleader.class);

        PageFY<Aleader> aleaders = aleaderservice.selectActivityByVAleadIDFYSQ(currentpage,pagesize,aleader);

        resp.setContentType("text/json;charset=utf-8");
        String jsonString = JSON.toJSONString(aleaders);
        resp.getWriter().write(jsonString);
    }
}
