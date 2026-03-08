package com.typecoh.model.exception;

import lombok.Getter;
/**
 * @author Typecoh
 * @date 2026/3/8  18:44
 * @description
 */
@Getter
public class TypecohException extends Exception{
    private Integer code;
    private String message;

    public TypecohException(String message) {
        super(message);
        this.code = 500;
        this.message = message;
    }

    public TypecohException(Integer code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

    public TypecohException(Integer code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
        this.message = message;
    }
}
