import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateAndTimeFormattingExercise {
    public static void main(String[] args) {
        // Create a ZonedDateTime with the current time and date called "now"
        ZonedDateTime now = ZonedDateTime.now();

        // Create a formatter with the style "AD 2024, July 23, Tuesday 3:4:6 PM"
        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("G yyyy, LLLL dd, EEEE h:m:s a");

        // Print out the date and time from "now" in the format above
        System.out.println("Current time in weird format: " + now.format(customFormatter));

        // Extract and print out the year, month, day, hour, minute and second from "now"
        var year = now.getYear();
        var month = now.getMonthValue();
        var dayOfMonth = now.getDayOfMonth();
        var hour = now.getHour();
        var minute = now.getMinute();
        var second = now.getSecond();
        var nanosecond = 0;

        // Use those to create a new ZonedDateTime in the timezone "America/Los_Angeles"
        ZoneId laTimezone = ZoneId.of("America/Los_Angeles");
        ZonedDateTime laDatetime = ZonedDateTime.of(year, month, dayOfMonth, hour, minute, second, nanosecond, laTimezone);

        // Search for an american style of printing dates and times and print out the date and time in LA using the american style
        // 07/23/2024 10:48 am
        DateTimeFormatter usFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy h:mm a");
        System.out.println(laDatetime.format(usFormat));

        // BONUS 1
        /*
            **BONUS 1**
            - DateTimeFormatter can actually help read time as well as print it!
            - Remember `ZonedDateTime.parse("2020-04-19T09:45:00Z");` ?
            - DateTimeFormatter can help parse `ZonedDateTime` from strange formats
            - Examine this inputString: "2023.07.20 22.59.14"
            - Create a `DateTimeFormatter` that matches to variable `formatter` ---- SUPER STRANGE WORDING HERE; WHO WROTE THIS???
            - Examine `ZonedDateTime.parse(inputString, formatter);`
            - Can you parse that to a `ZonedDateTime` from the inputString like so?
         */
        var bonus1 = parseDate("2023.07.20 22.59.14 Z", "yyyy.MM.dd HH.mm.ss z");
        System.out.println(bonus1);

        // BONUS 2
        /*
         As above, but with inputString: "2023/07/20 22:59 PST"
         */
        var bonus2 = parseDate("2023/07/20 22:59 PST", "yyyy/MM/dd HH:mm z");
        System.out.println(bonus2);
    }

    /**
     * Parses a ZonedDateTime from the given input using the given format.
     *
     * @param input String to format
     * @param format String format to create a DateTimeFormatter from
     * @return ZonedDateTime parsed from the inputString based on the given format
     */
    private static ZonedDateTime parseDate(String input, String format) {
        // ZonedDateTime *requires* timezone information!
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        return ZonedDateTime.parse(input, formatter);
    }


}
