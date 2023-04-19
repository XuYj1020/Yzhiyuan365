package com.XYJ.web.servlet;

import com.XYJ.pojo.Adminr;
import com.XYJ.service.AdminrService;
import com.XYJ.util.CCTokenUtil;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/adminr/*")
public class AdminrServlet extends BaseServlet{
    AdminrService adminrService = new AdminrService();
    public void selectbyap(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        BufferedReader us = req.getReader();
        String params = us.readLine();//获取json字符串
        Adminr adminr = JSON.parseObject(params,Adminr.class);
        List<Adminr> adminrs = adminrService.selectbyap(adminr);
        String jsonString = JSON.toJSONString(adminrs);
        resp.setContentType("text/json;charset=utf-8");
        if(!adminrs.isEmpty()){
            String tokenstring = CCTokenUtil.CreateAToken(jsonString);
            System.out.println(tokenstring);
            resp.getWriter().write(tokenstring);
        }else{
            resp.getWriter().write("false");
        }
    }
}
