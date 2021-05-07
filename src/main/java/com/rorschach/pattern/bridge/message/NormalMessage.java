package com.rorschach.pattern.bridge.message;

/**
 * @author Rorschach
 * @date 2021-4-18 13:07
 */
public class NormalMessage extends AbstractMessage {

    public NormalMessage(IMessage message) {
        super(message);
    }

    @Override
    void sendMessage(String message, String toUser) {
        message = "[普通]" + message;
        super.sendMessage(message, toUser);
    }
}
