package Util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogUtil {
    public static void debug(Class<?> clazz, String message) {
        Logger classLogger = LogManager.getLogger(clazz);
        classLogger.debug(message);
    }

    public static void info(Class<?> clazz, String message) {
        Logger classLogger = LogManager.getLogger(clazz);
        classLogger.info(message);
    }

    public static void warn(Class<?> clazz, String message) {
        Logger classLogger = LogManager.getLogger(clazz);
        classLogger.warn(message);
    }

    public static void error(Class<?> clazz, String message) {
        Logger classLogger = LogManager.getLogger(clazz);
        classLogger.error(message);
    }
}
