package com.madnessgame.controller;

import com.madnessgame.response.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *
 * @author ycw
 * @Classname HelloWordController
 * @Description 测试
 * <p>
 */
@RestController
public class HelloWordController {
    @GetMapping("/coin-pusher/helloWord")
    public R<String> helloWord() {
        return R.ok("hello,word!");
    }
}
