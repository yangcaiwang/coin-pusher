package com.madnessgame.domain.dto;

import lombok.Data;

/**
 * <p>
 *
 * @author ycw
 * @Classname AccessTokenDto
 * @Description 访问令牌Dto
 * <p>
 */
@Data
public class AccessTokenDto {

    /**
     * 小游戏唯一凭证
     */
    private String appid;

    /**
     * 小程序唯一凭证密钥
     */
    private String secret;

    /**
     * 填写 client_credential
     */
    private final String grant_type = "client_credential";
}