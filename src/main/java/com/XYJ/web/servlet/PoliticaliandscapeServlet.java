package com.XYJ.web.servlet;

import com.XYJ.pojo.Politicaliandscape;
import com.XYJ.service.PoliticaliandscapeService;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/Politicaliandscape/*")
public class PoliticaliandscapeServlet extends BaseServlet{
    private PoliticaliandscapeService politicaliandscapeservice = new PoliticaliandscapeService();
    public void SelectAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Politicaliandscape> politicaliandscape = politicaliandscapeservice.selectAll();
        String jsonString = JSON.toJSONString(politicaliandscape);
        System.out.println(jsonString);
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write(jsonString);
    }
}
