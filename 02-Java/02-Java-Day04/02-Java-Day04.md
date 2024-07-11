## Java Module Day 4 - Lesson Notes & Code! :)

### Loops in Java

- **While Loop**: Repeats a block of code as long as a condition is true.
- **Do-While Loop**: Similar to the while loop, but it guarantees that the 'do' block of code is executed at least once.

#### Example: While Loop

```java
public class Main {
    public static void main(String[] args) {

        int value = 0;

        while(value < 10){
            System.out.println("Hello!" + value);
            value = value + 1;
        }
    }
}
```

#### Explanation:

- **Initialization**: `int value = 0;`
- **Condition**: `value < 10`
- **Iteration**: `value = value + 1`

The loop will print "Hello!" followed by the current value of `value` until `value` reaches 10.

#### More about While Loop:

- **Pre-Condition Loop**: The condition is checked before executing the loop's body. If the condition is false initially, the body of the loop will not execute even once.
- **Exit Condition**: Make sure the loop has an exit condition that will eventually make the condition false, otherwise, it will run indefinitely.
- **Infinite Loop**: If the condition never becomes false, it results in an infinite loop. For example:
  
 ```java
  while(true) {
      System.out.println("This will run forever");
  }
  ```

#### Example: Do-While Loop

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = 0;

        do {
            System.out.println("Enter a number: ");
            number = scanner.nextInt();
        } while(number != 5);

        scanner.close();
    }
}
```

#### Explanation:

- **Do Block**: Executes the code inside it at least once.
- **Condition**: Checked after the do block. If true, the loop continues.

The loop will keep prompting the user to enter a number until they enter 5.

#### More about Do-While Loop:

- **Post-Condition Loop**: The condition is checked after executing the loop's body. This ensures the body is executed at least once.
- **Difference from While Loop**: Unlike the `while` loop, the `do-while` loop guarantees that the code block runs at least once.
- **Infinite Loop**: Similar to the `while` loop, if the condition always evaluates to true, it results in an infinite loop. For example:

  ```java
  do {
      System.out.println("This will run forever");
  } while(true);
  ```

#### Example: Simple Password Validation with Do-While Loop

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String userPassword = "secured";
        Scanner scanner = new Scanner(System.in);
        String password = null;

        do {
            System.out.println("Please enter your password: ");
            password = scanner.nextLine();
        } while(!password.equals(userPassword));

        scanner.close();
        System.out.println("Access granted!");
    }
}
```

#### Explanation:

- **Initialization**: `String userPassword = "secured";`
- **Scanner**: Used to read user input.
- **Do-While Loop**: Prompts the user to enter a password until the correct password is entered.

The loop ensures that the password prompt is displayed at least once and continues to prompt until the correct password is provided.

#### Important Points to Remember

- **While Loop**: Checks the condition before executing the block of code. If the condition is false initially, the block of code is never executed.
- **Do-While Loop**: Executes the block of code at least once, then checks the condition.
