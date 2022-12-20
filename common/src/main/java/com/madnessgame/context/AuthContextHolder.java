package com.madnessgame.context;

import com.alibaba.ttl.TransmittableThreadLocal;
import com.madnessgame.constant.Constants;
import com.madnessgame.converter.Convert;
import com.madnessgame.utils.StringUtil;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <p>
 * @author ycw
 * @Classname Convert
 * @Description 类型转换器
 * 1.获取当前线程变量中的 用户id、用户名称、Token等信息
 * 注意： 必须在过滤器拦截时通过请求头的方法传入，同时在HeaderInterceptor拦截器设置值。 否则这里无法获取
 * <p>
 */
public class AuthContextHolder {
    private static final TransmittableThreadLocal<Map<String, Object>> THREAD_LOCAL = new TransmittableThreadLocal<>();

    public static void set(String key, Object value) {
        Map<String, Object> map = getLocalMap();
        map.put(key, value == null ? StringUtil.EMPTY : value);
    }

    public static String get(String key) {
        Map<String, Object> map = getLocalMap();
        return Convert.toStr(map.getOrDefault(key, StringUtil.EMPTY));
    }

    public static <T> T get(String key, Class<T> clazz) {
        Map<String, Object> map = getLocalMap();
        return StringUtil.cast(map.getOrDefault(key, null));
    }

    public static Map<String, Object> getLocalMap() {
        Map<String, Object> map = THREAD_LOCAL.get();
        if (map == null) {
            map = new ConcurrentHashMap<String, Object>();
            THREAD_LOCAL.set(map);
        }
        return map;
    }

    public static void setLocalMap(Map<String, Object> threadLocalMap) {
        THREAD_LOCAL.set(threadLocalMap);
    }

    public static String getUserId() {
        return get(Constants.USERID);
    }

    public static void setUserId(String account) {
        set(Constants.USERID, account);
    }

    public static String getUserName() {
        return get(Constants.USERNAME);
    }

    public static void setUserName(String username) {
        set(Constants.USERNAME, username);
    }

    public static void remove() {
        THREAD_LOCAL.remove();
    }
}
