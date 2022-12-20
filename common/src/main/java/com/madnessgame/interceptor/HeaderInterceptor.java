package com.madnessgame.interceptor;

import com.madnessgame.constant.Constants;
import com.madnessgame.context.AuthContextHolder;
import com.madnessgame.utils.ServletUtil;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.AsyncHandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 *
 * @author ycw
 * @Classname HeaderInterceptor
 * @Description 自定义请求头拦截器
 * 1.将Header数据封装到线程变量中方便获取
 * 注意：此拦截器会同时验证当前用户有效期自动刷新有效期
 * <p>
 */
public class HeaderInterceptor implements AsyncHandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (!(handler instanceof HandlerMethod)) {
            return true;
        }

        AuthContextHolder.setUserId(ServletUtil.getHeader(Constants.USERID));
        AuthContextHolder.setUserName(ServletUtil.getHeader(Constants.USERNAME));
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        AuthContextHolder.remove();
    }
}
