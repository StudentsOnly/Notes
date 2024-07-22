import java.nio.file.Files;
import java.nio.file.Path;

public class RegexMethods {
    public static void main(String[] args) throws Exception {
        changeToHTTPS("Go to http://google.com or http://ddg.gg");

        removeDuplicateSpaces("This      is     a        test");

        splitToArr("cat,dog,capybara and guinea pig");


        writeTemplateToFile("Page title", 20);
    }

    private static void writeTemplateToFile(String title, int num) throws Exception {
        // Read in an HTML template file
        String template = Files.readString(Path.of("template.html"));

        // Replace placeholder content using Regex
        template = template.replaceAll("\\{\\{title}}", title);
        template = template.replaceAll( "\\{\\{number}}", ""+num);
        System.out.println(template);

        // Write the HTML to an output file
        Files.writeString(Path.of("output.html"), template);
    }

    private static void splitToArr(String input) {
        String[] parts = input.split(",| and ");

        // | (pipe symbol) means "OR" in regex

        for (int i = 0; i < parts.length; i++) {
            System.out.println(parts[i]);
        }
    }

    private static void removeDuplicateSpaces(String input) {
        String updated = input.replaceAll(" +", " ");
        System.out.println(updated);
    }

    private static void changeToHTTPS(String input) {
        String updated = input.replaceAll("http", "https");
        System.out.println(updated);
    }
}
