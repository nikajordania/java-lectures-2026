package lecture_4.logging;

import java.io.IOException;
import java.util.logging.*;

public class LogstashSocketLogger {
    private static final Logger logger = Logger.getLogger(LogstashSocketLogger.class.getName());

    static {
        try {
            SocketHandler socketHandler = new SocketHandler("localhost", 5000);
            socketHandler.setFormatter(new JSONFormatter());
            logger.addHandler(socketHandler);
            logger.setLevel(Level.ALL);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        logger.info("Application started");
        logger.warning("This is a warning message123");

        try {
            throw new RuntimeException("Test Exception");
        } catch (RuntimeException e) {
            logger.warning("sdasdmafkskgpg message");

            logger.log(Level.SEVERE, "An error occurred", e);
        }
    }
}
