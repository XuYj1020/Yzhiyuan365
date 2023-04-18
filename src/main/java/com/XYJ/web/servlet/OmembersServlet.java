package com.XYJ.web.servlet;

import com.XYJ.pojo.Ojoin;
import com.XYJ.pojo.Omembers;
import com.XYJ.pojo.PageFY;
import com.XYJ.service.AleaderService;
import com.XYJ.service.OmembersService;
import com.XYJ.util.IdAutoCreateUtils;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/Omembers/*")
public class OmembersServlet extends BaseServlet{
    OmembersService omembersservice = new OmembersService();
    public void selectByOVid(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
//        接收用户id和组织id
        BufferedReader ac = req.getReader();
        String params = ac.readLine();//获取json字符串
        Omembers omembers = JSON.parseObject(params,Omembers.class);
//          2. 调用service
       List<Omembers> omembers1 =  omembersservice.selectByOVid(omembers);
        //3. 返回数据
        String jsonString = JSON.toJSONString(omembers1);
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write(jsonString);
    }

    public void insert(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
//        接收用户id和组织id
        BufferedReader ac = req.getReader();
        String params = ac.readLine();//获取json字符串
        Omembers omembers = IdAutoCreateUtils.stafid(params);
//          2. 调用service
        omembersservice.insert(omembers);
        //3. 返回数据
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write("success");
    }

    public void selectALLBYOVIDJOINFY(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        BufferedReader us = req.getReader();
        String params = us.readLine();
        String begin = req.getParameter("begin");
        int currentpage = Integer.parseInt(begin);
        String size = req.getParameter("size");
        int pagesize = Integer.parseInt(size);
        Omembers omembers = JSON.parseObject(params,Omembers.class);
        PageFY<Omembers> omber = omembersservice.selectALLBYOVIDJOINFY(currentpage,pagesize,omembers);
        resp.setContentType("text/json;charset=utf-8");
        String jsonString = JSON.toJSONString(omber);
        resp.getWriter().write(jsonString);
    }

    public void updateombers(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
//        接收用户id和组织id
        BufferedReader ac = req.getReader();
        String params = ac.readLine();//获取json字符串
        Omembers omembers = JSON.parseObject(params,Omembers.class);
//          2. 调用service
        omembersservice.updateombers(omembers);
        //3. 返回数据
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write("success");
    }
}
