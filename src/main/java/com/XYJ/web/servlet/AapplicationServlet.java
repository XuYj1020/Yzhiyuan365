package com.XYJ.web.servlet;

import com.XYJ.pojo.Aapplication;
import com.XYJ.service.AapplicationService;
import com.XYJ.util.IdAutoCreateUtils;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/aapplication/*")
public class AapplicationServlet extends BaseServlet{
   private AapplicationService aapplicationservice = new AapplicationService();

   public void insert(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       req.setCharacterEncoding("UTF-8");
//        接收用户报名信息数据
       BufferedReader us = req.getReader();
       String params = us.readLine();//获取json字符串

       Aapplication aapplication = IdAutoCreateUtils.applicationid(params);

//       调用方法添加
       aapplicationservice.insert(aapplication);
       resp.getWriter().write("success");

   }

   public void selectByVAID(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       req.setCharacterEncoding("UTF-8");
//        接收用户报名信息数据
       BufferedReader us = req.getReader();
       String params = us.readLine();//获取json字符串

       Aapplication aapplication = JSON.parseObject(params,Aapplication.class);
       List<Aapplication> application = aapplicationservice.selectByVAID(aapplication);
//        返回数据
       resp.setContentType("text/json;charset=utf-8");
       //        将集合转换为JSON数据 序列化
       String jsonString = JSON.toJSONString(application);
       resp.getWriter().write(jsonString);
   }


}
