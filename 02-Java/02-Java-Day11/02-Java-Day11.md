# Java Day 11 - Algorithmic thinking

## Algorithms??

- These kind of topics can be in some (tech) interviews
- Especially in very technical roles for large companies
- The topics of today are strongly tied to Computer Science
    - Our course focuses mostly on more practical topics
    - But it's good to have a bit of theory as well!

## OK fine, Algorithms

- The classic analogy is a recipe; making pancakes or something
    - 3. Mix ingredients in bowl
    - 5. Preheat pan
    - 7. Add mixture to pan
    - 9. After 2 minutes, flip pancake, after 2 minutes, pancake done

- You have your inputs, the process and the output
    - The process must cover all the steps necessary for the desired output

- An algorithm
    - A step-by-step procedure for a program to follow in a particular situation
       - Typically a small, well defined problem: "sort this array of numbers"
       - But can be big: "What videos to show to a particular user"

    - Sometimes people say "An algorithm solves a class of problems"

    - "Sort this array of numbers" is an algorithm classic
        - It's a "class of problems" instead of a specific problem
        - Because there can be many different possible inputs
        - `[2,1]`, `[1,2,4,3,5]`, `[6,0,-7,2,1,9012,52,3,-1,999132512369753427]`

- Problem: "Convert this list of strings to be all lowercase"
    - Here, the input is an array of strings
    - Here, the output is an edited array of strings
    - An algorithm is the steps to solve that problem for all relevant inputs

- Problem: "Sort this array of numbers from smallest to largest"
    - Here, the input is an array of numbers
    - Here, the output is an edited array of numbers
    - An algorithm is the steps to solve that problem for all relevant inputs

- There's more than one way to bake a pancake...
    - There are MANY algorithms to solve a specific problem (usually)
    - There are MANY number sorting algorithms, for example
    - Which one is best really depends on the situation
        - Some are take more CPU speed
        - Some are take more memory
        - Some are good for small arrays
        - Some are good for big arrays
        - Some are good if your data is close to being sorted
        - Some are good if your data is completely random
    - It's not realistic to know them all
        - Quicksort
        - Bubble sort
        - Merge sort

    - https://en.wikipedia.org/wiki/Sorting_algorithm#Comparison_of_algorithms
    - THIS is the kind of stuff that computer scientist learn and do

- Let's think of an algorithm to reverse an array; `{1,2,3,4,5}` -> `{5,4,3,2,1}`

    ```
    SET array = {1,2,3,4,5}
    SET left = 0 (index 0)
    SET right = 4 (length of the list minus 1)

    WHILE left < right
        SWAP the elements at index "left" and index "right"
        INCREMENT left; left++
        DECREMENT right; right--
    ```

    - FANTASTIC! We have an algorithm that solves reversing an array!

- Our algorithm is written in **Pseudocode**

    - Something that's between normal language and actual code
    - Pseudocode is a simplified, informal syntax
    - It represents the core principles and logic of an algorithm (or program)
    - But it avoids the specifics of any programming language syntax
    - There is no one specific pseudocode syntax
        - There's no "official" pseudocode language
        - But some guidelines, if you want to read more

    ```js
    // Problem: Make a new array of all **ALPHANUMERIC** characters
    input = "ABC-DEF@G1H2I3J4KLM!"

    // Pseudocode style 1
    results = ""
    for (character in input) {
        if (character is alphanumeric) {
            add character to results
        }
    }

    // Pseudocode style 2
    SET results to ""
    FOR each character in the "input" string:
        IF the character is alphanumeric:
            ADD the number to the "results" array
        ENDIF
    ENDFOR
    ```

- SIDEQUEST

    - 15 minute mini exercise
        - Start a new project in IntelliJ called "AlgorithmTesting"
        - Create a class called "ArrayReverse" and add the main method
        - Create `int[] arr1 = {1, 2, 3, 4, 5};`
        - Create `int[] arr2 = {1, 2, 4, 5};`
        - Create `int[] arr3 = {1};`
        - Try to implement our algorithm from above
        - Extra time? Make the algorithm into a method :)

- We have an algorithm definition
- We have a program that implements it
    - You implemented our array reverse algorithm in Java

- Our program is not an algorithm
    - An algorithm is the *conceptual* steps or blueprint of what steps to do
    - It's not defined in any programming language
    - You could implement the same array reverse algorithm in Python/JS/Go...
    - And it would look a bit different in each :)

- Programming language syntax is like your toolkit
    - Your toolkit contains tools and techniques
    - Variables, For loops, Conditionals, Arrays...
    - You use these tools to build programs and implement algorithms

## Sorting algorithms: `Bubble sort`

- The earliest description of the Bubble sort algorithm was in 1956
    - This is "Bubble sort" because the largest number "bubbles" up to the end
    - https://en.wikipedia.org/wiki/Bubble_sort#/media/File:Bubble-sort-example-300px.gif

- Problem: an array like `{1, 9, 5, 3}` should be sorted to `{1, 3, 5, 9}`

- Bubble sort in pseudo code
    ```js
    # Pseudocode
    loop through array of numbers
        compare current number and next number
        if current  number is larger than next number
            swap numbers around

    repeat loop until array is sorted
        we know that the array is sorted when we haven't made any swaps

    # Pseudocode alternative style
    BEGIN BubbleSort(list)
        swaps = true
        WHILE (swaps is true)
            swaps = false
            FOR i FROM zero TO (LENGTH OF list MINUS 1)
                IF list[i] > list[i+1]
                    SWAP(list[i], list[i+1])
                    swaps = true
                ENDIF
            ENDFOR
        ENDWHILE
        RETURN list
    END BubbleSort
    ```

- SIDE QUEST :D 
    - 20 minute mini exercise!
        - Implement the BubbleSort algorithm in Java :)

    ```java
        public static void bubbleSort(int[] numbers) {
            boolean swapped = true; // Start assuming the array needs sorting
            int n = numbers.length;
            int temp = null;

            while(swapped) {
                swapped = false; // This time, maybe the array is already sorted!

                for (int j = 0; j < n - i - 1; j++) { // Optimization!
                    if (numbers[j] > numbers[j + 1]) {
                        temp = numbers[j];
                        numbers[j] = numbers[j + 1];
                        numbers[j + 1] = temp;
                        swapped = true;
                    }
                }
            }
        }
    ```

## Algorithmic thinking

- Related to "Computational Thinking"
- Algorithmic thinking is a problem-solving approach
    - Breaking down problems into logical steps, (basically; programming)

- Thinking in terms of algorithms is thinking like a programmer

- Concepts:
    - Breaking down a task into smaller subtasks
    - Identifying patterns and similarities
    - Focusing on essential details of a problem, ignoring irrelevant ones
    - Making precise instructions how to arrive at an end state

- You can practice algorithmic thinking
    - Doing problem-solving exercises
    - Simply by programming yourself more (and reading programs!)

- Some sources say even solving puzzles helps :)
    - https://cs4fndownloads.wordpress.com/wp-content/uploads/2016/02/cs4fnpuzzlebook11.pdf

## Introduction to Big O notation

- So, there many ways of solving a problem by programming
- Like many algorithms for sorting a list of numbers
- In high performance systems, it's very important to choose the right one

    - Some algorithms take more time (CPU) and less memory (RAM)
    - Some algorithms take less time (CPU) and more memory (RAM)
    - Some algorithms are great for small amounts of data, but bad for lots

- Algorithm Analysis:
    - Predicting how an algorithm behaves as the size of input data increases
    - Usually it's about time and memory
    - More advanced analysis includes File I/O performance and net activity 

- You, an Amazon developer might test with a database of 100 products
    - Amazon has a few more in production
    - And the production keeps growing
    - Your "sort search results by price" better be pretty good

- The Big O notation is a way of estimating the performance of an algorithm
    - It's a way of classifying and simplifying algorithms so we can compare

- The Big O notation can be used for different aspects of an algorithm
    - These are called "complexities"
    - Usually you look at **Time complexity** or **Space complexity**

- The big O notation actually defines growth
    - As the amount of inputs grows, how does the algorithm react

### Big O notation EXAMPLES

#### Constant

- Let's imagine a number sorting algorithm called "Splerch"
    - Splerch takes 100 seconds to sort 10 numbers
    - Splerch takes 100 seconds to sort 40 numbers
    - Splerch takes 100 seconds to sort 100 numbers
    - Splerch takes 100 seconds to sort 9000 numbers

    - This is called constant time complexity
        - Splerch takes the same amount of time, even when inputs increase

    - In the Big O notation, this is represented as `O(1)`
        - You read that as "O of 1"

    - Note that the actual duration does _not_ matter for Big O
        - Just the growth matters
    - Splerch looks HORRIBLE for small arrays
    - Splerch looks AMAZING for massive arrays
    - This kind of algorithm is not common or realistic

#### Linear

- Let's imagine a number sorting algorithm called "Blargh"
    - Blargh takes 10 seconds to sort 10 numbers
    - Blargh takes 40 seconds to sort 40 numbers
    - Blargh takes 100 seconds to sort 100 numbers
    - Blargh takes 9000 seconds to sort 9000 numbers

    - This is called called linear time complexity
        - The time it takes increases linearly with the number of inputs

    - In The Big O notation, this is represented as `O(n)`
        - You read that as "O of n"

    - This is actually really good for an algorithm
        - However, Blargh takes quite a long time for small arrays

#### Quadratic

- Let's imagine a number sorting algorithm called "Görp"
    - Görp takes 3 seconds to sort 3 numbers
    - Görp takes 6 seconds to sort 4 numbers
    - Görp takes 10 seconds to sort 5 numbers
    - Görp takes 15 seconds to sort 6 numbers
    - Görp takes 21 seconds to sort 7 numbers
    - Görp takes 80 seconds to sort 10 numbers
    - Görp takes 92 seconds to sort 11 numbers

    - This is called called quadratic time complexity

    - In The Big O notation, this is represented as `O(n^2)`
        - You read that as "O of n squared"

    - Görp starts out super fast, it's fantastic for tiny inputs
    - But it slows down a LOT, it's not good for large inputs

    - Bubble Sort has a time complexity of `O(n^2)`
        - It's inefficient for large datasets

### Analyzing the Big O notation of code

**Constant**

```java
public static void printMessage(int[] num) {
    System.out.println("Hello World!" + num[0]);
}
```
- No matter how many times you call this, it takes a constant amount of time
- No matter how many big the input array is, it takes a constant amount of time
- Therefore, the Big O time complexity is O(1)

**Linear**

```java
public static void printArray(int[] arr) {
  for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
  }
}
```

- This code iterates through an array and prints each element
- The number of times the loop iterates depends on the size of the array (n)
- As the array size increases, the execution time grows linearly
- Therefore, the Big O time complexity is O(n)

- REMINDER FOR JOEL: SHOW TIME MEASUREMENT WITH THIS ONE

**Quadratic**

```java
public static boolean weirdPrint(int[] arr) {
  int n  = arr.length;
  for (int i = 0; i < n - 1; i++) {
    for (int j = i + 1; j < n; j++) {
      System.out.println("Yo" + arr[i])
    }
  }

  return true;
}
```

- This code checks if an array is sorted using two nested loops
- The outer loop iterates n-1 times
- The inner loop iterates from i+1 to the end of the array
- In the best case scenario first items in the array are not in order
- In the worst case scenario the array is already sorted
- In the worst case you **basically** loop over each array item for each array item
- The total number of comparisons in the worst case isn't exactly n^2
- But it's still considered to grow proportionally to n^2
- Therefore, the Big O time complexity is O(n^2)

## Practical time measurement option

- Measurement is tricky; here is one option for time measurement

- Create a demo, like [this](./LinearGrowthTest.java)

- Measure how long it takes to run at
    - `$ time java LinearGrowthTest.java`
    - Repeat this a few times to get an average

- Change the amount of input data in the source code
    - From 10_000 to 20_000
    - Measure again, write down the result

- Change the input again, from 20_000 to 30_00 and measure again
- Change the input again, from 30_000 to 40_00 and measure again
- Change the input again, from 40_000 to 50_00 and measure again
- Change the input again, from 50_000 to 60_00 and measure again

- Examine how the time increases as the size increases
    - Is it linear?
    - Real world data can be messier than theoretical limits :)
    - The more data measurement points you get, the better
    - More data points means the more reliable results

## Exercise

- https://classroom.github.com/a/9PSzn5ng

## Exercise 2 (optional, for future boring time :))

- Leetcode!

- I recommend trying these problems (not in any particular order)

- https://leetcode.com/problems/concatenation-of-array
- https://leetcode.com/problems/sort-the-people
- https://leetcode.com/problems/final-value-of-variable-after-performing-operations
- https://leetcode.com/problems/number-of-good-pairs
- https://leetcode.com/problems/shuffle-the-array
- https://leetcode.com/problems/minimum-number-game
- https://leetcode.com/problems/shuffle-string HINT: `someString.split("");` and `String.join("", someArrayOfStrings);`
