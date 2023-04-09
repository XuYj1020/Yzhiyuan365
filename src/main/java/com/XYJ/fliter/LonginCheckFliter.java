package com.XYJ.fliter;

import com.XYJ.pojo.Result;
import com.XYJ.util.CCTokenUtil;
import com.alibaba.fastjson.JSON;
import com.mysql.cj.util.StringUtils;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;

//暂时不用了
//@WebFilter("/*")
public class LonginCheckFliter implements Filter{

//    初始化方法，调用一次
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

//    拦截到请求后调用，调用多次
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        //1. 放行前，对 request数据进行处理
        System.out.println("1.FilterDemo...");
////放行
//        filterChain.doFilter(servletRequest,servletResponse);
////2. 放行后，对Response 数据进行处理
//        System.out.println("3.FilterDemo...");


//       1.获取请求url
//        1.1对servletRequest，servletResponse强制转换成HttpServletRequest
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
//        1.2获取url
        String url = request.getRequestURI().toString();

        String[] urls = {"/vlongin","/js/","/element-ui/","/element-china-area-data/","/selectByPhonePass"};
//       2.判断请求url中是否包含上面的地址 如果是则表示为登录，应该放行
        for(String u : urls){
            if(url.contains(u)){
                filterChain.doFilter(servletRequest,servletResponse);
                System.out.println("我直接放行");
                return;
            }
        }


//       3.获取请求头中的token
        String token = request.getHeader("vtoken");

//        4.判断token是否为空，如果是则说明未登录，返回错误信息
        if(token == null||token.isEmpty()){
            Result error = Result.error("NOT_LOGIN");
            System.out.println("token是空的");
            String errorinfo = JSON.toJSONString(error);
            response.getWriter().write(errorinfo);
            return;
        }
//        5.校验token是否被篡改，如果被篡改则返回错误信息，如果校验通过则放行

        try{
            CCTokenUtil.CheckToken(token);
        }catch (Exception e){
            e.printStackTrace();
            Result error = Result.error("NOT_LOGIN");
            String errorinfo = JSON.toJSONString(error);
            System.out.println("token是错的");
            response.getWriter().write(errorinfo);
            return;
        }

        //6.放行。
        filterChain.doFilter(request, response);
    }


//    销毁方法，调用一次
    @Override
    public void destroy() {

    }

}
