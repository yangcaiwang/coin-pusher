package com.madnessgame.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * <p>
 *
 * @author ycw
 * @Classname GlobalExceptionError
 * @Description 全局异常错误枚举
 * 1.校验异常错误码范围 401-499
 * 2.业务异常错误码固定 500
 * <p>
 */
@Getter
@AllArgsConstructor
public enum GlobalExceptionErrorCode {
    //======================检验异常======================
    VERIFY_PARAM_NOT(405, "参数不合法"),

    //======================业务异常======================
    SERVICE_AAA(500, "业务异常");

    private final Integer code;
    private final String message;
}
