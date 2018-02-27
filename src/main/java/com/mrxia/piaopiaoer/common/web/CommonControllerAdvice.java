package com.mrxia.piaopiaoer.common.web;

import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.mrxia.piaopiaoer.common.result.RestResult;
import com.mrxia.piaopiaoer.common.result.ResultType;

/**
 * 公共的Controller增强
 *
 * @author xiazijian
 */
@ControllerAdvice
@ResponseBody
public class CommonControllerAdvice {

    //添加全局异常处理流程，根据需要设置需要处理的异常，本文以MethodArgumentNotValidException为例
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public RestResult MethodArgumentNotValidHandler(MethodArgumentNotValidException exception) {
        return RestResult.error(ResultType.CUSTOMER_ERROR,
                exception.getBindingResult().getFieldErrors()
                        .stream().map(FieldError::getDefaultMessage).collect(Collectors.joining(",")));
    }

}
