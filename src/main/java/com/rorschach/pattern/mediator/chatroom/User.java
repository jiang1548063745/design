package com.rorschach.pattern.mediator.chatroom;

/**
 * @author Rorschach
 * @date 2021-4-26 22:27
 */
public class User {

    private String name;

    private ChatRoom chatRoom;

    public User(String name) {
        this.name = name;
    }

    public User(String name, ChatRoom chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMsg(String msg) {
        this.chatRoom.showMsg(this, msg);
    }
}
