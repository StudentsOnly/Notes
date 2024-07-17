import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Your age? ");
        int age = input.nextInt();

        // Condition!
        if (age > 49) {
            System.out.println("Welcome to the Worst Casino Ever.");
            casino(input);
        } else {
            System.out.println("Access denied.");
        }

        System.out.println("End.");
    }

    private static void casino(Scanner input) {
        // Ask the user for their guess
        // Compare the user guess to the magic number
        // IF the guess is correct, tell the user
        // IF the guess is smaller, tell the user
        // IF the guess is larger, tell the user

        System.out.println("What number am I thinking about?");
        int guess = input.nextInt();
        int correct = -31337;

        if (guess == correct) {
            System.out.println("Congratulations! You won!");
        } else if (guess > correct) {
            System.out.println("Too big");
        } else {
            System.out.println("Too small");
        }
    }
}
