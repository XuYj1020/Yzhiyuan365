package com.XYJ.web.servlet;

import com.XYJ.pojo.*;
import com.XYJ.service.*;
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

@WebServlet( urlPatterns = "/Activity/*")
public class ActivityServlet extends BaseServlet{
    ActivityService activityservice = new ActivityService();
    public void insert(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        //        接收用户注册信息数据
        BufferedReader ac = req.getReader();
        String params = ac.readLine();//获取json字符串
        //        调用自动生成ID的工具生成用户ID  前端生成
//        Activity activity= IdAutoCreateUtils.activityid(params);

        //        转换格式
        Activity activity = JSON.parseObject(params, Activity.class);
        System.out.println(activity);
        //2. 调用service添加
        activityservice.insert(activity);
        //3. 响应成功的标识
        resp.getWriter().write("success");
    }



    public void selectByAcstyleidAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
//        调用activityservice的selectByAcstyleidAll()方法，返回List<Activity>
        List<Activity> activitys = activityservice.selectByAcstyleidAll();
//        将集合转换为JSON数据 序列化
        String jsonString = JSON.toJSONString(activitys);
        System.out.println(jsonString);
//        响应数据 发送给客户端
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write(jsonString);
    }

    public void selectAcstylelimit3(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        BufferedReader bufferedReader = req.getReader();
        String params = bufferedReader.readLine();
        Activity activity = JSON.parseObject(params,Activity.class);

        List<Activity> activitys = activityservice.selectAcstylelimit3(activity);
//        将集合转换为JSON数据 序列化
        String jsonString = JSON.toJSONString(activitys);
        System.out.println(jsonString);
//        响应数据 发送给客户端
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write(jsonString);
    }

    public void  selectByAcstyleid(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
 //        接收Acstyleid
        BufferedReader us = req.getReader();
        String params = us.readLine();//获取json字符串
//        转换格式
        int acstyleid = JSON.parseObject(params, int.class);
//        调用方法
        List<Activity> activitys = activityservice.selectByAcstyleid(acstyleid);
//        返回数据
        resp.setContentType("text/json;charset=utf-8");
        String jsonString = JSON.toJSONString(activitys);
        resp.getWriter().write(jsonString);
    }

    public void selectByAcstyleidjoin(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        //        接收Acstyleid
        BufferedReader us = req.getReader();
        String params = us.readLine();//获取json字符串
//        转换格式
        String activity = JSON.parseObject(params, String.class);
        String activityid = req.getParameter("activityid");
//        调用方法
        List<Activity> activitys = activityservice.selectByAcstyleidjoin(activityid);
//        返回数据
        resp.setContentType("text/json;charset=utf-8");
        String jsonString = JSON.toJSONString(activitys);
        resp.getWriter().write(jsonString);
    }

    public void selectActivityV(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        BufferedReader us = req.getReader();
        String params = us.readLine();
        Activity activity = JSON.parseObject(params,Activity.class);
        List<Activity> activities = activityservice.selectActivityV(activity);
        resp.setContentType("text/json;charset=utf-8");
        String jsonString = JSON.toJSONString(activities);
        resp.getWriter().write(jsonString);
    }

    public void selectActivityVFY(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        BufferedReader us = req.getReader();
        String params = us.readLine();
        String begin = req.getParameter("begin");
        int currentpage = Integer.parseInt(begin);
        String size = req.getParameter("size");
        int pagesize = Integer.parseInt(size);
        Activity activity = JSON.parseObject(params,Activity.class);
        PageFY<Activity> activities = activityservice.selectActivityVFY(currentpage,pagesize,activity);
        resp.setContentType("text/json;charset=utf-8");
        String jsonString = JSON.toJSONString(activities);
        resp.getWriter().write(jsonString);
    }

    public void selectActivityBYVIDFY(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        BufferedReader us = req.getReader();
        String params = us.readLine();
        String begin = req.getParameter("begin");
        int currentpage = Integer.parseInt(begin);
        System.out.println(currentpage);
        String size = req.getParameter("size");
        int pagesize = Integer.parseInt(size);
        System.out.println(pagesize);
        Activity activity = JSON.parseObject(params,Activity.class);
        System.out.println(activity);
        PageFY<Activity> activities = activityservice.selectActivityBYVIDFY(currentpage,pagesize,activity);
        System.out.println(activities);
        resp.setContentType("text/json;charset=utf-8");
        String jsonString = JSON.toJSONString(activities);
        resp.getWriter().write(jsonString);
    }

    public void selectActivityAID(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String activityid = req.getParameter("activityid");
//        调用方法
        List<Activity> activitys = activityservice.selectActivityAID(activityid);
//        返回数据
        resp.setContentType("text/json;charset=utf-8");
        String jsonString = JSON.toJSONString(activitys);
        resp.getWriter().write(jsonString);
    }

    public void selectActivityBYVIDFYSQ(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        BufferedReader us = req.getReader();
        String params = us.readLine();
        String begin = req.getParameter("begin");
        int currentpage = Integer.parseInt(begin);
        System.out.println(currentpage);
        String size = req.getParameter("size");
        int pagesize = Integer.parseInt(size);
        System.out.println(pagesize);
        Activity activity = JSON.parseObject(params,Activity.class);
        System.out.println(activity);
        PageFY<Activity> activities = activityservice.selectActivityBYVIDFYSQ(currentpage,pagesize,activity);
        System.out.println(activities);
        resp.setContentType("text/json;charset=utf-8");
        String jsonString = JSON.toJSONString(activities);
        resp.getWriter().write(jsonString);
    }

    public void selectActivityBYOIDFYSQ(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        BufferedReader us = req.getReader();
        String params = us.readLine();
        String begin = req.getParameter("begin");
        int currentpage = Integer.parseInt(begin);
        System.out.println(currentpage);
        String size = req.getParameter("size");
        int pagesize = Integer.parseInt(size);
        System.out.println(pagesize);
        Activity activity = JSON.parseObject(params,Activity.class);
        System.out.println(activity);
        PageFY<Activity> activities = activityservice.selectActivityBYOIDFYSQ(currentpage,pagesize,activity);
        System.out.println(activities);
        resp.setContentType("text/json;charset=utf-8");
        String jsonString = JSON.toJSONString(activities);
        resp.getWriter().write(jsonString);
    }

    public void updateActivityActivestatusid(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String activityid = req.getParameter("activityid");
        activityservice.updateActivityActivestatusid(activityid);
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write("success");
    }

    public void updateActivityActivestatusid71(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        BufferedReader bufferedReader = req.getReader();
        String params = bufferedReader.readLine();
        Activity activity = JSON.parseObject(params,Activity.class);
        activityservice.updateActivityActivestatusid71(activity);
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write("success");
    }

//    public void updateActivityActivestatusid4(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.setCharacterEncoding("UTF-8");
//        BufferedReader bufferedReader = req.getReader();
//        String params = bufferedReader.readLine();
//        Activity activity = JSON.parseObject(params,Activity.class);
//        User user = JSON.parseObject(params,User.class);
////      1根据传入的 applicationstatusid 判断是否已签到 是否为4  已签到调用 yqs  未签到调用wqd  完成时长记录新增
//        Map mapTypes = JSON.parseObject(params);
//        int applicationstatusid = (int)mapTypes.get("applicationstatusid");
//
//        String applicationstatusids = String.valueOf(applicationstatusid);
//        int creditss = (int)mapTypes.get("credit");
//        String credit = String.valueOf(creditss);
//        if(applicationstatusids.equals("4")){
////            调用方法获取志愿者ID数组
//            Aapplication aapplication = JSON.parseObject(params,Aapplication.class);
//            AapplicationService aapplicationService = new AapplicationService();
//            String[] volunteerids= aapplicationService.selectVID(aapplication);
//            System.out.println("--------------------------");
//            System.out.println(applicationstatusids);
//            System.out.println("--------------------------");
//            for (int i = 0; i < volunteerids.length; i++) {
////                System.out.println(volunteerids[i] + " ");
//                mapTypes.put("volunteerid",volunteerids[i]);
//                Distribute distribute = IdAutoCreateUtils.distributerecordid(mapTypes);
//                DistributeService distributeService = new DistributeService();
//                distributeService.insertyqd(distribute);
//                String jsonString = JSON.toJSONString(mapTypes);
//                Credits credits = JSON.parseObject(jsonString,Credits.class);
//                CreditsService creditsService = new CreditsService();
//                creditsService.insert(credits);
//                System.out.println("--------------------------");
//                System.out.println(distribute);
//                System.out.println("--------------------------");
//            }
//            UserService userService = new UserService();
//            userService.updatehourse(activity);
//            userService.updateCreditjia(activity);
//        } else if (applicationstatusids.equals("3")) {
//            Aapplication aapplication = JSON.parseObject(params,Aapplication.class);
//            AapplicationService aapplicationService = new AapplicationService();
//            String[] volunteerids= aapplicationService.selectVID(aapplication);
//            for (int i = 0; i < volunteerids.length; i++) {
////            System.out.println(volunteerids[i] + " ");
//                mapTypes.put("volunteerid", volunteerids[i]);
//                Distribute distribute = IdAutoCreateUtils.distributerecordid(mapTypes);
//                DistributeService distributeService = new DistributeService();
//                distributeService.insertwqd(distribute);
//                String jsonString = JSON.toJSONString(mapTypes);
//                Credits credits = JSON.parseObject(jsonString,Credits.class);
//                CreditsService creditsService = new CreditsService();
//                creditsService.insert(credits);
//
//            }
//
//        } else{
//            Aapplication aapplication = JSON.parseObject(params,Aapplication.class);
//            AapplicationService aapplicationService = new AapplicationService();
//            String[] volunteerids= aapplicationService.selectVID(aapplication);
//            for (int i = 0; i < volunteerids.length; i++) {
////            System.out.println(volunteerids[i] + " ");
//                mapTypes.put("volunteerid",volunteerids[i]);
//                Distribute distribute = IdAutoCreateUtils.distributerecordid(mapTypes);
//                DistributeService distributeService = new DistributeService();
//                distributeService.insertwqd(distribute);
//                String jsonString = JSON.toJSONString(mapTypes);
//                Credits credits = JSON.parseObject(jsonString,Credits.class);
//                CreditsService creditsService = new CreditsService();
//                creditsService.insert(credits);
//            }
//            UserService userService = new UserService();
//            userService.updateCreditjian(activity);
//        }
//
//        activityservice.updateActivityActivestatusid4(activity);
////        activityservice.updateActivityActivestatusid4(ac);
//        resp.setContentType("text/json;charset=utf-8");
//        resp.getWriter().write("success");
//    }

//    新
    public void updateActivityActivestatusid4N(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        BufferedReader bufferedReader = req.getReader();
        String params = bufferedReader.readLine();
        Activity activity = JSON.parseObject(params,Activity.class);
        User user = JSON.parseObject(params,User.class);
//      1根据传入的 applicationstatusid 判断是否已签到 是否为4  已签到调用 yqs  未签到调用wqd  完成时长记录新增
        Map mapTypes = JSON.parseObject(params);
        int applicationstatusid = (int)mapTypes.get("applicationstatusid");

        String applicationstatusids = String.valueOf(applicationstatusid);
//        拿到信用分 前台传入
        int creditss = (int)mapTypes.get("credit");
        String credit = String.valueOf(creditss);
        if(applicationstatusids.equals("4")){
//            调用方法获取报名编号ID数组
            Aapplication aapplication = JSON.parseObject(params,Aapplication.class);
            AapplicationService aapplicationService = new AapplicationService();
//            得到报名编号ID数组
            String[] applicationids= aapplicationService.selectVIDN(aapplication);
            System.out.println("wo dayin");
            System.out.println("--------------------------");
            System.out.println(applicationstatusids);
            System.out.println("--------------------------");
            System.out.println(applicationstatusids);
//            遍历 取出申请编号，把编号放到Distribute中
            for (int i = 0; i < applicationids.length; i++) {
                System.out.println(applicationids[i] + "我在循环");
                mapTypes.put("applicationid",applicationids[i]);
//                Distribute distribute = IdAutoCreateUtils.distributerecordid(mapTypes);
                DistributeService distributeService = new DistributeService();
                String jsonString1 = JSON.toJSONString(mapTypes);
                Distribute distribute = JSON.parseObject(jsonString1,Distribute.class);
//                插入志愿时长
                distributeService.insertyqdN(distribute);
                System.out.println(applicationids[i] + "插入志愿时长");
                String jsonString = JSON.toJSONString(mapTypes);
                //                插入信用分
                Credits credits = JSON.parseObject(jsonString,Credits.class);
                CreditsService creditsService = new CreditsService();
                creditsService.insertN(credits);
                System.out.println(applicationids[i] + " 插入信用分");
                System.out.println("--------------------------");
                System.out.println(distribute);
                System.out.println("--------------------------");
            }
            UserService userService = new UserService();
            //                增加志愿时长
            userService.updatehourse(activity);
            //                增加信用分
            userService.updateCreditjia(activity);
        } else if (applicationstatusids.equals("3")) {
            Aapplication aapplication = JSON.parseObject(params,Aapplication.class);
            AapplicationService aapplicationService = new AapplicationService();
            String[] applicationids= aapplicationService.selectVIDN(aapplication);
            for (int i = 0; i < applicationids.length; i++) {
//            System.out.println(volunteerids[i] + " ");
                mapTypes.put("applicationid", applicationids[i]);
//                Distribute distribute = IdAutoCreateUtils.distributerecordid(mapTypes);
                String jsonString1 = JSON.toJSONString(mapTypes);
                Distribute distribute = JSON.parseObject(jsonString1,Distribute.class);
                DistributeService distributeService = new DistributeService();
                distributeService.insertwqdN(distribute);
                String jsonString = JSON.toJSONString(mapTypes);
                Credits credits = JSON.parseObject(jsonString,Credits.class);
                CreditsService creditsService = new CreditsService();
                creditsService.insertN(credits);

            }

        } else{
            Aapplication aapplication = JSON.parseObject(params,Aapplication.class);
            AapplicationService aapplicationService = new AapplicationService();
            String[] applicationids= aapplicationService.selectVIDN(aapplication);
            for (int i = 0; i < applicationids.length; i++) {
//            System.out.println(volunteerids[i] + " ");
                mapTypes.put("applicationid",applicationids[i]);
//                Distribute distribute = IdAutoCreateUtils.distributerecordid(mapTypes);
                String jsonString1 = JSON.toJSONString(mapTypes);
                Distribute distribute = JSON.parseObject(jsonString1,Distribute.class);
                DistributeService distributeService = new DistributeService();
                distributeService.insertwqdN(distribute);
                String jsonString = JSON.toJSONString(mapTypes);
                Credits credits = JSON.parseObject(jsonString,Credits.class);
                CreditsService creditsService = new CreditsService();
                creditsService.insertN(credits);
            }
            UserService userService = new UserService();
            userService.updateCreditjian(activity);
        }

        activityservice.updateActivityActivestatusid4(activity);
//        activityservice.updateActivityActivestatusid4(ac);
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write("success");
    }

    public void updateAinfo(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        BufferedReader bufferedReader = req.getReader();
        String params = bufferedReader.readLine();
        Activity activity = JSON.parseObject(params,Activity.class);
        System.out.println("1");
        Activityreview activityreview = IdAutoCreateUtils.activityreviewauditid(params);
        System.out.println("2");
        ActivityreviewService activityreviewService = new ActivityreviewService();
        activityreviewService.insert(activityreview);
        System.out.println(activity);
        activityservice.updateAinfo(activity);
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write("success");
    }

    public void updateAinfoshz(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        BufferedReader bufferedReader = req.getReader();
        String params = bufferedReader.readLine();
        Activity activity = JSON.parseObject(params,Activity.class);
        activityservice.updateAinfo(activity);
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write("success");
    }

    public void selectCOUNTbyacstyleecharts(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        List<Activity> activity = activityservice.selectCOUNTbyacstyleecharts();
        resp.setContentType("text/json;charset=utf-8");
        String jsonString = JSON.toJSONString(activity);
        resp.getWriter().write(jsonString);
    }

    public void selectcountbyacstatusecharts(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        List<echars> echars = activityservice.selectcountbyacstatusecharts();
        resp.setContentType("text/json;charset=utf-8");
        String jsonString = JSON.toJSONString(echars);
        resp.getWriter().write(jsonString);
    }

    public void selectActivestatuscounts(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        BufferedReader bufferedReader = req.getReader();
        String params = bufferedReader.readLine();
        Activity activity = JSON.parseObject(params,Activity.class);
        List<echars> echars = activityservice.selectActivestatuscounts(activity);
        resp.setContentType("text/json;charset=utf-8");
        String jsonString = JSON.toJSONString(echars);
        resp.getWriter().write(jsonString);
    }

    public void selectActivestatuscounts2(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        BufferedReader bufferedReader = req.getReader();
        String params = bufferedReader.readLine();
        Activity activity = JSON.parseObject(params,Activity.class);
        List<echars> echars = activityservice.selectActivestatuscounts2(activity);
        List<echars> echars3 = activityservice.selectActivestatuscounts3(activity);
        System.out.println(echars3);
        String echars4 = JSON.toJSONString(echars3);

        echars4 = echars4.substring(1,echars4.length()-1);
        System.out.println(echars4);
        com.XYJ.pojo.echars echars1 = JSON.parseObject(echars4, com.XYJ.pojo.echars.class);
        echars.add(echars1);
System.out.println(echars);
        resp.setContentType("text/json;charset=utf-8");
        String jsonString = JSON.toJSONString(echars);

        resp.getWriter().write(jsonString);
    }


    public void selectcreditsByVidFY(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        BufferedReader us = req.getReader();
        String params = us.readLine();
        String begin = req.getParameter("begin");
        int currentpage = Integer.parseInt(begin);
        System.out.println(currentpage);
        String size = req.getParameter("size");
        int pagesize = Integer.parseInt(size);
        System.out.println(pagesize);
        Credits credits = JSON.parseObject(params,Credits.class);
        System.out.println(credits);
        PageFY<Activity> activities = activityservice.selectcreditsByVidFY(currentpage,pagesize,credits);
        System.out.println(activities);
        resp.setContentType("text/json;charset=utf-8");
        String jsonString = JSON.toJSONString(activities);
        resp.getWriter().write(jsonString);
    }

    public void selectdistributeByVidFY(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        BufferedReader us = req.getReader();
        String params = us.readLine();
        String begin = req.getParameter("begin");
        int currentpage = Integer.parseInt(begin);
        System.out.println(currentpage);
        String size = req.getParameter("size");
        int pagesize = Integer.parseInt(size);
        System.out.println(pagesize);
        Distribute distribute = JSON.parseObject(params,Distribute.class);
        System.out.println(distribute);
        PageFY<Activity> activities = activityservice.selectdistributeByVidFY(currentpage,pagesize,distribute);
        System.out.println(activities);
        resp.setContentType("text/json;charset=utf-8");
        String jsonString = JSON.toJSONString(activities);
        resp.getWriter().write(jsonString);
    }
}
