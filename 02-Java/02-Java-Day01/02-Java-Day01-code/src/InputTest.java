import java.util.Scanner;

public class InputTest {
    /**
     * Logs a message to System.out
     * @param s String to log
     */
    public static void log(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        log("What is your name? ");
        var name = scanner.nextLine();
        log("Hello " + name);

        log("What is your favorite whole number?");
        var valueInt = scanner.nextInt(); // Crashes if input is not a whole number
        log("Your number is " + valueInt);

        log("What is your favourite number with a decimal point?");
        var valueFloat = scanner.nextFloat();
        log("Your number is " + valueFloat);

        log("Enter a boolean!");
        var valueBoolean = scanner.nextBoolean(); // Allows upper and lowercase values
        log("Your boolean is " + valueBoolean);

        // Variables typed with `var` - what was this technique called?
        // Indirect declaration
        // Type has to be known at compile time
        // "Type inference" -- The type is "inferred" from the right-hand side of `=`

        log(
            "\t" + name + "\n" +
              "\t" + valueInt + "\n" +
              "\t" + valueFloat + "\n" +
              "\t" + valueBoolean + "\n"
        );

        String coolName = "Angela \"Mutti\" Merkel";

        // \t and \n are "escape sequences"
        // The "\" is an escape character
        // \t represents a tab character
        // \n represents a newline character


        scanner.close();
    }
}
