import java.time.Instant;
import java.util.Date;

public class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        Instant timestamp = Instant.now();
        IO.println(timestamp + ": " + message);
    }
}
