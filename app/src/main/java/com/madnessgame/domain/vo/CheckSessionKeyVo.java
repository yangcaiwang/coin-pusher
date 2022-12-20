package com.madnessgame.domain.vo;

import lombok.Data;

/**
 * <p>
 *
 * @author ycw
 * @Classname CheckSessionKeyVo
 * @Description 微信校验Vo
 * <p>
 */
@Data
public class CheckSessionKeyVo {

    /**
     * 错误码
     */
    private Integer errcode;

    /**
     * 错误信息
     */
    private String errmsg;
}
