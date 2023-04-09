package com.XYJ.web.servlet;

import com.XYJ.pojo.Omembers;
import com.XYJ.service.AleaderService;
import com.XYJ.service.OmembersService;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/Omembers/*")
public class OmembersServlet extends BaseServlet{
    OmembersService omembersservice = new OmembersService();
    public void selectByOVid(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
//        接收用户id和组织id
        BufferedReader ac = req.getReader();
        String params = ac.readLine();//获取json字符串
        Omembers omembers = JSON.parseObject(params,Omembers.class);
//          2. 调用service
       List<Omembers> omembers1 =  omembersservice.selectByOVid(omembers);
        //3. 返回数据
        String jsonString = JSON.toJSONString(omembers1);
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write(jsonString);
    }

}
