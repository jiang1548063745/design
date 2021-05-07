package com.rorschach.pattern.state.gupao;

/**
 * @author Rorschach
 * @date 2021-4-22 21:55
 */
public class Test {

    public static void main(String[] args) {
        AppContext context = new AppContext();
        context.favorite();
        context.comment("评论: 好文章, 360个赞");
    }
}
