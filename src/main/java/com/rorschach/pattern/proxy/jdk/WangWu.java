package com.rorschach.pattern.proxy.jdk;

import com.rorschach.pattern.proxy.IPerson;

/**
 * @author Rorschach
 * @date 2021-4-11 0:39
 */
public class WangWu implements IPerson {
    @Override
    public void findLove() {
        System.out.println("颜值高");
    }
}
