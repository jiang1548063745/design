package com.rorschach.pattern.state.gupao;

/**
 * 上下文
 * @author Rorschach
 * @date 2021-4-22 20:29
 */
public class AppContext {

    public static final UserState STATE_LOGIN = new LoginState();
    public static final UserState STATE_UN_LOGIN = new UnLoginState();

    {
        STATE_LOGIN.setContext(this);
        STATE_UN_LOGIN.setContext(this);
    }

    /**
     * 当前状态
     */
    private UserState currState = STATE_UN_LOGIN;

    public void setState(UserState state) {
        this.currState = state;
    }

    public UserState getCurrState() {
        return this.currState;
    }

    public void favorite() {
        this.currState.favorite();
    }

    public void comment(String comment) {
        this.currState.comment(comment);
    }
}
