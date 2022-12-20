package com.madnessgame.service;

import com.madnessgame.domain.dto.LoginDto;
import com.madnessgame.domain.vo.LoginVo;

/**
 * <p>
 *
 * @author ycw
 * @Classname UserLoginService
 * @Description 用户登录
 * <p>
 */
public interface UserLoginService {
    LoginVo login(LoginDto loginDto);
}
