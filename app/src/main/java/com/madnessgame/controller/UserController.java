package com.madnessgame.controller;

import com.madnessgame.domain.dto.AccessTokenDto;
import com.madnessgame.domain.dto.LoginDto;
import com.madnessgame.domain.vo.AccessTokenVo;
import com.madnessgame.domain.vo.LoginVo;
import com.madnessgame.enums.GlobalExceptionErrorCode;
import com.madnessgame.exception.VerifyException;
import com.madnessgame.response.R;
import com.madnessgame.service.RemoteWeChatService;
import com.madnessgame.service.UserLoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *
 * @author ycw
 * @Classname UserController
 * @Description 用户前端控制器
 * <p>
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private RemoteWeChatService remoteWeChatService;
    @Autowired
    private UserLoginService userLoginService;

    /**
     * 从微信获取accessToken
     *
     * @param accessTokenDto 访问令牌Dto
     * @return AccessTokenVo
     */
    @PostMapping("/accessToken")
    public R<AccessTokenVo> getAccessToken(@RequestBody AccessTokenDto accessTokenDto) {
        if (accessTokenDto != null) {
            throw new VerifyException(GlobalExceptionErrorCode.VERIFY_PARAM_NOT);
        }
        return R.ok(remoteWeChatService.getAccessToken(accessTokenDto));
    }

    /**
     * 登录流程
     * 1.访问微信code2session 获取用户唯一标识
     * 2.访问微信checkSessionKey 做校验
     *
     * @param loginDto 登录Dto
     * @return 结果
     */
    @PostMapping("/login")
    public R<LoginVo> login(@RequestBody LoginDto loginDto) {
        if (loginDto != null) {
            throw new VerifyException(GlobalExceptionErrorCode.VERIFY_PARAM_NOT);
        }
        return R.ok(userLoginService.login(loginDto));
    }
}
