package com.madnessgame;

import com.madnessgame.domain.vo.AccessTokenVo;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

/**
 * <p>
 *
 * @author ycw
 * @Classname CoinPusherTest
 * @Description 推币机测试类
 * <p>
 */
@SpringBootTest
@RunWith(SpringRunner.class)
class CoinPusherTest {
    @Autowired
    private RestTemplate restTemplate;

    @Test
    public void testJwks() {
        String url = "http://api.prod.madnessglobalgame.com/video-slots/jwks.json";
        String s = restTemplate.getForObject(url, String.class);

        System.out.println(s);
    }

    @Test
    public void test() {
        String url = "http://127.0.0.1:9001/auth/accessToken";
        HttpHeaders headers = new HttpHeaders();
        headers.set("grant_type", "grant_type");
        headers.set("appid", "appid");
        headers.set("secret", "secret");
        HttpEntity httpEntity = new HttpEntity<>(headers);
        AccessTokenVo accessTokenVo = restTemplate.postForObject(url, httpEntity, AccessTokenVo.class);
        System.out.println(accessTokenVo);
    }

    @Test
    public void testDouble() {
        Double a = 0.03;
        Double b = 0.02;
        System.out.println(a - b);
        BigDecimal a1 = new BigDecimal("0.03");
        BigDecimal b1 = new BigDecimal("0.02");
        System.out.println(a1.subtract(b1));
    }
}