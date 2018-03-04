package com.biz.office.domain.response;

public class ApiResponse {

    private final static String OK = "OK";

    private boolean result;
    private String  message;
    private Object  data;

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static ApiResponse ok(Object data) {
        ApiResponse response = new ApiResponse();
        response.setResult(true);
        response.setMessage(OK);
        response.setData(data);
        return response;
    }
}
