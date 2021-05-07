package com.rorschach.pattern.bridge.message;

/**
 * 消息抽象
 * @author Rorschach
 * @date 2021-4-18 13:03
 */
public interface IMessage {

    /**
     * 发送消息
     * @param message 消息内容
     * @param toUser  接收人
     */
    void send(String message, String toUser);
}
