package com.rorschach.pattern.state.gupao;

/**
 * 未登陆状态
 * @author Rorschach
 * @date 2021-4-22 20:30
 */
public class UnLoginState extends UserState {
    @Override
    public void favorite() {
        this.switch2Login();
        this.context.getCurrState().favorite();
    }

    @Override
    public void comment(String comment) {
        this.switch2Login();
        this.context.getCurrState().favorite();
    }

    private void switch2Login() {
        System.out.println("跳转到登录页！");
        this.context.setState(AppContext.STATE_LOGIN);
    }
}
