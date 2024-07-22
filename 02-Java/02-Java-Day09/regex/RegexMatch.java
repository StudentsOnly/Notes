import java.util.regex.Pattern;

public class RegexMatch {

    public static void main(String[] args) {
        System.out.println("----------------------");
        simpleMatch("potato");                  // TRUE
        simpleMatch("Potato");                  // FALSE
        simpleMatch("Spicy potato snack");      // FALSE

        System.out.println("----------------------");
        flexibleMatch("potato");                // TRUE
        flexibleMatch("Potato");                // TRUE
        flexibleMatch("PotatO");                // TRUE
        flexibleMatch("potatO");                // TRUE
        flexibleMatch("POTATO");                // FALSE
        flexibleMatch("Spicy potato snack");    // FALSE

        System.out.println("----------------------");
        // I want to check specific kinds of phone numbers for the UK only
        phoneNumberCheck("+44 01234567890");    // TRUE
        phoneNumberCheck("+4401234567890");     // TRUE
        phoneNumberCheck("044 01234567890");    // TRUE
        phoneNumberCheck("04401234567890");     // TRUE
        phoneNumberCheck("0440123456789");      // FALSE
        phoneNumberCheck("+44012345678901");    // FALSE
        phoneNumberCheck("+44 012 345 678 90"); // FALSE
        phoneNumberCheck("+44-01234567890");    // FALSE
        phoneNumberCheck("+44  01234567890");   // FALSE

        System.out.println("----------------------");
        somewhereMatch("potato");               // TRUE
        somewhereMatch("potatox");              // TRUE
        somewhereMatch("Spicy potato snack");   // TRUE
        somewhereMatch("Potato");               // TRUE
        somewhereMatch("TOMATO potaato POTATO");// FALSE

        // Challenge: make a regex matching pattern method for the following
        challengeMatch("Potato"); // TRUE
        challengeMatch("Tomato"); // TRUE
        challengeMatch("potatoe"); // TRUE
        challengeMatch("Automaton"); // TRUE
        challengeMatch("Don't trust Atoms, they make up everything"); // TRUE
        challengeMatch("Tattoo"); // FALSE
        challengeMatch("Potate"); // FALSE
    }

    private static void challengeMatch(String input) {
        String pattern = ".*[Aa]to.*";
        // Here, "." means any character whatsoever
        // Here, "*" means the previous character zero or more times
        // Together, ".*" means any character zero or more times
        boolean match = Pattern.matches(pattern, input);
        System.out.println("Pattern " + pattern + " matches " + input + "? " + match);
    }

    private static void somewhereMatch(String input) {
        String pattern = ".*[pP]otato.*";
        // Here, "." means any character whatsoever
        // Here, "*" means the previous character zero or more times
        // Together, ".*" means any character zero or more times
        boolean match = Pattern.matches(pattern, input);
        System.out.println("Pattern " + pattern + " matches " + input + "? " + match);
    }

    private static void phoneNumberCheck(String input) {
        String pattern = "[+0]44 ?[0-9]{11}";

        // "[+0]44" -- Matches +44 or 044
        // " ?" -- Matches " " or "", the ? means that the previous character is optional
        // " ?" -- Matches " " or "", the ? means that the previous must be included zero or one times
        // "[0-9]" -- Matches any digit
        // "{11}" -- means that the previous character or class of characters must be repeated 11 times

        boolean match = Pattern.matches(pattern, input);
        System.out.println("Pattern " + pattern + " matches " + input + "? " + match);
    }

    private static void flexibleMatch(String input) {
        String pattern = "[pP]otat[oO]";
        boolean match = Pattern.matches(pattern, input);
        System.out.println("Pattern " + pattern + " matches " + input + "? " + match);
    }

    private static void simpleMatch(String input) {
        String pattern = "potato";
        boolean match = Pattern.matches(pattern, input);
        System.out.println("Pattern " + pattern + " matches " + input + "? " + match);
    }

}