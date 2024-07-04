public class Primitives {
    // Shortcut: psvm
    public static void main(String[] args) {
        // For practice, let's declare all possible primitive variable types

        byte myByte;        // Tiny Whole numbers
        short myShort;      // Small Whole numbers
        int myInt = 777;    // Medium Whole numbers
        long myLong;        // Large Whole numbers :)

        float myFloat;      // Fractional numbers like ~1/3 or 3.1415962 or 0.3333333333333333333333333333334
        double myDouble;    // More accurate floats; 0.3333333333333333333333333333333333333333333333333333333333334

        boolean myBoolean;  // True or False
        char myChar = 'x';  // A single text character (technically two bytes)

        // Strings are basically just a list of `char`
        // String myString = "Wee wooo"; // ACTUALLY ['W', 'e', 'e', ' ', 'w'....]

        // Primitives with inferred types
        var foo = 'x';
        var bar = 15L;
        var baz = true;

        System.out.println(myInt);

        // int intPrimitive = null; ---- we cannot have specifically empty primitive types
        Integer intAsObject = null; // - we CAN have specifically empty reference types
        System.out.println(intAsObject);
    }
}
