package com.XYJ.web.servlet;

import com.XYJ.pojo.Areas;
import com.XYJ.pojo.User;
import com.XYJ.service.AreaService;
import com.XYJ.service.UserService;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet( urlPatterns = "/Area/*")
public class AreasServlet extends BaseServlet{
    private AreaService areaservice = new AreaService();

    /*
    //老代码
    public void SelectProvince(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("SelectProvince......");
        List<Areas> areas = areaservice.SelectProvince();
        String jsonString = JSON.toJSONString(areas);
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write(jsonString);
    }

    public void SelectadressByAreaID(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String AreaID = req.getParameter("district");

        List<Areas> areas = areaservice.SelectadressByAreaID(AreaID);
        String jsonString = JSON.toJSONString(areas);
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write(jsonString);
    }

     */
//新代码，通过区级行政区划找到省市区
    public void SelectadressByAreaID(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String AreaID = req.getParameter("district");

        String areas = areaservice.SelectadressByAreaID(AreaID);
        String jsonString = JSON.toJSONString(areas);
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write(jsonString);
    }
}
