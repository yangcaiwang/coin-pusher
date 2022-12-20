package com.madnessgame.service;

import com.madnessgame.domain.dto.AccessTokenDto;
import com.madnessgame.domain.dto.CheckSessionKeyDto;
import com.madnessgame.domain.dto.Code2SessionDto;
import com.madnessgame.domain.vo.AccessTokenVo;
import com.madnessgame.domain.vo.CheckSessionKeyVo;
import com.madnessgame.domain.vo.Code2SessionVo;

/**
 * <p>
 *
 * @author ycw
 * @Classname AuthService
 * @Description 远程调用微信 业务接口
 * <p>
 */
public interface RemoteWeChatService {

    /**
     * @param accessTokenDto 访问令牌Dto
     * @return AccessTokenVo
     */
    AccessTokenVo getAccessToken(AccessTokenDto accessTokenDto);

    /**
     * @param code2SessionDto 微信登录Dto
     * @return Code2SessionVo
     */
    Code2SessionVo code2Session(Code2SessionDto code2SessionDto);

    /**
     * @param checkSessionKeyDto 微信校验Dto
     * @return CheckSessionKeyVo
     */
    CheckSessionKeyVo checkSessionKey(CheckSessionKeyDto checkSessionKeyDto);
}
