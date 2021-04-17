package com.rorschach.pattern.flyweight.ticket;

/**
 * @author Rorschach
 * @date 2021-4-14 20:37
 */
public class Test {

    public static void main(String[] args) {
        ITicket ticket = TicketFactory.queryTicket("武汉", "九江");
        ticket.showInfo("硬卧");

        ticket = TicketFactory.queryTicket("武汉", "九江");
        ticket.showInfo("软卧");

        ticket = TicketFactory.queryTicket("武汉", "九江");
        ticket.showInfo("硬卧");
    }
}
