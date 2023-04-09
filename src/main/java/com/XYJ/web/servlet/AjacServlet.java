package com.XYJ.web.servlet;

import com.XYJ.mapper.UserMapper;
import com.XYJ.pojo.User;
import com.XYJ.service.UserService;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet( urlPatterns = "/AjacServlet")
public class AjacServlet extends HttpServlet {
    private UserService userservice = new UserService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        //1. 接收请求参数
        String username = req.getParameter("username");
        System.out.println(username);
////        响应数据
        System.out.println("111");
//        resp.getWriter().write("hello");

//        调用UserService的selectAll()方法，返回List<User>
        List<User> users = userservice.selectAll();
        for (User s :
                users) {
            if (("name").equals(s)) {
                System.out.println(s);
            }
        }

//        将集合转换为JSON数据 序列化
        String jsonString = JSON.toJSONString(users);
        System.out.println(jsonString);

//        响应数据 发送给客户端
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write(jsonString);

//        return username;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
