import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Date;

public class FileLogger implements Closeable {

	private OutputStreamWriter logWriter;

	public FileLogger(File file) throws FileNotFoundException {
		logWriter = new OutputStreamWriter(new FileOutputStream(file, true));
	}

	public void log(String message) {
		// logWriter.write(timestamp + ": " + message + '\n');
	}

	@Override
	public void close() throws IOException {
		logWriter.close();
	}
}
