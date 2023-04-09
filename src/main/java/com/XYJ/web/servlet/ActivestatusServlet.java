package com.XYJ.web.servlet;


import com.XYJ.pojo.Activestatus;
import com.XYJ.service.ActivestatusService;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/activestatus/*")
public class ActivestatusServlet extends BaseServlet{
    private ActivestatusService activestatusservice = new ActivestatusService();

    public void selectStatusV(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Activestatus> activestatus = activestatusservice.selectStatusV();
        String jsonString = JSON.toJSONString(activestatus);
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write(jsonString);
    }
}
