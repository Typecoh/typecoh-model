package com.typecoh.model.exception;

import com.typecoh.model.api.response.ApiResut;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    /**
     * 处理业务异常
     */
    @ExceptionHandler(TypecohException.class)
    public ApiResut<Void> handleBusinessException(TypecohException e) {
        log.error("业务异常: {}", e.getMessage());
        return ApiResut.error(e.getCode(), e.getMessage());
    }
}