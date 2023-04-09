package com.XYJ.web.servlet;

import com.XYJ.pojo.Admissionpolicy;
import com.XYJ.service.AdmissionpolicyService;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet( urlPatterns = "/Admissionpolicy/*")
public class AdmissionpolicyServlet extends BaseServlet{
    private AdmissionpolicyService admissionpolicyservice = new AdmissionpolicyService();
    public void selectAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Admissionpolicy> admissionpolicy = admissionpolicyservice.selectAll();
        String jsonString = JSON.toJSONString(admissionpolicy);
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write(jsonString);
    }
}
