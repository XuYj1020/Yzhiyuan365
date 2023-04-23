package com.XYJ.web.servlet;

import com.XYJ.pojo.Organization;
import com.XYJ.pojo.Organizeaudit;
import com.XYJ.pojo.PageFY;
import com.XYJ.pojo.User;
import com.XYJ.service.OrganizationService;
import com.XYJ.service.OrganizeauditService;
import com.XYJ.util.CCTokenUtil;
import com.XYJ.util.IdAutoCreateUtils;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@WebServlet(urlPatterns = "/organization/*")
public class OrganizationServlet extends BaseServlet{

    private OrganizationService organizationservice = new OrganizationService();
    public void insert(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
//        接收用户注册信息数据
        BufferedReader us = req.getReader();
        System.out.println(us);
        String params = us.readLine();//获取json字符串
        System.out.println(params);
//        调用自动生成ID的工具生成用户ID
        Organization organization= IdAutoCreateUtils.Organizationid(params);
//          2. 调用service添加
        organizationservice.insert(organization);

//          3. 响应成功的标识
        resp.getWriter().write("success");

    }

    public void selectByPhone(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
//        接收账号密码
        BufferedReader us = req.getReader();
        String params = us.readLine();//获取json字符串
//        转换格式
        String phone = JSON.parseObject(params, String.class);
//        调用方法
        Integer a = organizationservice.selectByPhone(phone);
//        返回数据
        resp.setContentType("text/json;charset=utf-8");
//        resp.getWriter().write("false");
        if(a==0){
            resp.getWriter().write("true");
            System.out.println("true");
        }else{
            resp.getWriter().write("false");
            System.out.println("false");
        }
    }


    public void selectuserstatusid(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        String organizationid = req.getParameter("organizationid");
//        调用方法
        Integer a = organizationservice.selectuserstatusid(organizationid);
//        返回数据
        resp.setContentType("text/json;charset=utf-8");
//        resp.getWriter().write("false");
        String jsonString = JSON.toJSONString(a);
        resp.getWriter().write(jsonString);
    }

    public void selectByPhonePass(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException {
        req.setCharacterEncoding("UTF-8");

        BufferedReader us = req.getReader();
        String params = us.readLine();//获取json字符串
        System.out.println("params:"+params);

        Organization organization = JSON.parseObject(params,Organization.class);

        List<Organization> organizations = organizationservice.selectByPhonePass(organization);

        String jsonString = JSON.toJSONString(organizations);

        resp.setContentType("text/json;charset=utf-8");

//        传递token的代码
        if(!organizations.isEmpty()){
            String tokenstring = CCTokenUtil.CreateOToken(jsonString);
            System.out.println(tokenstring);
            resp.getWriter().write(tokenstring);
        }else{
            resp.getWriter().write("false");
        }
    }

//    组织详情页面，通过url方式获取组织id
    public void selectByOID(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException {
        req.setCharacterEncoding("UTF-8");
        String organizationid = req.getParameter("organizationid");
        System.out.println(organizationid);
        List<Organization> organizations = organizationservice.selectByOID(organizationid);
        String jsonString = JSON.toJSONString(organizations);
        resp.setContentType("text/json;charset=utf-8");
//        传递组织信息
        if(!organizations.isEmpty()){
//            拿到的是数组，数组里面有对象，要把[]去掉后，再转成{}map键值对形式
            String organization = jsonString.substring(1,jsonString.length()-1);
            Map organizationinfo = JSON.parseObject(organization);
//            移除密码信息
            organizationinfo.remove("password");
            jsonString = JSON.toJSONString(organizationinfo);
            resp.getWriter().write(jsonString);
            System.out.println(jsonString);
        }else{
            resp.getWriter().write("组织不存在");
        }
    }

    public void selectByOIDAll(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException {
        req.setCharacterEncoding("UTF-8");
        String organizationid = req.getParameter("organizationid");
        System.out.println(organizationid);
        List<Organization> organizations = organizationservice.selectByOIDAll(organizationid);
        String jsonString = JSON.toJSONString(organizations);
        resp.setContentType("text/json;charset=utf-8");
//        传递组织信息
        if(!organizations.isEmpty()){
//            拿到的是数组，数组里面有对象，要把[]去掉后，再转成{}map键值对形式
            String organization = jsonString.substring(1,jsonString.length()-1);
            Map organizationinfo = JSON.parseObject(organization);
//            移除密码信息
//            organizationinfo.remove("password");
            jsonString = JSON.toJSONString(organizationinfo);
            resp.getWriter().write(jsonString);
            System.out.println(jsonString);
        }else{
            resp.getWriter().write("组织不存在");
        }
    }


    //    活动详情页面，活动发布活动的组织信息，全部组织
    public void selectOinfoByOID(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException {
        req.setCharacterEncoding("UTF-8");
        String organizationid = req.getParameter("organizationid");
        System.out.println(organizationid);
        List<Organization> organizations = organizationservice.selectOinfoByOID(organizationid);
        String jsonString = JSON.toJSONString(organizations);
        resp.setContentType("text/json;charset=utf-8");
//        传递组织信息
        resp.getWriter().write(jsonString);
    }

    public void selectOraganizationVFY(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException {
        req.setCharacterEncoding("UTF-8");
        String currentPage = req.getParameter("currentPage");
        String pageSize = req.getParameter("pageSize");
        int begin = Integer.parseInt(currentPage);
        int size = Integer.parseInt(pageSize);
        BufferedReader oinfo = req.getReader();
        String param = oinfo.readLine();
        Organization organization = JSON.parseObject(param,Organization.class);
        PageFY<Organization> organizations = organizationservice.selectOraganizationVFY(begin,size,organization);
        resp.setContentType("text/json;charset=utf-8");
        String jsonString = JSON.toJSONString(organizations);
        resp.getWriter().write(jsonString);
    }


    public void updateOphone(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException {
        req.setCharacterEncoding("UTF-8");
        BufferedReader bufferedReader = req.getReader();
        String param = bufferedReader.readLine();
        Organization organization = JSON.parseObject(param,Organization.class);
        System.out.println(param);
        organizationservice.updateOphone(organization);
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write("success");
    }

    public void updateOpasd(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException {
        req.setCharacterEncoding("UTF-8");
        BufferedReader bufferedReader = req.getReader();
        String param = bufferedReader.readLine();
        Organization organization = JSON.parseObject(param,Organization.class);
        System.out.println(param);
        organizationservice.updateOpasd(organization);
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write("success");
    }

    public void updateOinfo(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException {
        req.setCharacterEncoding("UTF-8");
        BufferedReader bufferedReader = req.getReader();
        String param = bufferedReader.readLine();
        Organization organization = JSON.parseObject(param,Organization.class);
        System.out.println(param);
        organizationservice.updateOinfo(organization);
        OrganizeauditService organizeauditService = new OrganizeauditService();
        organizeauditService.updatexiugai(organization);
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write("success");
    }

    public void selectPassword(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException {
        req.setCharacterEncoding("UTF-8");
        String organizationid = req.getParameter("organizationid");
        System.out.println(organizationid);
        String pasd = organizationservice.selectPassword(organizationid);
        resp.setContentType("text/json;charset=utf-8");
//        传递组织信息
        resp.getWriter().write(pasd);
    }

    public void selectOraganizationAdminFY(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException {
        req.setCharacterEncoding("UTF-8");
        String currentPage = req.getParameter("begin");
        String pageSize = req.getParameter("size");
        System.out.println(pageSize);
        int begin = Integer.parseInt(currentPage);
        System.out.println(begin);
        int size = Integer.parseInt(pageSize);
        BufferedReader oinfo = req.getReader();
        String param = oinfo.readLine();
        Organization organization = JSON.parseObject(param,Organization.class);
        PageFY<Organization> organizations = organizationservice.selectOraganizationAdminFY(begin,size,organization);
        resp.setContentType("text/json;charset=utf-8");
        String jsonString = JSON.toJSONString(organizations);
        resp.getWriter().write(jsonString);
    }


    public void updateuserstatusid(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException {
        req.setCharacterEncoding("UTF-8");
        BufferedReader bufferedReader = req.getReader();
        String param = bufferedReader.readLine();
        Organization organization = JSON.parseObject(param,Organization.class);
        organizationservice.updateuserstatusid(organization);
        Organizeaudit organizeaudit = JSON.parseObject(param,Organizeaudit.class);
        OrganizeauditService organizeauditService = new OrganizeauditService();
        organizeauditService.update(organizeaudit);
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write("success");
    }
}
