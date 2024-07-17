# Java Module Day 7 - Lesson Notes & Code! :)

**Today**
- A technique demonstration and practice
- File I/O

## File I/O

- File I/O (Input/Output) refers to the process of reading and writing files :)

- In Backend Java apps, often used in for example
    - Interactions with configuration files
    - Writing logs
    - Analyzing logs

- Java provides two main I/O stream types for handling file operations

    - Text files
    - Binary files

- 1. **Character Streams**
    - Reading and writing regular text
    - Classes like `FileReader` and `FileWriter` for example

- 2. **Byte Streams**
    - Much less common :)
    - Reading and writing raw bytes to a file
    - Used for processing binary data, such as image or video files
    - Classes like `FileInputStream` and `FileOutputStream` for example

## NIO.2 (New Input/Output 2)

- Java 7 introduced NIO.2 (New Input/Output 2) as the `java.nio.file` package
    - A simple approach to file I/O operations
    - This naming feels really dumb though

- `Path` class represents a file or directory path
- `Files` class provides static methods to read, write, and manipulate `Paths`

- These classes internally use Character/Byte streams so you don't have to :)
    - That difficult logic is abstracted out

- You can do all basic file operations
    - Read, Write, Copy, Move, Delete, Change attributes

- In order to practice these cool things we will use some new code
    - We will learn how to pause processing for a while
    - We'll have to deal with errors

    - Both of these will be covered much more in detail later
    - We can use the techniques while we don't deeply understand them

## Live coding

- File I/O experiments 
    - [Here](code/src/Minitest.java)

- File analyzer (read files and print lines based on condition)
    - [Here](code/src/FileAnalyzer.java)

- Class, constructor and instance review
    - [Main file](code/src/ClassesTest.java)
    - [Pet class](code/src/Pet.java)
    - [Product class](code/src/Product.java)
    - [Logfile class](code/src/Logfile.java)

## Exercises

- https://classroom.github.com/a/cC80NYnX