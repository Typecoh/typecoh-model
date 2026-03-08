package com.typecoh.model.enums;

import lombok.Getter;

/**
 * @author Typecoh
 * @date 2025/10/4  20:25
 * @description
 */

@Getter
public enum DeleteCode {

    ISDELETE(1, "删除"),
    NODELETE(0, "未删除");

    private int code;
    DeleteCode(int code, String message) {
        this.code = code;
    }
    public static DeleteCode getCode(int code) {
        for (DeleteCode value : values()) {
            if (value.code == code) {
                return value;
            }
        }
        return null;
    }
}
