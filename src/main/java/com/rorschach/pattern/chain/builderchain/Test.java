package com.rorschach.pattern.chain.builderchain;

/**
 * @author Rorschach
 * @date 2021-4-20 22:00
 */
public class Test {

    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        memberService.login("Test", "123");
    }
}
