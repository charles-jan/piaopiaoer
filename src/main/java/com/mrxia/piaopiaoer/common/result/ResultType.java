package com.mrxia.piaopiaoer.common.result;

public enum ResultType {

    /**
     * 请求成功
     */
    SUCCESS(200, "success"),

    /**
     * 客户端参数错误
     */
    CUSTOMER_ERROR(400, "customer error"),

    /**
     * 服务端错误
     */
    SEVER_ERROR(500, "server error");

    private int code;

    private String msg;

    ResultType(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
