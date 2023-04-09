package com.XYJ.web.servlet;

import com.XYJ.pojo.Acstyle;
import com.XYJ.service.AcstyleService;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet( urlPatterns = "/Acstyle/*")
public class AcstyleServlet extends BaseServlet{
    private AcstyleService acstyleservice = new AcstyleService();
    public void selectAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("SelectProvince......");
        List<Acstyle> acstyle = acstyleservice.selectAll();
        String jsonString = JSON.toJSONString(acstyle);
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write(jsonString);
    }
}
