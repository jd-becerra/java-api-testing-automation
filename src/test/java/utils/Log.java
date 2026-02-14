package utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Utility class for logging messages using Log4j2.
 *
 * Provides convenience methods for info, debug, and error logging.
 */
public class Log {
    private static final Logger logger = LogManager.getLogger();

    /**
     * Logs an informational message.
     *
     * @param msg Message to log
     */
    public static void info(String msg) {
        logger.info(msg);
    }

    /**
     * Logs a debug message.
     *
     * @param msg Message to log
     */
    public static void debug(String msg) {
        logger.debug(msg);
    }

    /**
     * Logs an error message.
     *
     * @param msg Message to log
     */
    public static void error(String msg) {
        logger.error(msg);
    }

    /**
     * Logs a warn message.
     *
     * @param msg Message to log
     */
    public static void warn(String msg) {
        logger.warn(msg);
    }
}
