package com.XYJ.web.servlet;

import com.XYJ.pojo.Aapplication;
import com.XYJ.pojo.Activity;
import com.XYJ.pojo.Applicationreview;
import com.XYJ.pojo.PageFY;
import com.XYJ.service.AapplicationService;
import com.XYJ.service.ActivityService;
import com.XYJ.service.ApplicationreviewService;
import com.XYJ.util.IdAutoCreateUtils;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;

@WebServlet(urlPatterns = "/applicationreview/*")
public class ApplicationreviewServlet extends BaseServlet{
    private ApplicationreviewService applicationreviewservice = new ApplicationreviewService();

    public void insert(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        //        接收用户报名信息数据
        BufferedReader us = req.getReader();
        String params = us.readLine();//获取json字符串

        System.out.println(params);
        Applicationreview applicationreview = IdAutoCreateUtils.auditid(params);

        System.out.println("我回来了");
        applicationreviewservice.insert(applicationreview);
        System.out.println("我回来了222");
        resp.getWriter().write("success");
        System.out.println("我回来了3333");
    }

    public void updateAuditstatusid(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String auditid = req.getParameter("auditid");
        applicationreviewservice.updateAuditstatusid(auditid);
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write("success");
    }

    public void updateAuditstatusid1(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        BufferedReader bufferedReader = req.getReader();
        String params = bufferedReader.readLine();
        Applicationreview applicationreview = JSON.parseObject(params,Applicationreview.class);
        applicationreviewservice.updateAuditstatusid1(applicationreview);
        Map mapTypes = JSON.parseObject(params);
        String auditstatusid =  (String)mapTypes.get("auditstatusid");
        System.out.println("--------------------------");
        System.out.println(auditstatusid);
        System.out.println("--------------------------");
        if(auditstatusid.equals("2")){
            Activity activity = JSON.parseObject(params,Activity.class);
            ActivityService activityService = new ActivityService();
            activityService.updateActivitynumberofenrolledvolunteer(activity);
System.out.println(activity);
            Aapplication aapplication = IdAutoCreateUtils.applicationid(params);
            AapplicationService aapplicationService = new AapplicationService();
            aapplicationService.insert(aapplication);
        }
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write("success");
    }
    public void selectVinfoByAIDFYSH(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        BufferedReader us = req.getReader();
        String params = us.readLine();
        String begin = req.getParameter("begin");
        int currentpage = Integer.parseInt(begin);
        System.out.println(currentpage);
        String size = req.getParameter("size");
        int pagesize = Integer.parseInt(size);
        System.out.println(pagesize);
        Applicationreview applicationreview = JSON.parseObject(params,Applicationreview.class);
        System.out.println("-------------");
        System.out.println(applicationreview);
        PageFY<Applicationreview> applicationreviews = applicationreviewservice.selectVinfoByAIDFYSH(currentpage,pagesize,applicationreview);
        System.out.println("-------------");
        System.out.println(applicationreviews);
        resp.setContentType("text/json;charset=utf-8");
        String jsonString = JSON.toJSONString(applicationreviews);
        resp.getWriter().write(jsonString);
    }
}
