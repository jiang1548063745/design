package com.rorschach.pattern.proxy.staticpaoxy;

import com.rorschach.pattern.proxy.IPerson;

/**
 * @author Rorschach
 * @date 2021-4-11 0:34
 */
public class ZhangLaoSan implements IPerson {

    private final ZhangSan zhangSan;

    public ZhangLaoSan(ZhangSan zhangSan) {
        this.zhangSan = zhangSan;
    }

    @Override
    public void findLove() {
        System.out.println("张老三 物色");

        zhangSan.findLove();

        System.out.println("张三开始交往");
    }
}
