import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileCopy {

    static void main() throws IOException {
        String fileNameFrom = IO.readln("Enter file to copy: ");
        while (!Files.exists(Path.of(fileNameFrom))) {
            IO.println(fileNameFrom + " doesn't exist!");
            fileNameFrom = IO.readln("Enter valid file to copy: ");

        }
        String fileNameTo = IO.readln("Enter target: ");
        while (Files.exists(Path.of(fileNameTo))) {
            IO.println(fileNameTo + " already exists!");
            fileNameTo = IO.readln("Enter valid file to copy to: ");
        }

        copyFile(fileNameFrom, fileNameTo);
    }

    private static void copyFile(String fileNameFrom, String fileNameTo) throws IOException {
        Path source = Path.of(fileNameFrom);
        Path dest = Path.of(fileNameTo);
        Files.copy(source, dest);
    }
}
