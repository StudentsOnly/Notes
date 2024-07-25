# Java Day 11 - Debugging

**TODAY**

- Review; classes, objects, methods
    - Live code a library
    - Our code will have a bug!
    - Our program crashes!

- Call stack
- Debugging
- Exercise

## Live coding a Library: review

- Our code is now at at https://github.com/dci-fbw-j-24-e02/java-debug-library/commit/920a68643483f2982ddd874cb8f5df83720c65b9
    - To see this in your local environment, you can clone the repo and then do
    - `$ git checkout 0e55630`
    - To return to the latest commit, you can do `$ git checkout main`

- At his stage, our program crashes!

```
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Book.getTitle()" because "book" is null
	at Library.borrow(Library.java:28)
	at Main.main(Main.java:22)
```

## Call Stack

- When a method calls another method it creates one layer in the "call stack"
- When an error happens and Java spits out a bunch of text
    - That's the call stack!

- Another call stack example
    - The first line defines:
    - 1. the error that happened: `java.lang.NullPointerException`
    - 2. the error message: `Cannot invoke method length() on null object`
    - Below those, you have the actual stack trace, which here is 5 lines
    - The last line is an internal line in Java, not from our code
        - Ignore that one :)

```
java.lang.NullPointerException: Cannot invoke method length() on null object
    at FileContentParser.countWords(FileContentParser.java:121)
    at FileReader.process(FileReader.java:33)
    at Main.readFile(Main.java:18)
    at Main.main(Main.java:25)
    at java.lang.Thread.run(Thread.java:748)
```

- A big program, lots of code, some kind of mistake... where to start looking for the bug?
- **Debugging**

## What is debugging?

- Debugging, is the process of
    1. Identifying a problem
    2. Isolating the source of the problem
    3. Either correcting the problem or finding a way to work around it

- Mainly debugging is the process of fixing a bug in a program
- BUT it's also useful for learning how a program works

### Debugging strategies

- Static analysis
    - The developer examines the code without executing the program

- Print debugging (also called tracing)
    - The developer watches live or recorded print statements and monitors flow
    - Basically you add `System.out.println(...);` lines and look at the log
    - Actually a legit thing to do, fast and SUPER easy
    - But... can get tricky if you have loops and complex code etc.

- IDE Debugging
    - The developer runs the program, their IDE attaches to the process
    - The developer can then pause the program in specific lines
    - The developer can examine the state of the program when it's paused
    - This is what people normally mean when they say "Debugging"

- CLI Debugging
    - Like IDE debugging, but on the terminal
    - And usually without a specific code editor

- Remote debugging
    - Like IDE debugging, but the application is not running on their machine
    - Program runs in system X, you remotely attach your IDE to it

- Post-mortem debugging
    - The developer only stops to debug the program if it experiences fatal exceptions
    - More about exceptions on some other day :)

### IDE Debugging

- Let's learn debugging in the IDE

## Exercise

- https://github.com/dci-fbw-j-24-e02/java-debug-library
