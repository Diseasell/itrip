package cn.itrip.beans.dto;

import java.io.Serializable;

/**
 * 数据传输对象
 */
public class Dto<T> implements Serializable {

    private String errorCode;//错误码
    private String msg;//消息描述
    private String success;//消息标识
    private T data;//封装的数据


    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
