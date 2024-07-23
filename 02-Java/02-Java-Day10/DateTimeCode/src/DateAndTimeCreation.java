import java.time.*;

public class DateAndTimeCreation {
    public static void main(String[] args) {
        // Current Date, locally
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        // Current Time, locally
        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        // Current date and time, locally
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        System.out.println("H " + ldt.getHour());
        System.out.println("M " + ldt.getMinute());
        System.out.println("S " + ldt.getSecond());
        System.out.println("Day of week " + ldt.getDayOfWeek());
        System.out.println("Day of month " + ldt.getDayOfMonth());
        System.out.println("Day of year " + ldt.getDayOfYear());

        // Current date and time including timezone information
        ZonedDateTime currentZonedDateTime = ZonedDateTime.now();
        System.out.println(currentZonedDateTime);

        // Epoch time (also known as unix time); seconds passed since 1.1.1970 00:00:00
        var currentEpochTime = currentZonedDateTime.toEpochSecond();  // type inference; the type of `currentEpochTime` is determined by what `toEpochSecond()` returns
        System.out.println(currentEpochTime);

        // Creating a historical date and time in UTC
        ZoneId utc = ZoneId.of("UTC");  // This creates a timezone representing UTC
        ZonedDateTime historyMoment = ZonedDateTime.of(1969, 12, 31, 23, 1, 3, 0, utc);
        System.out.println("History year " + historyMoment.getYear());
        System.out.println("History epoch time " + historyMoment.toEpochSecond());

        // Creating a historical date and time in our local timezone in Germany
        ZoneId localTimezone = ZoneId.of("Europe/Berlin");
        ZonedDateTime historyMomentLocal = ZonedDateTime.of(1969, 12, 31, 23, 1, 3, 0, localTimezone);
        System.out.println("History year local " + historyMomentLocal.getYear());
        System.out.println("History epoch time local " + historyMomentLocal.toEpochSecond());

        // We can also create them from a String
        ZonedDateTime specificDate = ZonedDateTime.parse("2020-04-19T09:45:00Z");
        System.out.println("Specific zoned date time " + specificDate);
    }
}
