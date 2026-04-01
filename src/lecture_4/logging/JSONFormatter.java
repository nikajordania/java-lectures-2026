package lecture_4.logging;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class JSONFormatter extends Formatter {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");

    @Override
    public String format(LogRecord record) {
        String timestamp = dateFormat.format(new Date(record.getMillis()));
        String threadName = Thread.currentThread().getName();

        return String.format("""
                { "timestamp": "%s","logLevel": "%s","loggerName": "%s","app": "test-log","threadName": "%s","message": "%s" }
                """, timestamp, record.getLevel(), record.getLoggerName(), threadName, record.getMessage());
    }
}
