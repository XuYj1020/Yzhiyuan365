package com.XYJ.pojo;

public class Result {
    private Integer code;//响应码，1 代表成功; 0 代表失败
    private String msg;  //响应信息 描述字符串
    private Object data; //返回的数据

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    //增删改 成功响应
    public static Result success(){
        Result result = new Result();
        result.setCode(1);
        result.setMsg("success");
        result.setData(null);
        return result;
    }
    //查询 成功响应
    public static Result success(Object data){
        Result result = new Result();
        result.setCode(1);
        result.setMsg("success");
        result.setData(data);
        return result;
    }
    //失败响应
    public static Result error(String msg){
        Result result = new Result();
        result.setCode(0);
        result.setMsg(msg);
        result.setData(null);
        return result;
    }

//    public static void main(String[] args) {
//        System.out.println(Result.error("error"));
//    }
}
