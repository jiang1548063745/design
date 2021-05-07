package com.rorschach.pattern.bridge.message;

/**
 * @author Rorschach
 * @date 2021-4-18 13:07
 */
public class UrgencyMessage extends AbstractMessage{

    public UrgencyMessage(IMessage message) {
        super(message);
    }

    @Override
    void sendMessage(String message, String toUser) {
        message = "[加急]" + message;
        super.sendMessage(message, toUser);
    }

    public Object watch(String message) {
        return null;
    }
}
