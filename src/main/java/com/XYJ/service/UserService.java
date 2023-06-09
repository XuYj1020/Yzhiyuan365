package com.XYJ.service;

import com.XYJ.mapper.ActivityMapper;
import com.XYJ.mapper.UserMapper;
import com.XYJ.pojo.Activity;
import com.XYJ.pojo.PageFY;
import com.XYJ.pojo.User;
import com.XYJ.util.SqlSessionFactoryUtils;
import com.alibaba.fastjson.JSON;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.XYJ.util.SqlSessionFactoryUtils.getSqlSessionFactory;


public class UserService {
    SqlSessionFactory factory = getSqlSessionFactory();
//    public static void main(String[] args) {
//        //          SqlSessionFactory
//
//        UserService ss = new UserService();
//
//        System.out.println(ss.selectAll());
//    }

//    一个selectAll()方法，返回值类型为List<User>
//    查找全部志愿者用户
    public List<User> selectAll(){

//        获取sqlSession对象
        SqlSession sqlSession = factory.openSession();
//        获取UserMapper接口的代理对象
        UserMapper usermapper = sqlSession.getMapper(UserMapper.class);
//        调用方法
        List<User> users = usermapper.selectAll();
//        释放资源
        sqlSession.close();
//        返回结果
        return users;
    }

//志愿者注册
    public void insert(User user){
//        获取sqlSession对象
        SqlSession sqlSession = factory.openSession();
//        获取UserMapper接口的代理对象
        UserMapper usermapper = sqlSession.getMapper(UserMapper.class);
//        调用方法
        usermapper.insert(user);
//        提交事务
        sqlSession.commit();
//        释放资源
        sqlSession.close();

    }

//    志愿者登录
    public Integer Login(User user){
        SqlSession sqlSession = factory.openSession();
        UserMapper usermapper = sqlSession.getMapper(UserMapper.class);
        Integer users = usermapper.Login(user);
        sqlSession.close();
        return users;
    }

    public Integer selectByPhone(String phone){
        SqlSession sqlSession = factory.openSession();
        UserMapper usermapper = sqlSession.getMapper(UserMapper.class);
        Integer users = usermapper.selectByPhone(phone);
        sqlSession.close();
        return users;
    }



//测试语句是否正确
//    public static void main(String[] args) {
//       UserService s = new UserService();
//       String phone ="13567895632";
////        s.SelectProvince();
//        System.out.println(s.selectByPhone(phone));
//
//    }

    public Integer selectByIdnumber(String idnumber){
        SqlSession sqlSession = factory.openSession();
        UserMapper usermapper = sqlSession.getMapper(UserMapper.class);
        Integer users = usermapper.selectByIdnumber(idnumber);
        sqlSession.close();
        return users;
    }
    //测试语句是否正确
//    public static void main(String[] args) {
//       UserService s = new UserService();
//       String idnumber ="330686200003069856";
//        System.out.println(s.selectByIdnumber(idnumber));
//    }

    public List<User> selectByPhonePass(User user){

//        获取sqlSession对象
        SqlSession sqlSession = factory.openSession();
//        获取UserMapper接口的代理对象
        UserMapper usermapper = sqlSession.getMapper(UserMapper.class);
//        调用方法
        List<User> users = usermapper.selectByPhonePass(user);
//        释放资源
        sqlSession.close();
//        返回结果
        return users;
    }

    public void updateLastlogintime(User user){
        SqlSession sqlSession = factory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.updateLastlogintime(user);
        sqlSession.close();
    }

//    活动管理员
    public List<User> selectByVIDjoinOID(String organizationid){
        SqlSession sqlSession = factory.openSession();
        UserMapper usermapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = usermapper.selectByVIDjoinOID(organizationid);
        sqlSession.close();
        return users;
    }

    public List<User> selectByjoinAID(String activityid){
        SqlSession sqlSession = factory.openSession();
        UserMapper usermapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = usermapper.selectByjoinAID(activityid);
        sqlSession.close();
        return users;
    }

    public List<User> selectByVid(String volunteerid){
        SqlSession sqlSession = factory.openSession();
        UserMapper usermapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = usermapper.selectByVid(volunteerid);
        sqlSession.close();
        return users;
    }

    public void updateVinfo(User user){
        SqlSession sqlSession = factory.openSession();
        UserMapper usermapper = sqlSession.getMapper(UserMapper.class);
        usermapper.updateVinfo(user);
        sqlSession.close();
    }


    public void updatehourse(Activity activity){
        SqlSession sqlSession = factory.openSession();
        UserMapper usermapper = sqlSession.getMapper(UserMapper.class);
        usermapper.updatehourse(activity);
        sqlSession.close();
    }
    public void updateCreditjia(Activity activity){
        SqlSession sqlSession = factory.openSession();
        UserMapper usermapper = sqlSession.getMapper(UserMapper.class);
        usermapper.updateCreditjia(activity);
        sqlSession.close();
    }
    public void updateCreditjian(Activity activity){
        SqlSession sqlSession = factory.openSession();
        UserMapper usermapper = sqlSession.getMapper(UserMapper.class);
        usermapper.updateCreditjian(activity);
        sqlSession.close();
    }

    public PageFY<User> baomingyanz(String volunteerid, Activity activity){
        SqlSession sqlSession = factory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

//        总记录数
        int total = userMapper.selectActivityCount(volunteerid,activity);
        System.out.println(total);
        List<User> users= userMapper.selectVCredit(volunteerid);

        PageFY<User> yanzheng = new PageFY<>();
        yanzheng.setTotal(total);
        yanzheng.setShuju(users);
        sqlSession.close();
        return yanzheng;
    }

    public PageFY<User> selectAllFY(int begin,int size,User user){
        SqlSession sqlSession = factory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

//        总记录数
        int total = userMapper.selectAllFYCount(user);
        System.out.println(total);
        List<User> users= userMapper.selectAllFY(begin,size,user);

        PageFY<User> userinfo = new PageFY<>();
        userinfo.setTotal(total);
        userinfo.setShuju(users);
        sqlSession.close();
        return userinfo;
    }





    //测试语句是否正确
    public static <Sting> void main(String[] args) throws IOException {
       UserService s = new UserService();
       User user =new User();
//       list为空的判断方法
//       user.setPhone("123456");
//       user.setPassword("3652");
//       System.out.println(s.selectByPhonePass(user));
//       System.out.println(s.selectByPhonePass(user)==null);   //false
//        System.out.println(s.selectByPhonePass(user)!=null);  //true
//        System.out.println(s.selectByPhonePass(user).isEmpty());  //true
//        user.setPhone("13568965871");
//        user.setPassword("111");
//        System.out.println(s.selectByPhonePass(user));
//        System.out.println(s.selectByPhonePass(user)==null);   //false
//        System.out.println(s.selectByPhonePass(user)!=null);  //true
//        System.out.println(s.selectByPhonePass(user).isEmpty());  //false

//          user.setPhone("13568965871");
//          user.setPassword("111");
//          List<User> users= s.selectByPhonePass(user);
////          打印结果集
//          System.out.println(users);
////          对结果集进行转换，转成json格式
//          String jsonString = JSON.toJSONString(users);
//          System.out.println(jsonString);
////          把结果集的list格式转换成map类型，先转成json 先去掉 [ ] 然后再转成map
//        System.out.println("截取最后一个字符串生成的新字符串为: " + jsonString.substring(1,jsonString.length()-1));
//        String jsonString2 = jsonString.substring(1,jsonString.length()-1);
//        Map mapTypes = JSON.parseObject(jsonString2);
//        System.out.println(mapTypes );
//        System.out.println(mapTypes.put("idnumber","") );
//        System.out.println(mapTypes );
////        Map maps = (Map)JSON.parse(params);
//        for (Object map : mapTypes.entrySet()) {
//            System.out.println(((Map.Entry) map).getKey() + "     " + ((Map.Entry) map).getValue());
//        }
//        System.out.println(mapTypes.get("name") );

//        System.out.println(s.selectByVIDjoinOID("1301040503284166"));
//        System.out.println(s.selectByjoinAID("HD330301810406"));
        System.out.println(s.selectByVid("330689230325018483"));

        Map<String,Object> map = new HashMap<>();
        map.put("starttime","2023-04-11 08:00:00");
        map.put("endtime","2023-4-27 9:00:00");
        String jsonString = JSON.toJSONString(map);
        Activity act = JSON.parseObject(jsonString,Activity.class);
        PageFY<User> baomingyanz = s.baomingyanz("338965230325121908",act);
        System.out.println(baomingyanz);
    }
}