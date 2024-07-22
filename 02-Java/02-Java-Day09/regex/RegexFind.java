import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexFind {

    public static void main(String[] aqgzas) {
        findHashtags("I love #java and #python and #javascript");

        findMultipleX("I'm Maxx and I like Snaxx!");
        findMultipleX("I'm Max and I like Snax.");
        findMultipleX("I'm a hacker that haxxxxx");

        findEmails("My email is coolzero91@gmail.com - hit me up!");
        findEmails("My insta is @cat.lady.uk and snap @catladyuk");
    }

    private static void findEmails(String input) {
        String patternStr = "[a-zA-Z0-9\\.]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9][a-zA-Z0-9]+";
        // "[a-zA-Z0-9\\.]+" -- matches any alphanumeric character OR literal "." one or more times
        // @ -- matches the literal "@" symbol
        // [a-zA-Z0-9]+ -- matches any alphanumeric character one or more times
        // \\. -- matches the literal .
        // [a-zA-Z0-9] -- matches any alphanumeric character one time
        // [a-zA-Z0-9]+ -- matches any alphanumeric character one or more times
        Pattern pattern = Pattern.compile(patternStr);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println("Found email: " + matcher.group());
        }
    }

    private static void findMultipleX(String input) {
        String patternStr = "xx+";
        Pattern pattern = Pattern.compile(patternStr);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println("Found Multiple X: " + matcher.group());
        }
    }

    private static void findHashtags(String input) {
        String patternStr = "#[a-zA-Z]+";
        Pattern pattern = Pattern.compile(patternStr);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println("Found hashtag " + matcher.group());
        }
    }
}
