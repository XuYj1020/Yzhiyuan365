package com.XYJ.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//替换HttpServlet，根据请求最后一段路径进行方法分发
public class BaseServlet extends HttpServlet {

//    1.重写service方法，根据请求最后一段路径进行方法分发
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setHeader("Access-Control-Allow-Origin", "http://127.0.0.1:8848");
//        2.获取请求路径  req.getRequestURI()获取短路径   /Yzhiyuan365/user/selectall
       String uri = req.getRequestURI();
//          2.1获取最后一段路径 方法名
//              2.1.1获取最后一个 / 出现的位置
        int index = uri.lastIndexOf("/");
//              2.1.2得到 selectall
        String methodName = uri.substring(index +1 );
//        3.执行方法
//        3.1获取UserService 字节码对象 class
//        谁调用我(this所在的方法)，我(this)代表谁 即this代表BaseServlet的所有子类   如，UserService 调用 BaseServlet，所以this代表 UserService
        Class<? extends BaseServlet> cls = this.getClass();
//        System.out.println(this.getClass());    //  class com.XYJ.web.servlet.UserServlet
//        System.out.println(cls);                //  class com.XYJ.web.servlet.UserServlet
//        3.2获取方法 method对象    反射
//        getMethod(方法名,参数1,参数2)  同时把UserService里面方法的参数统一成HttpServlet的方法的参数
        try {
            Method method = cls.getMethod(methodName,HttpServletRequest.class,HttpServletResponse.class);
//            public void com.XYJ.web.servlet.UserServlet.SelectAll(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse) throws javax.servlet.ServletException,java.io.IOException
//            System.out.println(method);   //            UserServlet.SelectAll方法
//            System.out.println(this);     //            com.XYJ.web.servlet.UserServlet@397ab3eb
//        3.3执行方法
            method.invoke(this,req,resp);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
