package com.rorschach.pattern.state.gupao;

/**
 * 用户状态
 * @author Rorschach
 * @date 2021-4-22 20:27
 */
public abstract class UserState {

    protected AppContext context;

    /**
     * 收藏
     */
    public abstract void favorite();

    /**
     * 评论
     * @param comment 评论
     */
    public abstract void comment(String comment);

    public void setContext(AppContext context) {
        this.context = context;
    }
}
