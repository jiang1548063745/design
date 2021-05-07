package com.rorschach.pattern.bridge.message;

/**
 * @author Rorschach
 * @date 2021-4-18 13:06
 */
public class SmsMessage implements IMessage{
    @Override
    public void send(String message, String toUser) {
        System.out.println("使用短信消息发送: " + message + " 给 " + toUser);
    }
}
