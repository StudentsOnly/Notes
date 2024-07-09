## Java Module - Day 2 Notes & Code

### Key Concepts

### 1. Method Overloading

- Method Overloading allows multiple methods to have the same name but different parameters.
- Methods are differentiated based on the number and type of parameters.
- Overloaded methods can provide different implementations based on different parameter lists.

### Example: Person Class

``` java
class Person {

    // Method with no parameters
    public void greet() {
        System.out.println("Hello");
    }

    // Method with one String parameter
    public void greet(String name) {
        System.out.println("Hello " + name);
    }

    // Method with one int parameter
    public void greet(int height) {
        System.out.println("Hello");
        if (height > 190) {
            System.out.println("You are tall!");
        }
    }

    // Method with one String and one int parameter
    public void greet(String name, int height) {
        System.out.println("Hello " + name);
        if (height > 190) {
            System.out.println("You are tall!");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        person.greet();               // Calls greet() - Output: "Hello"
        person.greet("John");         // Calls greet(String name) - Output: "Hello John"
        person.greet(200);            // Calls greet(int height) - Output: "Hello" followed by "You are tall!"
        person.greet("John", 180);    // Calls greet(String name, int height) - Output: "Hello John"
    }
}
```

### 2. Parameters in Java

#### What are Parameters?

- **Parameters** are variables that you can pass to a method to customize its behavior.
- **Method Parameters**: When defining a method, you specify parameters within the parentheses in the method signature.
- **Arguments**: When calling a method, you provide values, known as arguments, for these parameters.

#### Example

```java
public void greet(String name) {
    System.out.println("Hello " + name);
}
```

- In the above example, `name` is a parameter of the `greet` method.

#### How to Use Parameters

- **Define Parameters**: Specify the type and name of each parameter in the method definition.
- **Pass Arguments**: Provide actual values (arguments) when calling the method.

### Example: Calculator Class

```java
public class Calculator {

    // Method to square an integer
    int square(int value) {
        System.out.println("Received the value of " + value);
        return value * value;
    }

    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        Calculator calculator2 = new Calculator();
        int squared = calculator2.square(5);    // Calls square() with argument 5 - Output: "Received the value of 5" followed by 25
        System.out.println(squared);

        int added = calculator2.add(10, 20);    // Calls add() with arguments 10 and 20 - Output: 30
        System.out.println(added);
    }
}
```
#### Parameters Recap

- Parameters are used to pass information to methods.
- They allow methods to operate on different values.
- When calling a method, provide arguments that match the method's parameters in type and order.

### Important Points to Remember
- **Parameter Lists**: The difference in method signatures allows the compiler to differentiate between methods.
- **Consistent Naming**: Use meaningful method names and follow naming conventions like camelCase for readability and maintainability.
