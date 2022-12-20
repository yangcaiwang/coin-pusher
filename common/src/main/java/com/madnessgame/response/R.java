package com.madnessgame.response;

import com.madnessgame.constant.Constants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 *
 * @author ycw
 * @Classname R
 * @Description 响应信息主体
 * <p>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class R<T> implements Serializable {
    private static final Long serialVersionUID = 1L;
    private Integer code;
    private String msg;
    private T data;

    public static <T> R<T> ok() {
        return restR(null, Constants.SUCCESS, null);
    }

    public static <T> R<T> ok(T data) {
        return restR(data, Constants.SUCCESS, null);
    }

    public static <T> R<T> ok(T data, String msg) {
        return restR(data, Constants.SUCCESS, msg);
    }

    public static <T> R<T> error() {
        return restR(null, Constants.FAIL, null);
    }

    public static <T> R<T> error(String msg) {
        return restR(null, Constants.FAIL, msg);
    }

    public static <T> R<T> error(T data) {
        return restR(data, Constants.FAIL, null);
    }

    public static <T> R<T> error(Integer code, String msg) {
        return restR(null, code, msg);
    }

    public static <T> R<T> error(T data, String msg) {
        return restR(data, Constants.FAIL, msg);
    }

    public static <T> R<T> restR(T data, int code, String msg) {
        R<T> r = new R<>();
        r.setCode(code);
        r.setData(data);
        r.setMsg(msg);
        return r;
    }
}
