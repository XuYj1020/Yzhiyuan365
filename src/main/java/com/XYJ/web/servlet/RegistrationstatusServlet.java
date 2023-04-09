package com.XYJ.web.servlet;

import com.XYJ.pojo.Areas;
import com.XYJ.pojo.Registrationstatus;
import com.XYJ.service.AreaService;
import com.XYJ.service.RegistrationstatusService;
import com.alibaba.fastjson.JSON;
import org.apache.ibatis.session.SqlSessionFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import static com.XYJ.util.SqlSessionFactoryUtils.getSqlSessionFactory;

@WebServlet( urlPatterns = "/Registrationstatus/*")
public class RegistrationstatusServlet extends BaseServlet{
    private RegistrationstatusService registrationstatusservice = new RegistrationstatusService();

    public void selectAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        调用registrationstatusservice.selectAll()方法，返回集合
        List<Registrationstatus> registrationstatus = registrationstatusservice.selectAll();
//        序列号为json格式字符串
        String jsonString = JSON.toJSONString(registrationstatus);
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write(jsonString);
    }
}
