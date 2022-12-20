package com.madnessgame.controller;

import com.madnessgame.response.R;
import org.springframework.web.bind.annotation.RequestMapping;
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
@RequestMapping("/coin-pusher/helloWord")
public class HelloWordController {
    public R<String> helloWord() {
        return R.ok("hello,word!");
    }
}
