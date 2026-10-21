import java.io.File;
import java.io.IOException;

public class LoggerUsage {

	private static void someOperation(Logger logger) {
		var randomNumber = Math.random();
		logger.log("Generated Number: " + randomNumber);
	}

	static void main() throws IOException {

		Logger nullLogger = new NullLogger();
		someOperation(nullLogger);

		Logger consoleLogger = new ConsoleLogger();
		someOperation(consoleLogger);

		FileLogger fileLogger = new FileLogger(new File("log.txt"));
		someOperation(fileLogger);
		fileLogger.close();
	}
}
