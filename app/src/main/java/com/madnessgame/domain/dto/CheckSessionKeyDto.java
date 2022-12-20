package com.madnessgame.domain.dto;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 *
 * @author ycw
 * @Classname CheckSessionKeyDto
 * @Description 微信校验Dto
 * <p>
 */
@Data
@Accessors(chain = true)
public class CheckSessionKeyDto {

    /**
     * 用户唯一标识
     */
    private String openid;

    /**
     * 会话密钥
     */
    private String session_key;

    /**
     * 用户登录态签名
     */
    private String signature;

    /**
     * 用户登录态签名的哈希方法
     */
    private final String sig_method = "hmac_sha256";
}
