# Java Day 9 - Regular Expressions

**Today**
- Regular expressions

## Regular expressions

- Regular expressions (regex, regexp) are used for matching patterns in strings

- They are useful in string validation
    - Website has "registration" form with `email` text input
    - We should probably verify that the text entered looks like an email

- They can also be useful in extracting parts of a string
    - You have an array of email addresses
    - You need to extract all the domains used by the emails

- They are also used in editing Strings
    - Extract all hashtags from a sentence
    - Replace `dogs` with `cats` in a sentence

- Regex isn't a Java only concept
    - Practically all programming languages have an implementation of regex
    - It's an independent little language
    - There might be some small implementation differences between languages

- Regular expressions is all about *patterns*
- You describe patterns with a special syntax

### Regex syntax

- Let's build some example code to practice

- 13 minute mini exercise
    - In Java Regular Expressions, what do the following patterns mean?
        - Also make a few examples of matching strings
    - `ab*c` -- a, then b zero or more times, then c
    - `ab+c` -- a, then one or more times, then c
    - `ab?c` -- a, then b zero or one times, then c
    - `a.c` -- a, then any single character, then c

- In regex particularly, AI will help you a lot
    - BUT! If AI generates a regex for you
    - Make sure you take the time to understand it!

- Where I use regex the most is actually find operations in my editor!

## Exercise

- https://classroom.github.com/a/K3YJ8kfI
