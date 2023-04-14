package com.XYJ.web.servlet;

import com.XYJ.mapper.AleaveMapper;
import com.XYJ.pojo.Aleave;
import com.XYJ.pojo.Signrecord;
import com.XYJ.service.AleaveService;
import com.XYJ.util.IdAutoCreateUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet(urlPatterns = "/aleave/*")
public class AleaveServlet extends BaseServlet{
    private AleaveService aleaveService= new AleaveService();

    public void insert(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        BufferedReader us = req.getReader();
        String params = us.readLine();//获取json字符串
        Aleave aleave = IdAutoCreateUtils.leaveapplicationid(params);
        aleaveService.insert(aleave);
        resp.getWriter().write("success");
    }

}
