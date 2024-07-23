# Java Day 10 - Dates and Times

**Today**
- Introduction to Dates and Times in Java
- Creating, manipulating and formatting

## Dates and Times in Java

- Java provides various ways to work with dates and times
- Java handles dates and times using helper Classes

- There is a legacy Class called `java.util.Date` that was used in the past
    - The naming of related classes is confusing
    - The functionality is a bit inconsistent as well

- The more modern way is using Classes from `java.time` - we will use this one
    - Improved class and method naming and consistency
    - Objects are `immutable`, which guides how you write code

### Key classes

- `LocalDate` - Represents a date without time          (1998-07-20)
- `LocalTime` - Represents a time without date          (13:40)
- `LocalDateTime` - Represents a date and time combo    (1998-07-20T13:40)
- `ZonedDateTime` - Represents a datetime with timezone (1998-07-20T13:40+02:00)

### Format

- All global times are based on the Coordinated Universal Time **UTC**
    - Germany is ahead of the UTC by 2 hours

    - `2024-01-01T07:55:00Z` UTC time
    - `2024-01-01T09:55:00+02:00` The same time in our timezone

- All of the Time and Date formats here are based on ISO-8601 standard
    - https://en.wikipedia.org/wiki/ISO_8601

- 5 minute mini exercise
    - 1. Write down what is your current date and time in the ISO_8601 format
    - 2. Write down the current UTC date and time in the ISO_8601 format
    - OPTIONAL BONUS: 3. Search what is the timezone in New York city
    - OPTIONAL BONUS: 4. Write down the current date and time in New York city the ISO_8601 format

### Old way vs new way

- The old `Date` tracks time in milliseconds (?) since `01.01.1970 00:00:00`
    - 1721716883
    - This is called "the epoch"
    - "Epoch time" or "unix time"
    - In some systems you will still run into this
    - Has less functionality
    - Tiny tiny bit faster in some cases

- Show seconds since the epoch in Linux: `$ echo $EPOCHSECONDS`

- The new classes in `java.time` mostly use separate fields for tracking time
    - Normally have year, month, day, hour, minute, second, nanosecond separate
    - Depending on class, can sometimes be based on epoch time
    - Has a lot more functionality
    - Tiny tiny bit slower in some cases

> The first rule of Optimization Club is, you do not Optimize
> The second rule of Optimization Club is, you do not Optimize without measuring

## Code

- **Date and time creation**

- [](./DateTimeCode/src/DateAndTimeCreation.java)

- **25 minute exercise**
    - Create a new class for this experiment: "TimeExaminationExercise"
    - In the main method
        - Create a ZonedDateTime of your birthday, as accurately as you know it (Use UTC time to simplify)
        - Which day of week was it?
        - Which day of year was it?
        - Which epoch second was it?
        - How many seconds has passed from then until now? Use the epoch seconds to calculate
    - Create a method that takes in a date String like "2020-04-25" and returns the weekday as a String
        - HINT 1: `parsedLocalDate.getDayOfWeek().toString();`
        - HINT 2: You can parse LocalTime like we did with ZonedDateTime.parse()
        - Using that method from the main method, print which weekdays are:
            - 2024-07-23, 2023-01-01, 2024-01-01, 2025-01-01

    - BONUS: Extra time? Research what kind of values are valid for `ZoneId.of(???)`
    - BONUS: Extra time? Research what kind of values are valid for `ZonedDateTime.parse(???);`
    - SOLUTION: [](./DateTimeCode/src/DateAndTimeCreationExercise.java)


- **Date and time manipulation**

- [](./DateTimeCode/src/DateAndTimeManipulation.java)

- **20 minute exercise**
    - Create a new class for this experiment: "DateAndTimeManipulationExercise"
    - How many days are until your next birthday?
    - Find out how many days are left until the end of the year?
    - Find out how many hours are left until the end of the year?
    - Find out how many seconds are left until the end of the day?
    - What date and time will it be in 10000 days?
    - What date and time will it be in 10000 hours?
    - What date and time will it be in 10000 minutes?
    - What date and time will it be in 10000 seconds?
    - Using a loop, calculate how many years until the next leap year
    - BONUS 1: Create a method `daysUntil`
        - It takes in a ZonedDateTime
        - It returns a number of how many days left until the given date
    - BONUS 2: Create a method `futurizer`
        - It takes in an int `amount` and String `type`
            - `type` can be "days", "hours", "minutes" or "seconds"
        - It returns a ZonedDateTime in the future based on amount and type
        - These two should do the same thing:
            - `ZonedDateTime future = futurizer(10000, "days");`
            - `ZonedDateTime future = now.plusDays(10_000);`
    - SOLUTION: [](./DateTimeCode/src/DateAndTimeManipulationExercise.java)

- **Date and time formatting**

- [](./DateTimeCode/src/DateAndTimeFormatting.java)

- **30 minute exercise**
    - See https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
    - Create a ZonedDateTime with the current time and date called "now"
    - Create a formatter with the style "AD 2024, July 23, Tuesday 3:4:6 PM"
    - Print out the date and time from "now" in the format above
    - Extract and print out the year, month, day, hour, minute and second from "now"
    - Use those to create a new ZonedDateTime in the timezone "America/Los_Angeles"
    - Search for an american style of printing dates and times and print out the date and time in LA using the american style
    - SOLUTION: [](./DateTimeCode/src/DateAndTimeFormattingExercise.java)

    - **BONUS 1**
        - DateTimeFormatter can actually help read time as well as print it!
        - Remember `ZonedDateTime.parse("2020-04-19T09:45:00Z");` ?
        - DateTimeFormatter can help parse `ZonedDateTime` from strange formats
        - Examine this inputString: "2023.07.20 22.59.14" -- !! NOTE !! MISTAKE HERE, SHOULD INCLUDE TIMEZONE AS "2023.07.20 22.59.14 UTC"
        - Create a `DateTimeFormatter` that matches to variable `formatter`
        - Examine `ZonedDateTime.parse(inputString, formatter);`
        - Can you parse that to a `ZonedDateTime` from the inputString like so?

    - **BONUS 2**
        - As above, but with inputString: "2023/07/20 22:59 PST"
