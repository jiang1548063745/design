package com.rorschach.pattern.adapter.passport;

/**
 * @author Rorschach
 * @date 2021-4-17 0:57
 */
public interface IPassport {

    /**
     * 模拟Token登录
     * @param token Token
     */
    HttpMsg loginForToken(String token);

    /**
     * 模拟微信登录
     * @param openId 微信开放ID
     */
    HttpMsg loginForWeChat(String openId);

    /**
     * 模拟手机登录
     * @param telephone 手机号码
     * @param code 验证码
     */
    HttpMsg loginForTelephone(String telephone, String code);
}
