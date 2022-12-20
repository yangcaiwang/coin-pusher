package com.madnessgame;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>
 *
 * @author ycw
 * @Classname Main
 * @Description 推币机启动类
 * <p>
 */
@Slf4j
@SpringBootApplication
public class CoinPusher {
    public static void main(String[] args) {
        SpringApplication.run(CoinPusher.class, args);
        log.info("coin-pusher 启动成功！");
    }
}