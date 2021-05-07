package com.rorschach.pattern.mediator.chatroom;

/**
 * @author Rorschach
 * @date 2021-4-26 22:30
 */
public class Test {

    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        User tom = new User("tom", chatRoom);

        User jerry = new User("jerry", chatRoom);

        tom.sendMsg("This is Tom");

        jerry.sendMsg("This is Jerry");
    }
}
