package com.rorschach.pattern.chain.builderchain;

import com.rorschach.pattern.chain.Member;
import com.rorschach.pattern.chain.StringUtils;

/**
 * @author Rorschach
 * @date 2021-4-20 21:46
 */
public class ValidateHandler extends Handler {
    @Override
    public void doHandler(Member member) {
        if (StringUtils.isEmpty(member.getLoginName()) || StringUtils.isEmpty(member.getLoginPass())) {
            System.out.println("用户名或者密码为空");

            return;
        }

        System.out.println("用户名和密码不为空");

        next.doHandler(member);
    }
}
