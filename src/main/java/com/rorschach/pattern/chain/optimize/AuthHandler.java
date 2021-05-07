package com.rorschach.pattern.chain.optimize;

import com.rorschach.pattern.chain.Member;

/**
 * @author Rorschach
 * @date 2021-4-20 21:53
 */
public class AuthHandler extends Handler {
    public static final String ADMIN  = "admin";

    @Override
    public void doHandler(Member member) {
        if (!ADMIN.equals(member.getRoleName())) {
            System.out.println("您不是管理员 无操作权限");
            return;
        }
        System.out.println("允许操作");
    }
}
