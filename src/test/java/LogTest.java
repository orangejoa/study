import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogTest {
    private Logger logger = LogManager.getLogger(LogTest.class);

    public void printLog() {
        logger.debug(LogTest.class.getName());
        logger.info(LogTest.class.getName());
        logger.warn(LogTest.class.getName());
        logger.error(LogTest.class.getName());
    }

    public static void main(String[] args) {
        LogTest logTest = new LogTest();
        logTest.printLog();
    }
}
