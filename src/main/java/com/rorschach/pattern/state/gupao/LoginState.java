package com.rorschach.pattern.state.gupao;

/**
 * 登录状态
 * @author Rorschach
 * @date 2021-4-22 20:30
 */
public class LoginState extends UserState{
    @Override
    public void favorite() {
        System.out.println("收藏成功");
    }

    @Override
    public void comment(String comment) {
        System.out.println(comment);
    }
}
