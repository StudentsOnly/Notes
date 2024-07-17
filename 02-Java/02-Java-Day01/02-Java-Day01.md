# Java 01

**TODAY**
- LOTS OF CODING!
- Method that takes in a parameter!
- User inputs that are not just Strings!
- Conditionals!
- Math operators!
- Oh my!

## User Inputs

- Right away, let's do a mini exercise
    - Create a new project folder called `java-calc` in your projects folder BY RUNNING
        1. Open IntelliJ IDEA
        2. Go to File > New > Project
    - Create `InputTest.java` in the `src` folder
        - Inside, ask the user for their name and print out "Hello, {{name}}"

- Let's learn new stuff by coding :)

- Escape sequences / escape characters
    - \t and \n are "escape sequences"
    - The "\" is an escape character

- Let's learn an amazing shortcut
    - "Go to Declaration or Usages" Ctrl+B
    - "Navigate Back" Ctrl+Alt+Leftarrow (problematic in Ubuntu); instead show back button

## Conditionals

- What does "Write once, run anywhere" mean for Java?

- I have a puzzle for you
    - Here's a file
    - You start with 20 IIPs
    - Keep track of your own IIPs
    - Post your IIP count after you first find the magic number into the thread

- The game asks for a number
    - It then compares your input to a secret number 
    - IF your number is the same as the secret, you win
    - IF your number is smaller, you lose
    - IF your number is bigger, you lose

- The program does different things depending on a **condition**
    - This is also called Control flow
    - Your code controls the "flow" of the program; which instructions are run

- **Conditionals** aka **if** statements

- We could have built the whole thing into the main function
    - But the code would have been deeply nested and hard to read
    - Nesting = many statements inside each other
    - Having small methods, you keep each method a manageable size

- Let's examine

    ```java
    if (guess == correct) {
        System.out.println("Correct. You win 17 imaginary internet points.");
    }
    ```

    - The `guess == correct` is the "condition"
        - Try out `var potato = guess == correct;`

        - What is the data type of "potato"?
        - Conditions can be any Java statement that resolves into a boolean

    - These can be often represented as flowcharts

    - Flowcharts are super common when designing an application
        - In practice they rarely go to the level of individual `if` statements
        - https://ddg.gg/?q=!i+flowchart

- You can also do conditionals with a `switch` statement
    - They can be nice if you have LOTS of conditions
    - They can be nice if you have many conditions do the same thing
    - Note: `switch` statements are often used with `enums`
        - You will cover enums later :)

## Conditionals using `if`

```java
if (condition) {
    // code to run if condition is True
} else {
    // code to run if condition is False
}
```

## Conditionals using `switch`

```java
switch (variableToExamine) {
    case comparisonValueA:
        // code to run if variableToExamine matches comparisonValueA
        break;
    case comparisonValueB:
        // code to run if variableToExamine matches comparisonValueB
        break;
    case comparisonValueX:
    case comparisonValueY:
        // code to run if variableToExamine matches comparisonValueX or comparisonValueY
        break;
    default:
        // code to run if none of the cases match `variableToExamine`
        break;
}
```

## Conditionals using a `ternary` 

- "Ternaries" are used mostly when assigning a value to a variable based on a condition

```java
String msg = numba > 10 ? "Your Numba is BIG" : "Your Numba is SMOL";
```

- The term "Ternary" comes from "three"
    - There are three things in play; 
        1. Condition
        2. Option if true
        3. Option if false

## Math operators

- Finally, let's practice math operations in Java
    - `a > b`               - greater than comparison operator
 

 ## Execises

- **Calculatr** https://classroom.github.com/a/-cFtAW3p

- **Simplified Roulette at the Terrible Casino** https://classroom.github.com/a/JjyjBLXj


