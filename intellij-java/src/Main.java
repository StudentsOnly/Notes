public class Main {

    public static void main(String[] args) {
        System.out.print("Program "); // Shortcut: sout
        System.out.println("Starting");

        String name = "Xiao"; // Declare a variable and assign it a value
        name = "Bardha"; // Reassign variable to a new value

        System.out.println(name);

        var message = "Hello " + name;   // Declare new variable, assign value

        System.out.println(message);

        greet();
        greet();
    }

    public static void greet() {
        System.out.println("Greeting 1");
        System.out.println("Greeting 2");

        // System.out.println(name); -- Note: cannot access local variables from other methods
    }

}
