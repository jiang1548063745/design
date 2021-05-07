package com.rorschach.pattern.chain.optimize;

import com.rorschach.pattern.chain.Member;

/**
 * @author Rorschach
 * @date 2021-4-20 21:56
 */
public class MemberService {

    public void login(String loginName, String loginPass) {
        Handler validateHandler = new ValidateHandler();
        Handler loginHandler = new LoginHandler();
        Handler authHandler = new AuthHandler();

        validateHandler.next(loginHandler);
        loginHandler.next(authHandler);

        validateHandler.doHandler(new Member(loginName, loginPass));
    }
}
