import java.util.Scanner;

public class FancyGreet {
    public static void main(String[] args) {
        // Prepare input scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        System.err.println("ERRORRROPROROR");

        System.out.println(args[0] + " " + name + "!");
        scanner.close();
    }
}
