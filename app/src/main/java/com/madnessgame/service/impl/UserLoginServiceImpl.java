package com.madnessgame.service.impl;

import com.madnessgame.domain.dto.CheckSessionKeyDto;
import com.madnessgame.domain.dto.Code2SessionDto;
import com.madnessgame.domain.dto.LoginDto;
import com.madnessgame.domain.vo.Code2SessionVo;
import com.madnessgame.domain.vo.LoginVo;
import com.madnessgame.service.RemoteWeChatService;
import com.madnessgame.service.UserLoginService;
import com.madnessgame.utils.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginServiceImpl implements UserLoginService {
    @Autowired
    private RemoteWeChatService remoteWeChatService;

    @Override
    public LoginVo login(LoginDto loginDto) {
        Code2SessionDto code2SessionDto = new Code2SessionDto();
        code2SessionDto.setAppid(loginDto.getSig_method())
                .setSecret(loginDto.getSecret())
                .setJs_code(loginDto.getJs_code());

        // 微信登录
        Code2SessionVo code2SessionVo = remoteWeChatService.code2Session(code2SessionDto);

        CheckSessionKeyDto checkSessionKeyDto = new CheckSessionKeyDto();
        checkSessionKeyDto.setSession_key(code2SessionVo.getSession_key())
                .setSignature(loginDto.getSignature())
                .setOpenid(code2SessionVo.getOpenid());
        // 微信验证
        remoteWeChatService.checkSessionKey(checkSessionKeyDto);

        // 生成token
        String token = JwtTokenUtil.generateToken(code2SessionVo.getOpenid());
        LoginVo loginVo = new LoginVo();
        loginVo.setOpenid(code2SessionVo.getOpenid())
                .setSession_key(code2SessionVo.getSession_key())
                .setUnionid(code2SessionVo.getUnionid())
                .setToken(token);
        return loginVo;
    }
}
