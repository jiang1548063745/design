package com.rorschach.pattern.adapter.passport.adapters;

import com.rorschach.pattern.adapter.passport.HttpMsg;

/**
 * @author Rorschach
 * @date 2021-4-17 1:03
 */
public interface ILoginAdapter {

    boolean support(Object adapter);

    HttpMsg login(String id, Object adapter);
}
