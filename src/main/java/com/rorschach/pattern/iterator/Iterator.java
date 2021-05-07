package com.rorschach.pattern.iterator;

/**
 * @author Rorschach
 * @date 2021-4-21 21:02
 */
public interface Iterator<E> {

    E next();

    boolean hasNext();
}
