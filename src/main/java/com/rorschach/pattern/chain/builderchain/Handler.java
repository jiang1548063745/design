package com.rorschach.pattern.chain.builderchain;

import com.rorschach.pattern.chain.Member;

/**
 * @author Rorschach
 * @date 2021-4-20 21:43
 */
public abstract class Handler<T> {

    protected Handler<T> next;

    public void next(Handler<T> next) {
        this.next = next;
    }

    public abstract void doHandler(Member member);

    public static class Builder<T> {
        private Handler<T> head;

        private Handler<T> tail;

        public Builder<T> addHandler(Handler<T> handler) {
            if (null == head) {
                this.head = this.tail = handler;
                return this;
            }
            this.tail.next(handler);
            this.tail = handler;

            return this;
        }

        public Handler<T> build() {
            return this.head;
        }
    }
}
