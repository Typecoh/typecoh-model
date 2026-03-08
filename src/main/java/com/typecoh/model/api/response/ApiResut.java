package com.typecoh.model.api.response;

import com.typecoh.model.enums.ResultCode;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Typecoh
 * @date 2025/10/4  20:21
 * @description
 */
@Data
@NoArgsConstructor //无参的构造方法
public class ApiResut<T> {

    public int code;
    public String message;
    public T data;
    public Boolean success;

    public ApiResut(int code, String message, T data, Boolean success) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.success = success;
    }

    public ApiResut(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> ApiResut<T> success(T data) {
        return new ApiResut<>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(), data, true);
    }

    public static <T> ApiResut<T> success() {
        return new ApiResut<>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(), null, true);
    }

    public static <T> ApiResut<T> error() {
        return new ApiResut<>(ResultCode.FAIL.getCode(), ResultCode.FAIL.getMessage(), null, false);
    }


    public static <T> ApiResut<T> error(String errorMsg) {
        return new ApiResut<>(ResultCode.FAIL.getCode(), errorMsg, null, false);
    }

    public static <T> ApiResut<T> error(int code, String errorMsg) {
        return new ApiResut<>(code, errorMsg, null, false);
    }
}
