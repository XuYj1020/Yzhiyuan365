package com.XYJ.web.servlet;

import com.alibaba.fastjson.JSON;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

//这是一个文件上传的案例，该案例实现了文件的上传功能
@WebServlet( urlPatterns = "/test/*")
public class TestServlet extends BaseServlet {
    public void SelectAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        System.out.println("文件上传...");
//        req.setCharacterEncoding("UTF-8");
//        //获取Part对象 （Servlet 将 mutipart/form-data 的 POST 请求封装成 Part对象）
//        Part part = req.getPart("myfile");
//        //通过Part对象得到上传的文件名
//        String fileName = part.getSubmittedFileName();
//        System.out.println("上传文件名：" + fileName);
//        //得到文件存放的路径
//        String filePath = req.getServletContext().getRealPath("/");
//        System.out.println("文件存放路径：" + filePath);
//        //上传文件到指定目录
//        part.write(filePath + "/" + fileName);

        // 设置编码集(解码)
        request.setCharacterEncoding("UTF-8");
        // 设置响应的编码集
        response.setContentType("text/html;charset=utf-8");
        //创建工厂
        DiskFileItemFactory factory = new DiskFileItemFactory();
        // 设置临时文件夹，当文件太大时会暂时存放在这里
//        创建file对象
        File f = new File("D:\\target");
        //   判断文件夹是否存在，如果不存在就新建一个
        if (!f.exists()) {
            f.mkdirs();
        }
        //设置文件的缓存路径
        factory.setRepository(f);
        //创建ServletFileUpload组件
        ServletFileUpload fileupload = new ServletFileUpload(factory);
        fileupload.setHeaderEncoding("UTF-8");
        File f3 = new File("Yzhiyuan365/src/main/webapp/upload");
        System.out.println(f3.exists());
        File f4 = new File("Yzhiyuan365\\target\\Yzhiyuan365\\upload");
        System.out.println(f4.exists());
        File f5 = new File("Yzhiyuan365\\upload");
        System.out.println(f5.exists());
        //解析request
        try {
            List<FileItem> fileItems = fileupload.parseRequest(request);
            //遍历集合
            for (FileItem fileItem : fileItems) {
                //判断是否为普通字段  true普通文本
                if (fileItem.isFormField()) {
                    //获取字段名和字段值
                    String name = fileItem.getFieldName();    // 获取表单的name
                    String value = fileItem.getString("UTF-8");
                    System.out.println("上传者：" + value);
                } else {
                    //获取上传的文件名
                    String fileName = fileItem.getName();
                    System.out.println("文件名称" + fileName);

                    String webPath="/upload/";
//                    request.getSession().getServletContext()  获取的servlet容器对象 相当于tomcat容器
//                    String path=request.getSession().getServletContext().getRealPath(webPath+fileName);
                    System.out.println(request.getSession().getServletContext());
//                    查看文件储存的地址
//                    System.out.println(path+"@@@@@@@@@");             //E:\code\ideaProjects\Yzhiyuan365\target\Yzhiyuan365\\upload\@@@@@@@@@  当前位war_exploded模式


//                    自定义文件夹 文件储存路径
//                    String path="E:\\code\\ideaProjects\\Yzhiyuan365\\src\\main\\webapp\\upload\\huodong\\";
//                    String path="E:\\code\\ideaProjects\\Yzhiyuan365\\target\\Yzhiyuan365\\upload\\huodong\\";
                    String path = "E:\\uploda\\huodong\\";
                    File file=new File(path+fileName);
                    file.getParentFile().mkdirs();
                    file.createNewFile();
                    //获得file对象的输出流
                    FileOutputStream out=new FileOutputStream(file);
                    //获取fileItem的输入流
                    InputStream in=fileItem.getInputStream();
                    //实现文件的上传（本质是复制）
                    byte[]buffer=new byte[1024];
                    int len=-1;
                    while((len=in.read(buffer))!=-1){
                        out.write(buffer,0,len);
                    }
                    in.close();
                    out.close();
//                    //删除fileItem对象
//                    fileItem.delete();
                    String rePath = "/huodong/"+fileName;
//                    String jsonString = JSON.toJSONString(path);
//                    System.out.println("我是"+jsonString);
                    String jsonString = JSON.toJSONString(rePath);
//                    System.out.println("我是"+jsonString);
                    response.setContentType("text/json;charset=utf-8");
                    response.getWriter().write(jsonString);

                }
            }

        } catch (FileUploadException e) {
            throw new RuntimeException(e);
        }
    }
}