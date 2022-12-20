package com.madnessgame.domain.dto;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 *
 * @author ycw
 * @Classname Code2SessionDto
 * @Description 微信登录Dto
 * <p>
 */
@Data
@Accessors(chain = true)
public class Code2SessionDto {

    /**
     * 小游戏唯一凭证
     */
    private String appid;

    /**
     * 小程序唯一凭证密钥
     */
    private String secret;

    /**
     * 前端微信登录时获取的 code
     */
    private String js_code;

    /**
     * 填写 client_credential
     */
    private final String grant_type = "client_credential";
}
