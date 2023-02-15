import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4jExample {
    private static final Logger logger = Logger.getLogger(Log4jExample.class);

    public static void main(String[] args) {
        PropertyConfigurator.configure("src/main/resources/log4j.properties");
        logger.fatal("fatal log message");
        logger.error("error log message");
        logger.warn("warn log message");
        logger.debug("debug log message");
        logger.trace("trace log message");
        logger.info("info log message");
    }
}
