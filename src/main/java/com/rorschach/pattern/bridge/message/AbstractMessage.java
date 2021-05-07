package com.rorschach.pattern.bridge.message;

/**
 * @author Rorschach
 * @date 2021-4-18 13:09
 */
public abstract class AbstractMessage {

    private IMessage message;

    public AbstractMessage(IMessage message) {
        this.message = message;
    }

    public IMessage getMessage() {
        return message;
    }

    public void setMessage(IMessage message) {
        this.message = message;
    }

    void sendMessage(String message, String toUser) {
        this.message.send(message, toUser);
    }
}
