package com.XYJ.web.servlet;

import com.XYJ.pojo.Signcode;
import com.XYJ.pojo.Signrecord;
import com.XYJ.service.SigncodeService;
import com.XYJ.util.IdAutoCreateUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet(urlPatterns = "/signcode/*")
public class SigncodeServlet extends BaseServlet{
    SigncodeService signcodeService = new SigncodeService();

    public void insert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        BufferedReader us = request.getReader();
        String params = us.readLine();//获取json字符串
        Signcode signcode = IdAutoCreateUtils.signcode(params);
        signcodeService.insert(signcode);
        response.getWriter().write("success");
    }
}
