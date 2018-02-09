package com.wmz.common.util;

import com.wmz.common.exception.CheckException;
import org.springframework.context.MessageSource;

import java.util.Locale;

/**
 * Created by wmz on 2018/2/7.
 * 校验
 *
 * @author wmz
 */
public class CheckUtils {

    private static MessageSource messageSource;

    public static void check(boolean condition, String msgKey, Object... args) {
        if (!condition) {
            fail(msgKey, args);
        }
    }

    public static void notEmpty(String str, String msgKey, Object... args) {
        if (str == null || str.isEmpty()) {
            fail(msgKey, args);
        }
    }

    public static void notNull(Object obj, String msgKey, Object... args) {
        if (obj == null) {
            fail(msgKey, args);
        }
    }

    public static void greaterThanZero(boolean condition, String msgKey, Object... args) {
        if (!condition) {
            fail(msgKey, args);
        }
    }

    private static void fail(String msgKey, Object... args) {
        throw new CheckException(messageSource.getMessage(msgKey, args, Locale.CHINESE));
    }

}
