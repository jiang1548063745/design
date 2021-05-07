package com.rorschach.pattern.iterator;

import java.util.List;

/**
 * @author Rorschach
 * @date 2021-4-21 21:04
 */
public class IteratorImpl<E> implements Iterator<E> {

    private List<E> list;

    private int cursor;

    private E element;

    public IteratorImpl(List<E> list) {
        this.list = list;
    }

    @Override
    public E next() {
        System.out.print("当前位置: " + cursor + " : ");

        element =  list.get(cursor);
        cursor++;

        return element;
    }

    @Override
    public boolean hasNext() {
        return cursor < list.size();
    }
}
