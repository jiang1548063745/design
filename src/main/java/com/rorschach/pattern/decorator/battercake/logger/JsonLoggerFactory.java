package com.rorschach.pattern.decorator.battercake.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Rorschach
 * @date 2021-4-13 22:54
 */
public class JsonLoggerFactory {

    public static JsonLogger getLogger(Class<?> clazz) {
        Logger logger = LoggerFactory.getLogger(clazz);
        return new JsonLogger(logger);
    }
}
