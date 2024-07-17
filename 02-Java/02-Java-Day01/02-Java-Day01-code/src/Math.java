public class Math {
    public static void main(String[] args) {

        // Basic math operators -- Binary operators
        var a = 1 + 1;
        var b = 1 - 1;
        var c = 10 * 3;
        double d = 10.0 / 3;
        System.out.println(d);

        // Unary Increment operations / operators
        int i = 0;
        System.out.println(i);     // 0
        i++; // Increment by one -- exactly the same as `i = i + i;`

        System.out.println(i);      // 1
        System.out.println(i++);    // 1
        System.out.println(i++);    // 2
        System.out.println(i);      // 3

        // Unary Decrement operations / operators
        int j = 6;
        j--;
        j--;
        System.out.println("--------J is: " + j);

        // Incrementing and Decrementing and Multiplying assignment operators
        int k = 1000;
        k += 5;     // 1005 -- exactly the same as `k = k + 5;`
        k -= 100;   // 905 -- exactly the same as `k = k - 100;`
        k *= 2;     // 1810 -- exactly the same as `k = k * 2;`

        System.out.println(k);

        System.out.println("\n\n\n\n\n\n\n\n\n\n");

        // Finally, the Remainder or "Modulo" operator
        int l = 0;

        System.out.println(l++ % 3); // l is 0, remainder of l / 3 is 0
        System.out.println(l++ % 3); // l is 1, remainder of l / 3 is 1
        System.out.println(l++ % 3); // l is 2, remainder of l / 3 is 2
        System.out.println(l++ % 3); // l is 3, remainder of l / 3 is 0
        System.out.println(l++ % 3); // l is 4, remainder of l / 3 is 1
        System.out.println(l++ % 3); // l is 5, remainder of l / 3 is 2
        System.out.println(l++ % 3); // l is 6, remainder of l / 3 is 0
        System.out.println(l++ % 3); // l is 7, remainder of l / 3 is 1
        System.out.println(l++ % 3); // l is 8, remainder of l / 3 is 2
        System.out.println(l++ % 3); // l is 9, remainder of l / 3 is 0
        System.out.println(l++ % 3); // l is 10, remainder of l / 3 is 1
        System.out.println(l++ % 3); // l is 11, remainder of l / 3 is 2

    }
}
