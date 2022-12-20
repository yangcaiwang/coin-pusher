package com.madnessgame.constant;

/**
 * <p>
 * @author ycw
 * @Classname Constants
 * @Description 静态常量
 * <p>
 */
public class Constants {

    //===========================返回状态码常量========================
    /**
     * 成功标记
     */
    public static final int SUCCESS = 200;

    /**
     * 失败标记
     */
    public static final int FAIL = 500;

    /**
     * 登录成功状态
     */
    public static final String LOGIN_SUCCESS_STATUS = "0";

    /**
     * 登录失败状态
     */
    public static final String LOGIN_FAIL_STATUS = "1";

    /**
     * 登录成功
     */
    public static final String LOGIN_SUCCESS = "Success";

    /**
     * 注销
     */
    public static final String LOGOUT = "Logout";

    /**
     * 注册
     */
    public static final String REGISTER = "Register";

    /**
     * 登录失败
     */
    public static final String LOGIN_FAIL = "Error";

    /**
     * UTF-8 字符集
     */
    public static final String UTF8 = "UTF-8";

    /**
     * 用户ID字段
     */
    public static final String USERID = "userId";

    public static final String OPENID = "openid";

    /**
     * 用户名字段
     */
    public static final String USERNAME = "username";

    /**
     * 创建时间
     */
    public static final String CREATED = "created";

    /**
     * 密钥
     */
    public static final String SECRET = "abcdefgh";

    /**
     * 有效期1小时
     */
    public static final long EXPIRE_TIME = 60 * 60 * 1000;

    public static final String TOKEN_HEADER = "Authorization";

    public static final String TOKEN_HEAD = "Bearer ";
}
