package com.XYJ.web.servlet;

import com.XYJ.pojo.Acstyle;
import com.XYJ.pojo.Signrecord;
import com.XYJ.pojo.User;
import com.XYJ.service.AcstyleService;
import com.XYJ.service.SignrecordService;
import com.XYJ.util.IdAutoCreateUtils;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/signrecord/*")
public class SignrecordServlet extends BaseServlet{
    private SignrecordService signrecordService = new SignrecordService();
    public void selectByAIDCount(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String applicationid = request.getParameter("applicationid");
        String recordid = signrecordService.selectByAID(applicationid);
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(recordid);
    }

    public void insert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        BufferedReader us = request.getReader();
        String params = us.readLine();//获取json字符串
        Signrecord signrecord= IdAutoCreateUtils.recordid(params);
        signrecordService.insert(signrecord);
        response.getWriter().write("success");
    }


}
