package com.typecoh.model.enums;

import lombok.Getter;

/**
 * @author Typecoh
 * @date 2025/10/4  20:25
 * @description
 */

@Getter
public enum ResultCode {

    SUCCESS(200, "操作成功"),
    FAIL(500, "操作失败"),
    NOT_FOUND(404, "未找到该资源"),
    UNAUTHORIZED(401, "未授权"),
    FORBIDDEN(403, "禁止访问"),
    NOT_ACCEPTABLE(406, "请求的格式不可接受"),
    REQUEST_TIMEOUT(408, "请求超时"),
    CONFLICT(409, "请求冲突"),
    UNSUPPORTED_MEDIA_TYPE(415, "不支持的媒体类型"),
    INTERNAL_SERVER_ERROR(500, "服务器内部错误"),
    SERVICE_UNAVAILABLE(503, "服务不可用"),
    GATEWAY_TIMEOUT(504, "网关超时");
    private int code;
    private String message;

    ResultCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static ResultCode getCode(int code) {
        for (ResultCode value : values()) {
            if (value.code == code) {
                return value;
            }
        }
        return null;
    }

    public static ResultCode getMessage(String message) {
        for (ResultCode value : values()) {
            if (value.message.equals(message)) {
                return value;
            }
        }
        return null;
    }
}
