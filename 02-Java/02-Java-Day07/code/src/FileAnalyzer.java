import java.nio.file.Files;
import java.nio.file.Path;

public class FileAnalyzer {
    public static void main(String[] args) throws Exception {
        String filePath = "analyze-this.txt";
        Path pathToFile = Path.of(filePath);

        String contents = Files.readString(pathToFile);
        String[] lines = contents.split("\n");

        for (int n = 0; n < lines.length; n++) {
            String line = lines[n];
            if (line.startsWith("-")) {
                System.out.println(line);
            }
        }
    }
}
