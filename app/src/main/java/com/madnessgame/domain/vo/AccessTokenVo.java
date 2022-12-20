package com.madnessgame.domain.vo;

import lombok.Data;

/**
 * <p>
 *
 * @author ycw
 * @Classname AccessTokenVo
 * @Description 访问令牌Vo
 * <p>
 */
@Data
public class AccessTokenVo {
    /**
     * 获取到的凭证
     */
    private String access_token;

    /**
     * 凭证有效时间，单位：秒。目前是7200秒之内的值
     */
    private String expires_in;

    /**
     * 错误码
     */
    private Integer errcode;

    /**
     * 错误信息
     */
    private String errmsg;
}
