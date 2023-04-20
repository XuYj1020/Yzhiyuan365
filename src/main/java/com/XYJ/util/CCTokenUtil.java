package com.XYJ.util;

import com.XYJ.pojo.User;
import com.alibaba.fastjson.JSON;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CCTokenUtil {
    public static String CreateVToken(String users){
//        1.序列化后的list结果集  json  uesrservlet传入，搜索后的结果
        String user = users;
//        2.转成Map
        user = user.substring(1,user.length()-1);   //把包在{} 外面的 []去掉
        Map userinfo = JSON.parseObject(user);
//        3.把重要信息，如身份证号，密码字段置空
//        userinfo.put("idnumber","");
//        userinfo.put("password","");
//        userinfo.put("district","");
//        3.把用户的id，手机号，姓名提取出来
        Map<String,Object> claims = new HashMap<>();
        claims.put("name",userinfo.get("name"));
        claims.put("phone",userinfo.get("phone"));
        claims.put("volunteerid",userinfo.get("volunteerid"));
//        4.生成token
//        claims.put("id",1);
//        claims.put("username","Tom");
        System.out.println("我是cc里面的user"+claims);
        String Token = Jwts.builder()
                .signWith(SignatureAlgorithm.HS256, "XYJDSG") //签名算法HS256和令牌类型XYJDSG（会生成最后一部分的密钥，不可逆编码）
                .setClaims(claims) //自定义内容(载荷)
                .setExpiration(new Date(System.currentTimeMillis() + 12*3600*1000)) //有效期  12小时有效
                .compact();
        System.out.println(Token);
//        return Token;

//        新建一个map，把用户id,用户手机号，用户姓名，用户token传出去
        Map<String,Object> useinfo = new HashMap<>();
        useinfo.put("name",userinfo.get("name"));
        useinfo.put("phone",userinfo.get("phone"));
        useinfo.put("volunteerid",userinfo.get("volunteerid"));
        useinfo.put("vtoken",Token);

//        5.转成json格式后返回
        String tokenString = JSON.toJSONString(useinfo);
        return tokenString;
//        eyJhbGciOiJIUzI1NiJ9.eyJpZCI6MSwiZXhwIjoxNjc5OTU2MDIzLCJ1c2VybmFtZSI6IlRvbSJ9.8yQQlCfa0wo3MZycLcwdTPzPYuVIC1KSYRpR_65njXs
//        {"alg":"HS256"}.{"id":1,"username":"Tom","exp": 1679956023,}.数字签名(header.payload，secret)(这一部分代码无法解码不是bace64)
    }

//    public static void main(String[] args) {
//        CCTokenUtil.CreateToken();
//
//    }


//    生成组织登录的TOKEN
    public static String CreateOToken(String organizations){
//        1.序列化后的list结果集  json
        String organization = organizations;
//        2.转成Mao
        organization = organization.substring(1,organization.length()-1);
        Map organizationinfo = JSON.parseObject(organization);

//        3.把组织的id，手机号，姓名提取出来
        Map<String,Object> claims = new HashMap<>();
        claims.put("oname",organizationinfo.get("oname"));
        claims.put("phone",organizationinfo.get("phone"));
        claims.put("organizationid",organizationinfo.get("organizationid"));

//        4.生成token
        System.out.println("我是cc里面的organization"+claims);
        String Token = Jwts.builder()
                .signWith(SignatureAlgorithm.HS256, "XYJDSG") //签名算法HS256和令牌类型XYJDSG（会生成最后一部分的密钥，不可逆编码）
                .setClaims(claims) //自定义内容(载荷)
                .setExpiration(new Date(System.currentTimeMillis() + 12*3600*1000)) //有效期  12小时有效
                .compact();
        System.out.println(Token);

        //        新建一个map，把用户id,用户手机号，用户姓名，用户token传出去
        Map<String,Object> oinfo = new HashMap<>();
        oinfo.put("oname",organizationinfo.get("oname"));
        oinfo.put("phone",organizationinfo.get("phone"));
        oinfo.put("organizationid",organizationinfo.get("organizationid"));
        oinfo.put("ouserstatusid",organizationinfo.get("userstatusid"));
        oinfo.put("otoken",Token);

//        5.转成json格式后返回
        String tokenString = JSON.toJSONString(oinfo);
        return tokenString;
    }

    public static String CreateAToken(String adminrs){
//        1.序列化后的list结果集  json
        String adminr = adminrs;
//        2.转成Mao
        adminrs = adminrs.substring(1,adminrs.length()-1);
        Map adminrsinfo = JSON.parseObject(adminrs);

//        3.把管理员的id提取出来
        Map<String,Object> claims = new HashMap<>();
        claims.put("daminid",adminrsinfo.get("daminid"));

//        4.生成token
        System.out.println("我是cc里面的organization"+claims);
        String Token = Jwts.builder()
                .signWith(SignatureAlgorithm.HS256, "XYJDSG") //签名算法HS256和令牌类型XYJDSG（会生成最后一部分的密钥，不可逆编码）
                .setClaims(claims) //自定义内容(载荷)
                .setExpiration(new Date(System.currentTimeMillis() + 12*3600*1000)) //有效期  12小时有效
                .compact();
        System.out.println(Token);

        //        新建一个map，把用户id,用户手机号，用户姓名，用户token传出去
        Map<String,Object> ainfo = new HashMap<>();
        ainfo.put("daminid",adminrsinfo.get("daminid"));
        ainfo.put("atoken",Token);

//        5.转成json格式后返回
        String tokenString = JSON.toJSONString(ainfo);
        return tokenString;
    }





//    校验token
    public static Claims CheckToken(String token){

        Claims claims = Jwts.parser()
                .setSigningKey("XYJDSG") //指定签名秘钥
                .parseClaimsJws(token) //解析令牌
                .getBody();
                System.out.println(claims);
        return claims;
        }
}
