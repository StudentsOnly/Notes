public class Greeter {

    /**
     * This is a Javadoc Documentation comment.
     *
     * @author Joel Peltonen
     * @param args CLI arguments
     * @return nothing
     */
    public static void main(String[] args) {
        greet();
        greet();
        greet();
        greet();
        greet(); // Ctrl+d to duplicate line faster :)
        // This is a comment :-)
        // Anything on the left side of the // is ignored

        /*
        This is a multi-line comment
        Everything inside is ignored

        :-)
        */
    }

    /**
     * Prints greetings into the system out.
     */
    public static void greet() {
        System.out.println("Greetings");
    }
}
