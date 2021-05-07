package com.rorschach.pattern.memento.editor;

import java.util.Stack;

/**
 * @author Rorschach
 * @date 2021-4-24 18:31
 */
public class DraftsBox {

    private final Stack<ArticleMemento> STACK = new Stack<>();

    public ArticleMemento getMemento() {
        return STACK.pop();
    }

    public void addMemento(ArticleMemento articleMemento) {
        STACK.push(articleMemento);
    }
}
