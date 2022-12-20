package com.madnessgame.domain.dto;

import lombok.Data;

/**
 * <p>
 *
 * @author ycw
 * @Classname LoginDto
 * @Description 登录Dto
 * <p>
 */
@Data
public class LoginDto {

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

    /**
     * 用户登录态签名
     */
    private String signature;

    /**
     * 用户登录态签名的哈希方法
     */
    private String sig_method = "hmac_sha256";
}