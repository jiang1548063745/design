package com.rorschach.pattern.chain.builderchain;

import com.rorschach.pattern.chain.Member;

/**
 * @author Rorschach
 * @date 2021-4-20 21:52
 */
public class LoginHandler extends Handler {
    @Override
    public void doHandler(Member member) {
        System.out.println("登陆成功");

        member.setRoleName(AuthHandler.ADMIN);

        next.doHandler(member);
    }
}
