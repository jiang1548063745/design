package com.rorschach.pattern.chain.optimize;

import com.rorschach.pattern.chain.Member;

/**
 * @author Rorschach
 * @date 2021-4-20 21:43
 */
public abstract class Handler {

    protected Handler next;

    public void next(Handler next) {
        this.next = next;
    }

    public abstract void doHandler(Member member);
}
