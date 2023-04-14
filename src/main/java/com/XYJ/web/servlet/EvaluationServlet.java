package com.XYJ.web.servlet;

import com.XYJ.pojo.Aleave;
import com.XYJ.pojo.Evaluation;
import com.XYJ.service.AleaveService;
import com.XYJ.service.EvaluationService;
import com.XYJ.util.IdAutoCreateUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet(urlPatterns = "/evaluation/*")
public class EvaluationServlet extends BaseServlet{
    private EvaluationService evaluationService= new EvaluationService();

    public void insert(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        BufferedReader us = req.getReader();
        String params = us.readLine();//获取json字符串
        Evaluation evaluation = IdAutoCreateUtils.evaluationid(params);
        evaluationService.insert(evaluation);
        resp.getWriter().write("success");
    }
}
