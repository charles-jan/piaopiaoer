package com.mrxia.piaopiaoer.common.result;

import static com.mrxia.piaopiaoer.common.result.ResultType.SUCCESS;

import lombok.Getter;

/**
 * rest请求统一返回结果
 * @author xiazijian
 */
@Getter
public class RestResult<R> {

    private int code;

    private String msg;

    private R data;

    private RestResult(int code, String msg, R data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <R> RestResult<R> success(R data) {
        return new RestResult<>(SUCCESS.getCode(), SUCCESS.getMsg(), data);
    }

    public static RestResult<?> error(ResultType errorType) {
        return error(errorType, errorType.getMsg());
    }

    public static RestResult<?> error(ResultType errorType, Exception e) {
        return error(errorType, e.getMessage());
    }

    public static RestResult<?> error(ResultType errorType, String msg) {
        return new RestResult<>(errorType.getCode(), msg, null);
    }
}
