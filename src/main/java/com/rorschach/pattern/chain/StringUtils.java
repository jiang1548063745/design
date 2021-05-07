package com.rorschach.pattern.chain;

/**
 * @author Rorschach
 * @date 2021-4-20 21:48
 */
public class StringUtils {

    public static boolean isEmpty(final CharSequence cs) {
        return cs == null || cs.length() == 0;
    }
}
