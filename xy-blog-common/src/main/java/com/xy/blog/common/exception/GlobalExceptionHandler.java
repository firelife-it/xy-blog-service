package com.xy.blog.common.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zanhonglei
 * @version V1.0
 * @Description: Controller 统一异常处理
 * @date 2019/10/23 1:02
 */
@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public Object exceptionHandler(HttpServletRequest request,Exception e) {

        return null;
    }
}
