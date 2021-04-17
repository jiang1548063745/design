package com.rorschach.pattern.adapter.passport;

import com.rorschach.pattern.adapter.passport.adapters.ILoginAdapter;
import com.rorschach.pattern.adapter.passport.adapters.LoginForTokenAdapter;

/**
 * @author Rorschach
 * @date 2021-4-17 0:57
 */
public class PassportAdapter implements IPassport{

    @Override
    public HttpMsg loginForToken(String token) {
        return processLogin(token, LoginForTokenAdapter.class);
    }

    @Override
    public HttpMsg loginForWeChat(String openId) {
        return null;
    }

    @Override
    public HttpMsg loginForTelephone(String telephone, String code) {
        return null;
    }

    private HttpMsg processLogin(String id, Class<? extends ILoginAdapter> clazz) {
        try {
            ILoginAdapter adapter = clazz.newInstance();

            if (adapter.support(adapter)) {
                return adapter.login(id, adapter);
            }
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    private void loginForRegistered(String username, String password) {

    }
}
