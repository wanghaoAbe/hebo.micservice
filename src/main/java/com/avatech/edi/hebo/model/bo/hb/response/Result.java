package com.avatech.edi.hebo.model.bo.hb.response;

public class Result {
    private static final String OK = "0";
    private static final String ERROR="1";
    private static final String MESSAGE = "操作成功";

    public static Result ok(Object data){
        Result rt = new Result();
        rt.code = OK;
        rt.message=MESSAGE;
        rt.data =data;
        return rt;
    }
    public static Result error(String code,String message){
        Result rt = new Result();
        rt.code = ERROR;
        rt.message = message;
        return rt;
    }

    public static Result error(String code,Exception e){
        Result rt = new Result();
        rt.code = ERROR;
        rt.message = e.getMessage();
        return rt;
    }

    private String code;

    public String getCode(){
        return code;
    }

    public void setCode(String code){
        this.code = code;
    }

    private String message;

    public String getMessage(){
        return message;
    }

    public void setMessage(String message){
        this.message = message;
    }

    private Object data;

    public Object getData(){
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code:'" + code + '\'' +
                ", message:'" + message + '\'' +
                ", data:" + data +
                '}';
    }
}
