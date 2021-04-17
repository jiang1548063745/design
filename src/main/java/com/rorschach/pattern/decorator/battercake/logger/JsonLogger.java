package com.rorschach.pattern.decorator.battercake.logger;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;

import java.util.Arrays;

/**
 *
 * @author Rorschach
 * @date 2021-4-13 22:41
 */
public class JsonLogger extends LoggerDecorator{

    public JsonLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void info(String s) {
        JSONObject jsonObject = newJsonObject();
        jsonObject.put("message", s);
        logger.info(jsonObject.toString());
    }

    @Override
    public void error(String s) {
        JSONObject jsonObject = newJsonObject();
        jsonObject.put("error", s);
        logger.info(jsonObject.toString());
    }

    public void error(Exception e) {
        JSONObject jsonObject = newJsonObject();
        jsonObject.put("exception", e.getClass().getName());
        String trace = Arrays.toString(e.getStackTrace());
        jsonObject.put("starckTrace", trace);
        logger.info(jsonObject.toString());
    }

    private JSONObject newJsonObject() {
        return new JSONObject();
    }
}
