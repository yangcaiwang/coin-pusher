package com.madnessgame.service.impl;

import com.madnessgame.constant.RemoteConstants;
import com.madnessgame.domain.dto.AccessTokenDto;
import com.madnessgame.domain.dto.CheckSessionKeyDto;
import com.madnessgame.domain.dto.Code2SessionDto;
import com.madnessgame.domain.vo.AccessTokenVo;
import com.madnessgame.domain.vo.CheckSessionKeyVo;
import com.madnessgame.domain.vo.Code2SessionVo;
import com.madnessgame.exception.ServiceException;
import com.madnessgame.service.RemoteWeChatService;
import com.madnessgame.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RemoteWeChatServiceImpl implements RemoteWeChatService {
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public AccessTokenVo getAccessToken(AccessTokenDto accessTokenDto) {
        // 远程调用
        AccessTokenVo accessTokenVo = restTemplate.getForObject(RemoteConstants.WX_URL_ACCESS_TOKEN, AccessTokenVo.class, accessTokenDto);
        assert accessTokenVo != null;
        if (StringUtil.isEmpty(accessTokenVo.getAccess_token())) {
            throw new ServiceException(accessTokenVo.getErrcode(), accessTokenVo.getErrmsg());
        }
        return accessTokenVo;
    }

    @Override
    public Code2SessionVo code2Session(Code2SessionDto code2SessionDto) {
        // 远程调用
        Code2SessionVo code2SessionVo = restTemplate.getForObject(RemoteConstants.WX_URL_CODE2SESSION, Code2SessionVo.class, code2SessionDto);
        assert code2SessionVo != null;
        if (StringUtil.isEmpty(code2SessionVo.getSession_key())) {
            throw new ServiceException(code2SessionVo.getErrcode(), code2SessionVo.getErrmsg());
        }
        return code2SessionVo;
    }

    @Override
    public CheckSessionKeyVo checkSessionKey(CheckSessionKeyDto checkSessionKeyDto) {
        // 远程调用
        CheckSessionKeyVo checkSessionKeyVo = restTemplate.getForObject(RemoteConstants.WX_URL_CHECK_SESSION_KEY, CheckSessionKeyVo.class, checkSessionKeyDto);
        assert checkSessionKeyVo != null;
        if (!checkSessionKeyVo.getErrcode().equals(0)) {
            throw new ServiceException(checkSessionKeyVo.getErrcode(), checkSessionKeyVo.getErrmsg());
        }
        return checkSessionKeyVo;
    }
}
