## Java Module Day 5 - Lesson Notes & Code! :blush:

### For Loop ➿

#### Structure
A `for` loop in Java has a specific structure and is typically used when the number of iterations is known. Its structure includes three main parts:
1. **Initialization**: This part is executed once before the loop starts. It is used to initialize loop control variables.
2. **Condition**: This boolean expression is tested before each iteration. If the condition is `true`, the loop continues; if `false`, the loop terminates.
3. **Increment/Decrement**: This part is executed after each iteration and is usually used to update the loop control variables.

#### Example

```java
for (int i = 0; i < 5; i++) { // for (initialization; condition; increment)
    System.out.println("i: " + i);
}
```
- **Initialization**: `int i = 0`
- **Condition**: `i < 5`
- **Increment**: `i++`

#### Infinite For Loop
A `for` loop can run indefinitely if the condition is always `true`. This can be useful in some scenarios like continuously listening for events or waiting for a condition to change externally.

```java
for (;;) {
    System.out.println("This will run forever");
}
```

### Control Keywords

#### Break
The `break` statement is used to exit from the loop immediately, regardless of the loop condition. It is often used within conditional statements inside the loop.

#### Example

```java
for (int n = 0; n < 10; n++) {
    if (n == 5) {
        break; // Exit the loop when n is 5
    }
    System.out.println(n);
}
```

#### Continue
The `continue` statement skips the current iteration and proceeds with the next iteration of the loop. It is useful when you want to skip certain iterations based on a condition.

#### Example

```java
for (int n = 0; n < 10; n++) {
    if (n == 5) {
        continue; // Skip the iteration when n is 5
    }
    System.out.println(n);
}
```

#### Return
The `return` statement exits the entire method, not just the loop. When a `return` statement is encountered, the method stops executing and returns control to the caller.

#### Example

```java
public class Main {
    public static void main(String[] args) {
        for (int n = 0; n < 10; n++) {
            if (n == 5) {
                return; // Exit the entire main method when n is 5
            }
            System.out.println(n);
        }
        System.out.println("This will not be printed if n reaches 5");
    }
}
```

#### Loop Variables
- **Scope**: Loop variables declared in the for loop are limited to the loop's scope.
- **Multiple Variables**: You can declare and update multiple variables in the initialization and increment sections of the loop.

#### Break vs Continue vs Return
- **Break**: Exits the loop entirely and moves to the statement immediately following the loop.
- **Continue**: Skips the rest of the code inside the loop for the current iteration and proceeds with the next iteration.
- **Return**: Exits the current method, which may terminate the loop if the loop is inside that method.
