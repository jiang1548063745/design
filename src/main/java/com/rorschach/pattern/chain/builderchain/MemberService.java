package com.rorschach.pattern.chain.builderchain;

import com.rorschach.pattern.chain.Member;

/**
 * @author Rorschach
 * @date 2021-4-20 21:56
 */
public class MemberService {

    public void login(String loginName, String loginPass) {
       Handler.Builder<?> builder = new Handler.Builder<>();
       builder.addHandler(new ValidateHandler())
               .addHandler(new LoginHandler())
               .addHandler(new AuthHandler());

        builder.build().doHandler(new Member(loginName, loginPass));
    }
}
