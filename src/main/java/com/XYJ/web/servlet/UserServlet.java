package com.XYJ.web.servlet;

import com.XYJ.pojo.Organization;
import com.XYJ.pojo.User;
import com.XYJ.service.UserService;
import com.XYJ.util.CCTokenUtil;
import com.XYJ.util.IdAutoCreateUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import static com.alibaba.fastjson.JSONPath.keySet;
import static java.lang.Character.getType;

@WebServlet( urlPatterns = "/user/*")
public class UserServlet extends BaseServlet{
    private UserService userservice = new UserService();
    public void SelectAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("user SelectAll......");
//        // 1. 接收请求参数
//        String username = req.getParameter("username");
//        System.out.println(username);
////        响应数据
        System.out.println("111");
//        resp.getWriter().write("hello");
//        调用UserService的selectAll()方法，返回List<User>
        List<User> users = userservice.selectAll();
//        将集合转换为JSON数据 序列化
        String jsonString = JSON.toJSONString(users);
        System.out.println(jsonString);
//        响应数据 发送给客户端
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write(jsonString);
    }

//    新增、注册
    public void Insert(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
//        验证码信息
//        String checkCode = null;
//        HttpSession session = req.getSession();
//        if(session != null){
//            checkCode= (String) session.getAttribute("checkCode");
//        }
//        String ucheckCode = req.getParameter("ucheckCode");
//        System.out.println("ucheckCode:"+ucheckCode);
//        System.out.println("checkCode:"+checkCode);
//        if(ucheckCode.equalsIgnoreCase(checkCode)){
//            resp.getWriter().write("success");
//        }else {
//            resp.getWriter().write("错误");
//            return;
//        }

//        接收用户注册信息数据
        BufferedReader us = req.getReader();
        String params = us.readLine();//获取json字符串
        System.out.println("params:"+params);


////        测试
//        String idnumer = null;
////        三联级获取的地址
//        Map selectedOptions = null;
//        Map mapTypes = JSON.parseObject(params);
//        System.out.println(" mapTypes:"+ mapTypes);
//        for (Object obj : mapTypes.keySet()) {
////            if(obj.equals("idnumber")) {
////                idnumer = (String) mapTypes.get(obj);
////                System.out.println(idnumer);
////                break;
////            }
//            System.out.println("key为：" + obj + "值为：" + mapTypes.get(obj));
//        }
////        for (Object obj : mapTypes.keySet()) {
////            if(obj.equals("selectedOptions")) {
////                selectedOptions = (Map) mapTypes.get(obj);
////                System.out.println("我在IdAutoCreateUtils类"+selectedOptions);
////                break;
////            }
////        }
//        System.out.println("我在IdAutoCreateUtils类"+selectedOptions);
//        System.out.println("jies ");


        //转为User对象
//        User user = JSON.parseObject(params, User.class);
//        System.out.println("-------------------------------");
//        Map maps = (Map)JSON.parse(params);
//        System.out.println("这个是用JSON类来解析JSON字符串");
//        for (Object map : maps.entrySet()){
//            System.out.println(((Map.Entry)map).getKey()+"     " + ((Map.Entry)map).getValue());
//            if(((Map.Entry)map).getKey().equals("idnumber")){
//                System.out.println(((Map.Entry)map).getValue());
//                break;
//            }
//        }
//        System.out.println("-------------------------------");
//        Map mapTypes = JSON.parseObject(params);
//        System.out.println(mapTypes);
//        System.out.println("这个是用JSON类的parseObject来解析JSON字符串!!!");
//        mapTypes.put("pictureaddress","123654789");
//        for (Object obj : mapTypes.keySet()){
//            System.out.println("key为："+obj+"值为："+mapTypes.get(obj));
////            if(obj.equals("idnumber")){
////                System.out.println(mapTypes.get(obj));
////                break;
////            }
//        }
//        System.out.println("我要去IdAutoCreateUtils了。。。。");

//        调用自动生成ID的工具生成用户ID
        User user=IdAutoCreateUtils.IDnumber(params);

//        System.out.println("我回来了："+user);

        System.out.println("Insert...");
//        System.out.println(users);
        System.out.println(user);
        //2. 调用service添加
        userservice.insert(user);

        //3. 响应成功的标识
        resp.getWriter().write("success");

    }

//    登录 只判断账号是否存在
    public void Login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
//        接收账号密码
        BufferedReader us = req.getReader();
        String params = us.readLine();//获取json字符串
        System.out.println("params:"+params);
//        转换格式
        User user = JSON.parseObject(params, User.class);
//        调用方法
        System.out.println(user);
        Integer a = userservice.Login(user);

//        System.out.println(a);

//        返回数据
        resp.setContentType("text/json;charset=utf-8");
//        resp.getWriter().write("false");
        if(a>0){
            resp.getWriter().write("true");
        }else{
            resp.getWriter().write("false");
        }


    }

//    手机号是否被占用
    public void selectByPhone(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
//        接收账号密码
        BufferedReader us = req.getReader();
        String params = us.readLine();//获取json字符串
        System.out.println("params:"+params);
//        转换格式
        String phone = JSON.parseObject(params, String.class);
//        调用方法
        System.out.println(phone);
        Integer a = userservice.selectByPhone(phone);
        System.out.println(a);
//        System.out.println(getType(a));

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

//    身份证号是否被占用
    public void selectByIdnumber(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
//        接收账号密码
        BufferedReader us = req.getReader();
        String params = us.readLine();//获取json字符串
/*        System.out.println("params:"+params);
//        转换格式
        String idnumber = JSON.parseObject(params, String.class);

 */
//        调用方法
        System.out.println(params);
        Integer a = userservice.selectByIdnumber(params);
        System.out.println(a);
//        System.out.println(getType(a));

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

    public void selectByPhonePass(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
//        接收账号密码
        BufferedReader us = req.getReader();
        String params = us.readLine();//获取json字符串
        System.out.println("params:"+params);
//        转换格式
        User user = JSON.parseObject(params, User.class);
//        调用方法  查询是否有这个账号
        System.out.println(user);
        List<User> users = userservice.selectByPhonePass(user);

//        System.out.println(a);
//        将集合转换为JSON数据 序列化
        String jsonString = JSON.toJSONString(users);
//        响应数据 发送给客户端
        resp.setContentType("text/json;charset=utf-8");
////        resp.getWriter().write("false");
////        如果users非空则表示账号存在且账号密码正确
//        if(!users.isEmpty()){
//            resp.getWriter().write(jsonString);
//        }else{
//            resp.getWriter().write("false");
//        }

//        传递token的代码
        if(!users.isEmpty()){
            String tokenstring = CCTokenUtil.CreateVToken(jsonString);
            userservice.updateLastlogintime(user);
            System.out.println(tokenstring);
            resp.getWriter().write(tokenstring);
        }else{
            resp.getWriter().write("false");
        }
    }

    public void selectByVIDjoinOID(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
//        组织id
        BufferedReader us = req.getReader();
        String params = us.readLine();//获取json字符串
//        调用方法
        System.out.println(params);
        List<User> users = userservice.selectByVIDjoinOID(params);
        System.out.println(users);
//        System.out.println(getType(a));

//        返回数据
        String jsonString = JSON.toJSONString(users);
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write(jsonString);

    }

    public void selectByjoinAID(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException {
        req.setCharacterEncoding("UTF-8");
        String activityid = req.getParameter("activityid");
        System.out.println(activityid);
        List<User> users = userservice.selectByjoinAID(activityid);
        String jsonString = JSON.toJSONString(users);
        resp.setContentType("text/json;charset=utf-8");
//        传递组织信息
        resp.getWriter().write(jsonString);
    }

    public void selectByVid(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException {
        req.setCharacterEncoding("UTF-8");
        String volunteerid = req.getParameter("vid");
        List<User> users = userservice.selectByVid(volunteerid);
        resp.setContentType("text/json;charset=utf-8");
        String jsonString = JSON.toJSONString(users);
        resp.getWriter().write(jsonString);
    }

    public void updateVinfo(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException {
        req.setCharacterEncoding("UTF-8");
        BufferedReader bufferedReader = req.getReader();
        String param = bufferedReader.readLine();
        User user = JSON.parseObject(param,User.class);
        userservice.updateVinfo(user);
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write("success");
    }
}
