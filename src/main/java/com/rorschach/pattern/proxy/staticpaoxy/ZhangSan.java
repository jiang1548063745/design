package com.rorschach.pattern.proxy.staticpaoxy;

import com.rorschach.pattern.proxy.IPerson;

/**
 * @author Rorschach
 * @date 2021-4-11 0:33
 */
public class ZhangSan implements IPerson {

    @Override
    public void findLove() {
        System.out.println("张三 find love");
    }
}
