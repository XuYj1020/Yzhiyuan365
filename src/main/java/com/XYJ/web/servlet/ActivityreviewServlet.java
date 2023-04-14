package com.XYJ.web.servlet;

import com.XYJ.service.ActivityreviewService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/activityreview/*")
public class ActivityreviewServlet extends BaseServlet{
    ActivityreviewService activityreviewService = new ActivityreviewService();

    public void updateActivityreviewAuditstatusid(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String auditid = req.getParameter("auditid");
        activityreviewService.updateActivityreviewAuditstatusid(auditid);
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write("success");
    }
}
