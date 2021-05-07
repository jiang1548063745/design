package com.rorschach.pattern.bridge.message;

/**
 * @author Rorschach
 * @date 2021-4-18 13:15
 */
public class Test {

    public static void main(String[] args) {
        IMessage message = new SmsMessage();

        AbstractMessage abstractMessage = new NormalMessage(message);
        abstractMessage.sendMessage("加班申请", "李总");

        message = new EmailMessage();
        abstractMessage = new UrgencyMessage(message);
        abstractMessage.sendMessage("加班申请", "李总");
    }
}
