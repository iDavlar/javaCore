package module8SOLID.singleton;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Logger {
    private static final File LOG_FILE = new File("log.txt");
    private static Logger instance;
    private final LogLevel LOG_LEVEL;

    private Logger(LogLevel logLevel) {
        this.LOG_LEVEL = logLevel;
    }

    public static Logger getInstance(LogLevel logLevel) {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger(logLevel);
                }
            }
        }
        return instance;
    }

    public void write(LogLevel logLevel, String text) {
        if (!checkLogLevel(logLevel)) {
            return;
        }

        try {
            createFile();
            addToFile(logLevel, text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private void addToFile(LogLevel logLevel, String text) throws IOException {
        synchronized (LOG_FILE) {
            try (FileWriter fw = new FileWriter(LOG_FILE, true);
                 BufferedWriter bw = new BufferedWriter(fw)) {
                bw.write(LocalDateTime.now() + " " + logLevel.toString() + " " + text + "\n");
            }
        }
    }

    private void createFile() throws IOException {
        if (!LOG_FILE.exists()) {
            synchronized (LOG_FILE) {
                if (!LOG_FILE.exists()) {
                    LOG_FILE.createNewFile();
                }
            }
        }
    }

    private boolean checkLogLevel(LogLevel logLevel) {
        return logLevel.ordinal() >= LOG_LEVEL.ordinal();
    }

}
