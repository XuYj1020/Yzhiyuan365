package com.XYJ.web.servlet;

import com.XYJ.pojo.Otype;
import com.XYJ.pojo.User;
import com.XYJ.service.OtypeService;
import com.XYJ.service.UserService;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;


@WebServlet( urlPatterns = "/otype/*")
public class OtypeServlet extends BaseServlet{
    private OtypeService otypeservice = new OtypeService();

    public void selectByRegistrationstatusid(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        BufferedReader us = req.getReader();
        String params = us.readLine();//获取json字符串
        System.out.println(params);
//        转换格式
        String registrationsid = JSON.parseObject(params, String.class);
//        调用方法
        List<Otype> otype = otypeservice.selectByRegistrationstatusid(registrationsid);

        System.out.println(otype);
//        返回数据
        resp.setContentType("text/json;charset=utf-8");
        String jsonString = JSON.toJSONString(otype);
        resp.getWriter().write(jsonString);
    }

    public void selectAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        List<Otype> otype = otypeservice.selectAll();
        resp.setContentType("text/json;charset=utf-8");
        String jsonString = JSON.toJSONString(otype);
        resp.getWriter().write(jsonString);
    }
}
