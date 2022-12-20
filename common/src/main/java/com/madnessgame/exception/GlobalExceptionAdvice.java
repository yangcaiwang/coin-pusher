package com.madnessgame.exception;

import com.madnessgame.response.R;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *
 * @author ycw
 * @Classname GlobalExceptionAdvice
 * @Description 全局异常处理器
 * <p>
 */
@ControllerAdvice
public class GlobalExceptionAdvice {
    @ResponseBody
    @ExceptionHandler(ServiceException.class)
    public R<ServiceException> handleServiceException(ServiceException e) {
        return R.error(e.getCode(), e.getMessage());
    }

    @ResponseBody
    @ExceptionHandler(VerifyException.class)
    public R<VerifyException> handleVerifyException(VerifyException e) {
        return R.error(e.getCode(), e.getMessage());
    }
}
