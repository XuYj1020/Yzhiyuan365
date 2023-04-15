package com.XYJ.web.servlet;

import com.XYJ.pojo.*;
import com.XYJ.service.AapplicationService;
import com.XYJ.service.ActivityService;
import com.XYJ.service.AleaveService;
import com.XYJ.service.LeavereviewService;
import com.XYJ.util.IdAutoCreateUtils;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Map;

@WebServlet(urlPatterns = "/leavereview/*")
public class LeavereviewServlet extends BaseServlet{
    private LeavereviewService leavereviewService = new LeavereviewService();

    public void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        BufferedReader bufferedReader = req.getReader();
        String params = bufferedReader.readLine();
        Leavereview leavereview = JSON.parseObject(params,Leavereview.class);
        leavereviewService.update(leavereview);
        Map mapTypes = JSON.parseObject(params);
        String auditstatusid =  (String)mapTypes.get("auditstatusid");
        String statusid = auditstatusid;
        mapTypes.put("statusid",statusid);
        String jsonString = JSON.toJSONString(mapTypes);
        Aleave aleave = JSON.parseObject(jsonString,Aleave.class);
        AleaveService aleaveService = new AleaveService();
        aleaveService.update(aleave);


        if(auditstatusid.equals("2")){
//            修改报名状态
            String applicationid = (String)mapTypes.get("applicationid");
            AapplicationService aapplicationService = new AapplicationService();
            aapplicationService.updateApplicationstatusid3(applicationid);
        }
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write("success");
    }
}
