package com.XYJ.web.servlet;

import com.XYJ.pojo.ShenHeShuLiang;
import com.XYJ.service.ShenHeShuLiangService;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/shenheshuliang/*")
public class ShenHeShuLiangServlet extends BaseServlet{

    private ShenHeShuLiangService shenHeShuLiangService = new ShenHeShuLiangService();

    public void selectindexxinx(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        List<ShenHeShuLiang> shenHeShuLiangs = shenHeShuLiangService.selectindexxinx();
        String jsonString = JSON.toJSONString(shenHeShuLiangs);
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write(jsonString);
    }
}
