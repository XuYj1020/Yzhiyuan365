package com.XYJ.web.servlet;

import com.XYJ.pojo.Education;
import com.XYJ.service.EducationService;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/Education/*")
public class EducationServlet extends BaseServlet{
    private EducationService educationservice = new EducationService();
    public void SelectAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Education> education = educationservice.selectAll();
        String jsonString = JSON.toJSONString(education);
        System.out.println(jsonString);
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write(jsonString);
    }


}
