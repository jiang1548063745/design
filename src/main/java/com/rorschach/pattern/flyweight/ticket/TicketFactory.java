package com.rorschach.pattern.flyweight.ticket;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Rorschach
 * @date 2021-4-14 20:18
 */
public class TicketFactory {

    private static final Map<String, ITicket> pool = new ConcurrentHashMap<>();

    public static ITicket queryTicket(String from, String to) {
        String cacheKey = from + "->" + to;
        if (pool.containsKey(cacheKey)) {
            System.out.println("查询到缓存: " + cacheKey);

            return pool.get(cacheKey);
        }

        System.out.println("缓存池中未查询到对象: " + cacheKey);
        ITicket ticket = new TrainTicket(from, to);
        pool.put(cacheKey, ticket);
        return ticket;
    }
}
