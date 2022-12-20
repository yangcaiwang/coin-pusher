package com.madnessgame.domain.vo;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 *
 * @author ycw
 * @Classname LoginVo
 * @Description 登录Vo
 * <p>
 */
@Data
@Accessors(chain = true)
public class LoginVo {
    /**
     * 用户唯一标识
     */
    private String openid;

    /**
     * 会话密钥
     */
    private String session_key;

    /**
     * 用户在开放平台的唯一标识符
     */
    private String unionid;

    /**
     * jwt
     */
    private String token;
}
