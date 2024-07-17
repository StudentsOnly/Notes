import java.nio.file.Files;
import java.nio.file.Path;

public class Logfile {
    private Path logPath;

    public Logfile(String pathToFile) {
        this.logPath = Path.of(pathToFile);
    }

    public void log(String message) throws Exception {
        // If the file does not exist, create it
        if (!Files.exists(this.logPath)) {
            Files.createFile(this.logPath);
        }

        // 1. Read the contents of the file
        String s = Files.readString(this.logPath);

        // 2. Add "message" to that contents
        s = s + "\n" + message;

        // 3. Write the contents to the file
        Files.writeString(this.logPath, s);
    }
}
