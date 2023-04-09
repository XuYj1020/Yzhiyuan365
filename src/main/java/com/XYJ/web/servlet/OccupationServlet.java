package com.XYJ.web.servlet;

import com.XYJ.pojo.Occupation;
import com.XYJ.service.OccupationService;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/Occupation/*")

public class OccupationServlet extends BaseServlet{
    private OccupationService occupationservice = new OccupationService();
    public void SelectAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Occupation> occupation = occupationservice.selectAll();
        String jsonString = JSON.toJSONString(occupation);
        System.out.println(jsonString);
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write(jsonString);
    }
}
