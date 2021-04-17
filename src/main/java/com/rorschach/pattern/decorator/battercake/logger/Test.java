package com.rorschach.pattern.decorator.battercake.logger;

import org.slf4j.Logger;

/**
 * @author Rorschach
 * @date 2021-4-13 22:36
 */
public class Test {

    private static final Logger logger = JsonLoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {
        logger.info("测试信息");

        logger.error("测试错误");
    }
}
