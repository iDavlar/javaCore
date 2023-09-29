package module8SOLID.singleton;

public class SingletonRunner {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance(LogLevel.WARN);
        logger = Logger.getInstance(LogLevel.INFO);


        for (LogLevel logLevel : LogLevel.values()) {
            logger.write(logLevel, logLevel.toString());
        }
    }
}
