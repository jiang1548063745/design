package com.rorschach.pattern.adapter.passport.adapters;

import com.rorschach.pattern.adapter.passport.HttpMsg;
import com.rorschach.pattern.adapter.passport.PassportService;

/**
 * @author Rorschach
 * @date 2021-4-17 1:11
 */
public class LoginForTokenAdapter extends PassportService implements ILoginAdapter{
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTokenAdapter;
    }

    @Override
    public HttpMsg login(String id, Object adapter) {
        return null;
    }

    private HttpMsg loginForRegistered(String username, String password) {
        if (null == password) {
            password = "THIRD_LOGIN";
        }

        super.registered(username, password);
        return super.login(username, password);
    }
}
