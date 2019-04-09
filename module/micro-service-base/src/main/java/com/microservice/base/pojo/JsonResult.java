package com.microservice.base.pojo;

/**
 * @author wangyu
 * 2019/04/09 13:47
 */
public class JsonResult<T> {

    /**
     * 响应业务状态
     */
    private Integer status;

    /**
     * 响应消息
     */
    private String msg;

    /**
     * 响应数据
     */
    private T data;

    /**
     * 构造自定义返回结果
     * @param status 业务状态吗
     * @param msg 返回消息
     * @param data 返回数据
     * @return jsonResult
     */
    public static <T> JsonResult<T> build(Integer status, String msg, T data) {
        return new JsonResult<>(status,msg,data);
    }

    /**
     * 返回数据
     * @param data 数据
     * @return
     */
    public static <T> JsonResult ok(T data) {
        return new JsonResult<>(200,"ok",data);
    }

    /**
     * 直接返回ok
     * @return
     */
    public static JsonResult<String> ok() {
        return new JsonResult<>(200,"ok");
    }

    /**
     * 直接返回错误信息
     * @param msg
     * @return
     */
    public static JsonResult<String> errorMsg(String msg) {
        return new JsonResult<>(500,msg);
    }

    private JsonResult(Integer status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    /**
     * 直接返回范型对象
     * @param result
     */
    private JsonResult(T result) {
        this.status = 200;
        this.msg="ok";
        this.setData(result);
    }

    private JsonResult(Integer status,String msg){
        this.status=status;
        this.msg = msg;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public JsonResult(){}

    @Override
    public String toString() {
        return "JsonResult{" +
                "status=" + status +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}