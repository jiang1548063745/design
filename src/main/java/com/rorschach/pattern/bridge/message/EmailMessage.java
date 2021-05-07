package com.rorschach.pattern.bridge.message;

/**
 * @author Rorschach
 * @date 2021-4-18 13:04
 */
public class EmailMessage implements IMessage{
    @Override
    public void send(String message, String toUser) {
        System.out.println("使用邮件消息发送: " + message + " 给 " + toUser);
    }
}
