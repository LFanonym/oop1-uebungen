import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.time.Instant;

public class FileLogger implements Closeable, Logger {

	private OutputStreamWriter logWriter;

	public FileLogger(File file) throws FileNotFoundException {
		logWriter = new OutputStreamWriter(new FileOutputStream(file, true));
	}

	public void log(String message) {
		Instant timestamp = Instant.now();
		try {
			logWriter.write(timestamp + ": " + message + '\n');
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void close() throws IOException {
		logWriter.close();
	}
}
