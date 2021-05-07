package com.rorschach.pattern.mediator.chatroom;

/**
 * @author Rorschach
 * @date 2021-4-26 22:26
 */
public class ChatRoom {

    public void showMsg(User user, String msg) {
        System.out.println("[" + user.getName() + ":" + msg + "]");
    }
}
