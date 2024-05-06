package com.XYJ.util;

import com.XYJ.pojo.*;
import com.XYJ.service.*;
import com.alibaba.fastjson.JSON;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class IdAutoCreateUtils {
    private static final String YYYY_MM_DD = "yyyyMMdd";

/*    自动生成志愿者ID
      根据身份证前6位 + 注册时间6位 + 时间戳后4位 + 随机数2位
 */

    public static User IDnumber(String params) {
        String idnumer = null;
        String selectedOptions = null;
//        获取传入的json数据，转成map
        Map mapTypes = JSON.parseObject(params);
//        System.out.println("这个是用JSON类的parseObject来解析JSON字符串!!!");
//        mapTypes.put("pictureaddress", "555666666");
//        for (Object obj : mapTypes.keySet()) {
//            System.out.println("我在IdAutoCreateUtils类里面的IDnumber方法");
//            System.out.println("key为：" + obj + "值为：" + mapTypes.get(obj));
//        }

//        循环遍历map获取idnumber的值
//        for (Object obj : mapTypes.keySet()) {
//            if(obj.equals("idnumber")){
//                idnumer = (String) mapTypes.get(obj);
//                System.out.println(idnumer);
//                break;
//            }
//        }
//        循环遍历map获取idnumber的值
        for (Object obj : mapTypes.keySet()) {
            if(obj.equals("idnumber")) {
                idnumer = (String) mapTypes.get(obj);
                System.out.println(idnumer);
            }
//            为了测试三联级的数据能不能通过循环拿到，实际上获取失败了  循环遍历不行，会在循环里面一直允许也不报错，感觉像是死循环，  通过打印 mapTypes 发现 selectedOptions 的值带有[]不知道是不是这个原因
//            if(obj.equals("selectedOptions")) {
//                selectedOptions = (String) mapTypes.get(obj);
//                System.out.println("我在IdAutoCreateUtils类"+selectedOptions);
//            }
        }
//        System.out.println(idnumer);
        String id6 = idnumer.substring(0,6);

//        获取当前年月日  后六位
        SimpleDateFormat yyyyMMdd = new SimpleDateFormat(YYYY_MM_DD);
        String date = yyyyMMdd.format(new Date()).substring(2);

        //获取时间戳后4位
        String timeMillis = String.valueOf(System.currentTimeMillis());
        String fiveNumber = timeMillis.substring(timeMillis.length() - 4);

        //获取随机数后2位
        String tempRandom = String.valueOf(Math.random());
        String suiji = tempRandom.substring(tempRandom.length() - 2);

        String volunteerid = id6 + date +fiveNumber + suiji;
//        把拼接后的volunteerid存到map
        mapTypes.put("volunteerid", volunteerid);

        String jsonString = JSON.toJSONString(mapTypes);

        User user = JSON.parseObject(jsonString, User.class);
        return user;
    }

//    自动生成组织ID
//    根据所在地区的地区码6位 + 随机数2位+ 注册时间4位 + 时间戳后4位  16位
    public static Organization Organizationid(String params){
//          district区级编码
        String district = null;
//          获取传入的json数据，转成map
        Map mapTypes = JSON.parseObject(params);
//          循环遍历map获取district的值
        for (Object obj : mapTypes.keySet()) {
            if (obj.equals("district")) {
                district = (String) mapTypes.get(obj);
//                System.out.println(district);
                break;
            }
        }
//        获取当前年月日  后四位
        SimpleDateFormat yyyyMMdd = new SimpleDateFormat(YYYY_MM_DD);
        String date = yyyyMMdd.format(new Date()).substring(4);

        //获取时间戳后4位
        String timeMillis = String.valueOf(System.currentTimeMillis());
        String fiveNumber = timeMillis.substring(timeMillis.length() - 4);

        //获取随机数后2位
        String tempRandom = String.valueOf(Math.random());
        String suiji = tempRandom.substring(tempRandom.length() - 2);

        String organizationid = district + suiji + date + fiveNumber ;
//        把拼接后的organizationid存到map
        mapTypes.put("organizationid", organizationid);

        String jsonString = JSON.toJSONString(mapTypes);

        Organization organization = JSON.parseObject(jsonString, Organization.class);

        return organization;
    }

    //    自动生成活动ID
//    HD+根据所在地区的地区码6位 + 随机数2位+ 发布时间4位 + 时间戳后4位  16位
    public static Activity activityid(String params){
//          district区级编码
        String district = null;
//          获取传入的json数据，转成map
        Map mapTypes = JSON.parseObject(params);
//          循环遍历map获取district的值
        for (Object obj : mapTypes.keySet()) {
            if (obj.equals("district")) {
                district = (String) mapTypes.get(obj);
//                System.out.println(district);
            }

        }
//        获取当前年月日  后四位
        SimpleDateFormat yyyyMMdd = new SimpleDateFormat(YYYY_MM_DD);
        String date = yyyyMMdd.format(new Date()).substring(4);

        //获取时间戳后4位
        String timeMillis = String.valueOf(System.currentTimeMillis());
        String fiveNumber = timeMillis.substring(timeMillis.length() - 4);

        //获取随机数后2位
        String tempRandom = String.valueOf(Math.random());
        String suiji = tempRandom.substring(tempRandom.length() - 2);

        String activityid ="HD" + district + suiji + date + fiveNumber ;
//        把拼接后的organizationid存到map
        mapTypes.put("activityid", activityid);

        String jsonString = JSON.toJSONString(mapTypes);

        Activity activity = JSON.parseObject(jsonString, Activity.class);

        return activity;
    }


    //    自动生成活动审核ID
//    HDFB+ 发布时间4位 + 时间戳后4位 + 随机数2位 18位
    public static Activityreview activityreviewauditid(String params){
//          获取传入的json数据，转成map
        Map mapTypes = JSON.parseObject(params);
//        获取当前年月日
        SimpleDateFormat yyyyMMdd = new SimpleDateFormat(YYYY_MM_DD);
        String date = yyyyMMdd.format(new Date());

        //获取时间戳后4位
        String timeMillis = String.valueOf(System.currentTimeMillis());
        String fiveNumber = timeMillis.substring(timeMillis.length() - 4);

        //获取随机数后2位
        String tempRandom = String.valueOf(Math.random());
        String suiji = tempRandom.substring(tempRandom.length() - 2);

        String auditid ="HDFB" +date  + fiveNumber  + suiji;
//        把拼接后的organizationid存到map
        mapTypes.put("auditid", auditid);

        String jsonString = JSON.toJSONString(mapTypes);

        Activityreview activityreview = JSON.parseObject(jsonString, Activityreview.class);

        return activityreview;
    }

//    申请加入组织自动生成申请id
    public static Ojoin ojoinid(String params){
//          获取传入的json数据，转成map
        Map mapTypes = JSON.parseObject(params);
//        获取当前年月日  后六位
        SimpleDateFormat yyyyMMdd = new SimpleDateFormat(YYYY_MM_DD);
        String date = yyyyMMdd.format(new Date()).substring(6);

        //获取时间戳后4位
        String timeMillis = String.valueOf(System.currentTimeMillis());
        String fiveNumber = timeMillis.substring(timeMillis.length() - 4);

        //获取随机数后2位
        String tempRandom = String.valueOf(Math.random());
        String suiji = tempRandom.substring(tempRandom.length() - 2);

        String applicationid ="SQJR" +  suiji + date + fiveNumber ;
//        把拼接后的organizationid存到map
        mapTypes.put("applicationid", applicationid);

        String jsonString = JSON.toJSONString(mapTypes);

        Ojoin ojoin = JSON.parseObject(jsonString, Ojoin.class);

        return ojoin;
    }

//    活动报名的报名编号自动生成
    public static Aapplication applicationid(String params){
//        把数据转成map类型
        Map mapTypes = JSON.parseObject(params);
        String activityid = (String) mapTypes.get("activityid");
//        判断原先是否有人报名，该活动下是否有报名id，如果没有则返回0001，如果有则返回最新的报名编号
        AapplicationService app = new AapplicationService();
        String apps = app.applicationid(activityid);
        String applicationid;
//        报名ID规则  原始活动ID + 0001 编号
        if(apps.equals("0001")){
            activityid = activityid.replaceFirst("HD","HDBM");
            applicationid = activityid + apps;
        }else{
//            先把前面的hdbm去掉
            String a = apps.substring(4);
//            把去掉后的数字转成long类型  只取后面15位，因为long最多只支持19位   int溢出，  转换完成后+1
            long num =Long.parseLong(a.substring(a.length()-15))+1;
//            把前面被截掉的拿回来
            String str = a.substring(0,a.length()-15);
//            字符串重新拼接
            applicationid =  "HDBM" + str + num;
        }
//        把生成的applicationid封装进map集合中，然后再传出去
        mapTypes.put("applicationid", applicationid);
        String jsonString = JSON.toJSONString(mapTypes);
        Aapplication aapplication = JSON.parseObject(jsonString,Aapplication.class);
        return aapplication;
    }

//    活动报名审核编号自动生成
public static Applicationreview auditid(String params){
//        把数据转成map类型
    Map mapTypes = JSON.parseObject(params);
    String activityid = (String) mapTypes.get("activityid");
    System.out.println(activityid);
//        判断原先是否有人报名，该活动下是否有审核id，如果没有则返回0001，如果有则返回最新的审核编号
    ApplicationreviewService app = new ApplicationreviewService();
    String apps = app.auditid(activityid);
    String auditid;
//        审核ID规则  原始活动ID + 0001 编号
    if(apps.equals("0001")){
        activityid = activityid.replaceFirst("HD","BMSH");
        auditid = activityid + apps;
        System.out.println(auditid);
    }else{
//            先把前面的BMSH去掉
        String a = apps.substring(4);
//            把去掉后的数字转成long类型  只取后面15位，因为long最多只支持19位   int溢出，  转换完成后+1
        long num =Long.parseLong(a.substring(a.length()-15))+1;
//            把前面被截掉的拿回来
        String str = a.substring(0,a.length()-15);
//            字符串重新拼接
        auditid =  "BMSH" + str + num;
    }
//        把生成的auditid封装进map集合中，然后再传出去
    mapTypes.put("auditid", auditid);
    System.out.println(auditid);
    System.out.println(mapTypes);
    String jsonString = JSON.toJSONString(mapTypes);
    Applicationreview applicationreview = JSON.parseObject(jsonString,Applicationreview.class);
    return applicationreview;
}

    public static Signrecord recordid(String params){
//        把数据转成map类型
        Map mapTypes = JSON.parseObject(params);
        String applicationid = (String) mapTypes.get("applicationid");
//        判断原先是否有人报名，该活动下是否有报名id，如果没有则返回0001，如果有则返回最新的报名编号
        SignrecordService sig = new SignrecordService();
        String sigs = sig.selectByAID(applicationid);
        String recordid;
//        报名ID规则  原始活动ID + 0001 编号
        if(sigs.equals("0001")){
            applicationid = applicationid.replaceFirst("HDBM","HDQD");
            recordid = applicationid + sigs;
        }else{
//            先把前面的hdqd去掉
            String a = sigs.substring(4);
//            把去掉后的数字转成long类型  只取后面15位，因为long最多只支持19位   int溢出，  转换完成后+1
            long num =Long.parseLong(a.substring(a.length()-15))+1;
//            把前面被截掉的拿回来
            String str = a.substring(0,a.length()-15);
//            字符串重新拼接
            recordid =  "HDQD" + str + num;
        }
//        把生成的applicationid封装进map集合中，然后再传出去
        mapTypes.put("recordid", recordid);
        String jsonString = JSON.toJSONString(mapTypes);
        Signrecord signrecord = JSON.parseObject(jsonString,Signrecord.class);
        return signrecord;
    }

    public static Aleave leaveapplicationid(String params){
//        把数据转成map类型
        Map mapTypes = JSON.parseObject(params);
        String applicationid = (String) mapTypes.get("applicationid");
//        判断原先是否有人报名，该活动下是否有报名id，如果没有则返回0001，如果有则返回最新的报名编号
        AleaveService ale = new AleaveService();
        String sigs = ale.selectByAID(applicationid);
        String leaveapplicationid;
//        报名ID规则  原始活动ID + 0001 编号
        if(sigs.equals("0001")){
            applicationid = applicationid.replaceFirst("HDBM","HDQJ");
            leaveapplicationid = applicationid + sigs;
        }else{
//            先把前面的hdqd去掉
            String a = sigs.substring(4);
//            把去掉后的数字转成long类型  只取后面15位，因为long最多只支持19位   int溢出，  转换完成后+1
            long num =Long.parseLong(a.substring(a.length()-15))+1;
//            把前面被截掉的拿回来
            String str = a.substring(0,a.length()-15);
//            字符串重新拼接
            leaveapplicationid =  "HDQJ" + str + num;
        }
//        把生成的applicationid封装进map集合中，然后再传出去
        mapTypes.put("leaveapplicationid", leaveapplicationid);
        String jsonString = JSON.toJSONString(mapTypes);
       Aleave aleave = JSON.parseObject(jsonString,Aleave.class);
        return aleave;
    }

    public static Evaluation evaluationid(String params){
//        把数据转成map类型
        Map mapTypes = JSON.parseObject(params);
        String activityid = (String) mapTypes.get("activityid");
//        判断原先是否有人报名，该活动下是否有审核id，如果没有则返回0001，如果有则返回最新的审核编号
        EvaluationService eva = new EvaluationService();
        String evas = eva.selectByAID(activityid);
        String evaluationid;
//        审核ID规则  原始活动ID + 0001 编号
        if(evas.equals("0001")){
            activityid = activityid.replaceFirst("HD","HDPJ");
            evaluationid = activityid + evas;
            System.out.println(evaluationid);
        }else{
//            先把前面的BMPJ去掉
            String a = evas.substring(4);
//            把去掉后的数字转成long类型  只取后面15位，因为long最多只支持19位   int溢出，  转换完成后+1
            long num =Long.parseLong(a.substring(a.length()-15))+1;
//            把前面被截掉的拿回来
            String str = a.substring(0,a.length()-15);
//            字符串重新拼接
            evaluationid =  "HDPJ" + str + num;
        }
//        把生成的auditid封装进map集合中，然后再传出去
        mapTypes.put("evaluationid", evaluationid);
        System.out.println(evaluationid);
        System.out.println(mapTypes);
        String jsonString = JSON.toJSONString(mapTypes);
        Evaluation evaluation = JSON.parseObject(jsonString,Evaluation.class);
        return evaluation;
    }
    public static Signcode signcode(String params){
        //          获取传入的json数据，转成map
        Map mapTypes = JSON.parseObject(params);
//        获取当前年月日  后六位
        SimpleDateFormat yyyyMMdd = new SimpleDateFormat(YYYY_MM_DD);
        String date = yyyyMMdd.format(new Date()).substring(6);

        //获取时间戳后4位
        String timeMillis = String.valueOf(System.currentTimeMillis());
        String fiveNumber = timeMillis.substring(timeMillis.length() - 4);

        //获取随机数后2位
        String tempRandom = String.valueOf(Math.random());
        String suiji = tempRandom.substring(tempRandom.length() - 2);

        String signinid = date + suiji +  fiveNumber ;
//        把拼接后的organizationid存到map
        mapTypes.put("signinid", signinid);

        String jsonString = JSON.toJSONString(mapTypes);

        Signcode signcode = JSON.parseObject(jsonString, Signcode.class);

        return signcode;
    }

    public static Distribute distributerecordid(Map mapTypes){
//        把数据转成map类型
//        Map mapTypes = JSON.parseObject(params);
        String activityid = (String) mapTypes.get("activityid");
        System.out.println(activityid);
//        判断原先是否已经有发放数据，如果没有则返回0001，如果有则返回最新的审核编号
        DistributeService dis = new DistributeService();
        String diss = dis.recordid(activityid);
        String recordid;
//        审核ID规则  原始活动ID + 0001 编号
        if(diss.equals("0001")){
            activityid = activityid.replaceFirst("HD","HDSC");
            recordid = activityid + diss;
            System.out.println(recordid);
        }else{
//            先把前面的HDSC去掉
            String a = diss.substring(4);
//            把去掉后的数字转成long类型  只取后面15位，因为long最多只支持19位   int溢出，  转换完成后+1
            long num =Long.parseLong(a.substring(a.length()-15))+1;
//            把前面被截掉的拿回来
            String str = a.substring(0,a.length()-15);
//            字符串重新拼接
            recordid =  "HDSC" + str + num;
        }
//        把生成的auditid封装进map集合中，然后再传出去
        mapTypes.put("recordid", recordid);
        System.out.println(recordid);
        System.out.println(mapTypes);
        String jsonString = JSON.toJSONString(mapTypes);
        Distribute distribute = JSON.parseObject(jsonString,Distribute.class);
        System.out.println("我是AUTO里面的"+distribute);
        return distribute;
    }

    public static Omembers stafid(String params){
//        把数据转成map类型
        Map mapTypes = JSON.parseObject(params);
        String organizationid = (String) mapTypes.get("organizationid");
//        判断原先是否已经有发放数据，如果没有则返回0001，如果有则返回最新的审核编号
        OmembersService omembersService = new OmembersService();
        String sid = omembersService.stafid(organizationid);
        String stafid;
//        审核ID规则  原始活动ID + 0001 编号
        if(sid.equals("0001")){
            stafid ="ZZRY"+ organizationid + sid;
            System.out.println(stafid);
        }else{
//            先把前面的ZZRY去掉
            String a = sid.substring(4);
//            把去掉后的数字转成long类型  ，  转换完成后+1
            long num =Long.parseLong(a.substring(a.length()-15))+1;
            num=num+1;
            System.out.println("我是AUTO里面的num"+num);
//            int num = Integer.parseInt(a.substring(a.length()-10))+1;
//            把前面被截掉的拿回来
            String str = a.substring(0,a.length()-15);
//            字符串重新拼接
            stafid =  "ZZRY" + str + num;
        }
//        把生成的auditid封装进map集合中，然后再传出去
        mapTypes.put("stafid", stafid);
        System.out.println(stafid);
        System.out.println(mapTypes);
        String jsonString = JSON.toJSONString(mapTypes);
        Omembers omembers = JSON.parseObject(jsonString,Omembers.class);
        System.out.println("我是AUTO里面的"+omembers);
        return omembers;
    }



    public static String stafid1(String params){
//        把数据转成map类型
//        Map mapTypes = JSON.parseObject(params);
//        String organizationid = (String) mapTypes.get("organizationid");
        String organizationid = params;
//        判断原先是否已经有发放数据，如果没有则返回0001，如果有则返回最新的审核编号
        OmembersService omembersService = new OmembersService();
        String sid = omembersService.stafid(organizationid);
        String stafid;
//        审核ID规则  原始活动ID + 0001 编号
        if(sid.equals("0001")){
            stafid ="ZZRY"+ organizationid + sid;
            System.out.println(stafid);
        }else{
//            先把前面的ZZRY去掉
            String a = sid.substring(4);
            System.out.println(a);
            System.out.println(a.length());
//            把去掉后的数字转成long类型  ，  转换完成后+1
            long num =Long.parseLong(a.substring(a.length()-10))+1;
            System.out.println(num);
//            int num = Integer.parseInt(a.substring(a.length()-10))+1;
//            把前面被截掉的拿回来
            String str = a.substring(0,a.length()-10);
            System.out.println(str);
//            字符串重新拼接
            stafid =  "ZZRY" + str + num;
        }
//        把生成的auditid封装进map集合中，然后再传出去
//        mapTypes.put("stafid", stafid);
        System.out.println(stafid);
//        System.out.println(mapTypes);
//        String jsonString = JSON.toJSONString(mapTypes);
//        Omembers omembers = JSON.parseObject(jsonString,Omembers.class);
//        System.out.println("我是AUTO里面的"+omembers);
        return stafid;
    }

    public static void main(String[] args) {

System.out.println(IdAutoCreateUtils.stafid1("1301040503284166"));
    }
}