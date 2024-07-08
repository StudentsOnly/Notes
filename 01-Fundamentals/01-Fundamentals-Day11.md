# Fundamentals 11

- The code from today is in
    - [intellij-java](./intellij-java)

**TODAY**
- Java setup and tooling
- First look at actual Java code

- LOTS of information today
- You will review the words a LOT
- Don't worry if you don't 100% catch all the words and concepts yet :)

## Java as a programming language

- Java is a general-purpose programming language
    - Can be used to create a variety of different programs
    - Isn’t specialized for any specific problems


- Java is object-oriented
    - More on that later :)

- Java is a high-level language

    - Closer to human language than machine language
    - From high level languages to low level languages (roughly estimated)
        - Python
        - Java
        - C++
        - Machine language
    - https://ddg.gg/?q=i!+abstraction+levels+of+programming+languages+site%3Aresearchgate.net


- A little bit more complex than Python (my personal estimation)
- Not as complex as C++

- Only machine code runs "directly" on your hardware
- Other languages get somehow converted into machine code

- There might be multiple layers of abstraction before a language becomes machine code

## Java is a *compiled* language

- JavaScript was *interpreted* by the browser when we ran it
- We cannot run Java like that directly

- Java programs are compiled into a secondary language
    - Compiled; converted
    - The secondary language is called "Bytecode"
    - Often this compile step is actually automated when working

- Machines that want to run Java programs must have Java installed
    - Developers install **JDK** - Java Development Kit
    - Regular machines install **JRE** - Java Runtime Environment
    - Everything is built around **JVM** - Java Virtual Machine

    - **JVM**
        - This is a program that actually runs the secondary language

    - **JRE**
        - This includes the JVM and additional libraries for running code
        - This is what is installed when you install Java on a machine
        - Contains *platform specific* capabilities

    - **JDK**
        - This includes the JRE (which includes the JVM)
        - This also includes developer tools, like a *compiler*
        - *Compiles* your Java code into the secondary language we talked about

- Let's compare theoretical workflows

- Theoretical Python workflow
    - You write your Python code
        - You run it as is on the target computer where it gets interpreted
        - Python doesn't have a compilation step at all!

- Theoretical C++ workflow
    - You write your C++ code
        - You compile one version for x86 Windows devices
        - You compile one version for ARM Windows devices
        - You compile one version for ARM Android devices
        - You compile one version for Apple silicon ARM devices
        - You compile one version for RISC-V supercomputer devices
    - The compiled code can then be run on the intended system

- Theoretical Java workflow
    - You write your Java code
    - You compile it to Bytecode
    - The Bytecode gets run by the JRE
        - This could be an x86 Windows device
        - This could be an ARM Android device
        - This could be an Apple silicon ARM device
        - This could be a RISC-V supercomputer

- This is called "Write once, run anywhere"
    - Anything Windows-dependant is built into the Windows JRE
    - Anything Linux-dependant is built into the Linux JRE
    - Your bytecode is portable; platform-independent

- **Technically** the bytecode is interpreted by the JVM
    - So Some will say, that Java is both a compiled *and* an interpreted language

- Reality is more complex of course :)

- Sidenote on JVM
    - Other languages can compiled to the same bytecode as Java does
    - Kotlin, Scala, Groovy, ...
    - These programs will be run on the JVM just as if they were Java
    - They are called JVM languages because of that :)

## Pros of Java

- "Write once, run anywhere" as above
- Code runs faster than Python
- Very common and very stable
- Huge collection of existing tools and libraries
    - Tools that help with development
    - Libraries = helper tools that others have written for you
    - Java Ecosystem

- Being a compiled language, it helps you catch errors before running code

- Very large and stable ecosystem

    - LOTS of massive existing applications
    - Common in large-scale businesses, enterprises, governments
    - Used in mobile application development (Android)
    - Used in desktop application development
        - Minecraft
        - Runescape

- In demand with a good salary

## Hello Word: let's do Java programming

- FIRST; environment setup
    - Because we will *develop* java, let's install the JDK
    - `$ sudo apt install default-jdk`
    - `$ java --version`
    - `$ javac --version`

### EXAMPLE 0

```java
public class Demo {
  public static void main(String[] args) {
    System.out.println("Hello Java");
  }
}
```

## The Main Method

- The "main" method is a special method
    - It's the entry point; it's where the program begins execution
    - The JVM calls this method to start the application
    - It can then call other functions :)

- `public static void main(String[] argz) {...}`

    - public: access modifier
        - The "public" keyword allows JVM to see and identify the starting point

    - static: a non-access modifier
        - Allows calling the main() method without creating an object
        - More on this later :)

    - void: return type
        - In Java, every method has to specify a return type
        - "Void" tells the compiler that the main() returns nothing

    - main(String[] args): method name and arguments
        - Required for the `main` methods 

    - `String[] argz`
        - List of command line arguments
        - A group of strings, which is called a string array

## Bytecode

- A file that's no longer just editable text, it's a `binary` file format
    - Not meant for human editing :)

- But we can examine it _a little_
    - `$ file Foo.class`
    - `$ strings Foo.class`

### Terminology: Byte

- All files are made of binary data, ones and zeroes
- One value of `1` or `0` is one "bit"
- 8 bits form one "byte"

- Text files are files where these bytes simple text
    - 1 character text file is 2 bytes

- Text files are limited to content made from bytes that correspond to known text
    - Binary files can contain non-printable things

## IDE

- We will now switch to `IntelliJ IDEA Ultimate` for development
- Download and run

## Variables in Java

- Variables are declared and assigned values like in JS

- These variables are "local variables"
    - Declared inside a method
    - A local variable is only accessible inside the method that declared it

- There are also instance variables and class variables
    - More on those later :)

- If we don't assign a value right away, Java will give a default value
    - The value depends on the data type
    - But... normally you assign a value right away 

### Variable naming

- Java variable names are case sensitive
    - `money` is not the same as `Money` or `MONEY`

- Java variable names must start with a letter
    - Or `$` or `_`, but don't use them

- Variable names cannot be equal to reserved keywords in Java
    - Can't do `int void = 1;` - void is a special keyword!

- Variable naming is normally done with camelCase, like in JS
    - You'll see exceptions later

### Variable typing

- Variables are *statically typed*
    - The type is declared, and the type can't change
    - A String will always be a String

- Variables with `var` have their type **inferred**
    - When the code is **compiled** the Type is set
    - Based on what's on the right-hand side of the `=`
    - Fairly new feature of Java, introduced in Java 10

- Java variables can be "primitive" or "reference types"

- Primitive data types or just "primitives"
    - Primitives are the most basic data types and represent single values

- Java also provides "wrapper classes" for all primitive types
    - For using them as objects when needed - pretty rare
    - Again; more about "objects" later
    - Integer for `int`
    - Double for `double`

### The `null` value

- Represents nothingness
- In Java, null is the reserved keyword used in to represent a void reference
- The default value of any object, such as `String` or `Integer`
- We cannot assign null to primitive types; int, double, boolean

## Running processes

- While program is running, `$ ps a` to view all processes
    - Each program/process has a PID - process id
    - `$ kill 123` - ends the process "123" (normally)
    - `$ pkill chrome` - ends all "chrome" processes (normally)
