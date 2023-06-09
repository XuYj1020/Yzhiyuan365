package com.XYJ.web.servlet;

import com.XYJ.pojo.*;
import com.XYJ.service.OjoinService;
import com.XYJ.service.OmembersService;
import com.XYJ.service.UserService;
import com.XYJ.util.IdAutoCreateUtils;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/ojoin/*")
public class OjoinServlet extends BaseServlet{
    private OjoinService ojoinservice = new OjoinService();
    public void insert(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
//        接收用户申请加入组织数据
        BufferedReader ac = req.getReader();
        String params = ac.readLine();//获取json字符串
//        调用自动生成ID的工具生成申请ID
        Ojoin ojoin= IdAutoCreateUtils.ojoinid(params);


        System.out.println(ojoin);
//        //2. 调用service添加
        ojoinservice.insert(ojoin);
        //3. 响应成功的标识
        resp.getWriter().write("success");
    }

    public void selectByOVid(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        req.setCharacterEncoding("UTF-8");
        //        接收用户id和组织id
        BufferedReader ac = req.getReader();
        String params = ac.readLine();//获取json字符串
        Ojoin ojoin = JSON.parseObject(params,Ojoin.class);
//          2. 调用service
        List<Ojoin> ojoins =  ojoinservice.selectByOVid(ojoin);
        //3. 返回数据
        String jsonString = JSON.toJSONString(ojoins);
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write(jsonString);
    }

    public void selectALLBYOVIDJOINFY(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        BufferedReader us = req.getReader();
        String params = us.readLine();
        String begin = req.getParameter("begin");
        int currentpage = Integer.parseInt(begin);
        String size = req.getParameter("size");
        int pagesize = Integer.parseInt(size);
        Ojoin ojoin = JSON.parseObject(params,Ojoin.class);
        PageFY<Ojoin> ojoins = ojoinservice.selectALLBYOVIDJOINFY(currentpage,pagesize,ojoin);
        resp.setContentType("text/json;charset=utf-8");
        String jsonString = JSON.toJSONString(ojoins);
        resp.getWriter().write(jsonString);
    }

    public void updateauditstatusid(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
//        接收用户申请加入组织数据
        BufferedReader ac = req.getReader();
        String params = ac.readLine();//获取json字符串
        Ojoin ojoin = JSON.parseObject(params,Ojoin.class);
//        //2. 调用service添加
        ojoinservice.updateauditstatusid(ojoin);
        //3. 响应成功的标识
        resp.getWriter().write("success");
    }

    public void selectshifoujiaruhoushenhe(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        req.setCharacterEncoding("UTF-8");
        //        接收用户id和组织id
        BufferedReader ac = req.getReader();
        String params = ac.readLine();//获取json字符串
        Ojoin ojoin = JSON.parseObject(params,Ojoin.class);
//          2. 调用service
        int count =  ojoinservice.selectshifoujiaruhoushenhe(ojoin);
        //3. 返回数据
        String jsonString = String.valueOf(count);
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write(jsonString);
    }

    public void selectpanduanshifoukeyjiaruzuzhi(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        req.setCharacterEncoding("UTF-8");
        //        接收用户id和组织id
        BufferedReader ac = req.getReader();
        String params = ac.readLine();//获取json字符串
        Ojoin ojoin = JSON.parseObject(params,Ojoin.class);
//          2. 调用service
        List<ShenHeShuLiang> count =  ojoinservice.selectpanduanshifoukeyjiaruzuzhi(ojoin);
        //3. 返回数据
        String jsonString = JSON.toJSONString(count);
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write(jsonString);
    }
}
