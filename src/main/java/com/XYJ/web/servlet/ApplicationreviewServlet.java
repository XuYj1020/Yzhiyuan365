package com.XYJ.web.servlet;

import com.XYJ.pojo.Applicationreview;
import com.XYJ.service.ApplicationreviewService;
import com.XYJ.util.IdAutoCreateUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

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
}
