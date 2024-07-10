## Java Module Day 3 - Lesson Notes & Code! :)

### Introduction
In this lesson, we covered the basics of Java classes, objects, methods, and the difference between pass-by-value and pass-by-reference. We also touched on constructors, getters and setters, toString method, and recursion.

### Classes and Objects
- A class is a blueprint for creating objects.

### Methods and Parameters
- Methods perform actions; they can take parameters and return values.
- Parameters can be primitive types (e.g., `int`, `double`) or reference types (e.g., objects).

### Pass-by-Value vs. Pass-by-Reference
- In Java, primitive types are passed by value. This means a copy of the value is passed to the method.
- Objects are passed by reference. This means a copy of the reference (address) is passed.

### Example: Passing by value vs Passing by reference
```java
public class App {
    public static void main(String[] args) {
        App app = new App();
        int value = 8;
        System.out.println("1. Value is: " + value);

        app.display(value);
        System.out.println("4. Value is: " + value);

        Person person = new Person("John");
        System.out.println("1. Person is: " + person);
        app.display(person);
        System.out.println("4. Person is : " + person);
    }

    public void display(Person person){
        System.out.println("2. Person is : " + person);
        person.setName("Sue");
        person = new Person("Mike");
        System.out.println("3. Person is : " + person);
    }

    public void display(int value) {
        System.out.println("2. Value is: " + value);
        value = 9;
        System.out.println("3. Value is: " + value);
    }
}
```

### Constructors
- A constructor is used to create an object of a class.
- It has the same name as the class and no return type, not even `void`.
- Constructors initialize the new object and set up initial conditions or properties.
- If no constructor is defined, Java provides a default no-argument constructor.

#### Example:
```java
public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Person{" + "name='" + name + '\'' + '}';
    }
}
```
- The `Person` class has a constructor that initializes the `name` property.
- The `toString` method helps print the actual values of the object.

### Recursion
- Recursion is when a method calls itself.
- It is often used for tasks that can be divided into similar subtasks.

#### Example:
```java
public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(15));
    }

    public static int factorial(int value) {
        if (value == 1) {
            return 1;
        }
        return factorial(value - 1) * value; // Recursion
    }
}
```
- The `factorial` method calculates the factorial of a number using recursion.

### Key Takeaways
1. **Classes and Objects**: Understand the relationship between classes and objects.
2. **Methods**: Learn how methods work with parameters.
3. **Pass-by-Value vs. Pass-by-Reference**: Know the difference and how it affects method behavior.
4. **Constructors**: Learn how to create objects using constructors.
5. **Recursion**: Understand how recursion works and how to identify recursive cases.
