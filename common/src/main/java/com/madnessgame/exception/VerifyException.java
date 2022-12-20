package com.madnessgame.exception;

import com.madnessgame.enums.GlobalExceptionErrorCode;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * <p>
 *
 * @author ycw
 * @Classname c
 * @Description d
 * <p>
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class VerifyException extends RuntimeException {

    /**
     * 校验错误码
     */
    private Integer code;

    /**
     * 错误提示
     */
    private String message;

    public VerifyException(GlobalExceptionErrorCode globalExceptionErrorCode) {
        this.code = globalExceptionErrorCode.getCode();
        this.message = globalExceptionErrorCode.getMessage();
    }
}
