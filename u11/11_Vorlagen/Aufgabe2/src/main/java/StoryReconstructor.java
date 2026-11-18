import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class StoryReconstructor {
	static void main() throws URISyntaxException {
		Map<Integer, String> story = new TreeMap<>();
		List<String[]> lines = new ArrayList<>();
        Path inputPath = Path.of(Objects.requireNonNull(StoryReconstructor.class.getResource("./story-input.txt")).toURI());

        try {
			lines = Files.readAllLines(inputPath)
					.stream()
					.map(line -> line.split("=", 2))
					.toList();
		} catch (IOException e) {
            IO.println("Could not read the input file!");
        }
        for (String[] line: lines) {
			story.put(Integer.valueOf(line[0]), line[1]);
		}

		String outputFile = IO.readln("File to save the story to: ");
		try {
			Files.writeString(Path.of(outputFile), String.join(" ", story.values()));
		} catch (IOException e) {
			IO.println("Could not write to the output file!");
        }
	}
}
