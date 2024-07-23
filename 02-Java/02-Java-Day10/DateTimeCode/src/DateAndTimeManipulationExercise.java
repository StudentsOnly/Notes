import java.time.Year;
import java.time.ZonedDateTime;

public class DateAndTimeManipulationExercise {
    public static void main(String[] args) {
        // How many days are until your next birthday?
        var now = ZonedDateTime.now();
        var birthday = ZonedDateTime.parse("2024-11-21T00:00:00Z");
        var daysUntilBirthday = birthday.getDayOfYear() - now.getDayOfYear();
        System.out.println("Days until BD " + daysUntilBirthday);

        // Find out how many days are left until the end of the year?
        var endOfYear = ZonedDateTime.parse("2024-12-31T23:59:59Z");
        var daysLeftUntilEOY = endOfYear.getDayOfYear() - now.getDayOfYear();
        System.out.println("Days until EOY " + daysLeftUntilEOY);

        // Find out how many hours are left until the end of the year?
        var secondsLeftUntilEOY = endOfYear.toEpochSecond() - now.toEpochSecond();
        var hoursLeftUntilEOY = secondsLeftUntilEOY / 60 / 60;
        System.out.println("Hours until EOY " + hoursLeftUntilEOY);

        // Find out how many seconds are left until the end of the day?
        var endOfDay = ZonedDateTime.parse("2024-07-23T23:59:59Z");
        var secondsLeftUntilEOD = endOfDay.toEpochSecond() - now.toEpochSecond();
        System.out.println("Seconds until EOD " + secondsLeftUntilEOD);

        // Future Dates and Times
        System.out.println(now.plusDays(10000)); //- What date and time will it be in 10000 days?
        System.out.println(now.plusHours(10000)); //- What date and time will it be in 10000 hours?
        System.out.println(now.plusMinutes(10000)); //- What date and time will it be in 10000 minutes?
        System.out.println(now.plusSeconds(10000)); //- What date and time will it be in 10000 seconds?

        // Using a loop, calculate how many years until the next leap year
        int year = now.getYear() + 1; // +1 because current year is leap year
        int yearsUntil = 1; // starting at 1 because curreny year is leap year
        while (!Year.isLeap(year)) {
            yearsUntil++;
            year++;
        }
        System.out.println("The next leap year is in " + yearsUntil + " years");

        // BONUS 1
        System.out.println("Days until " + daysUntil(ZonedDateTime.parse("2024-07-29T15:15:15Z")));
        System.out.println("Days until " + daysUntil(ZonedDateTime.parse("2024-07-24T15:15:15Z")));
        System.out.println("Days until " + daysUntil(ZonedDateTime.parse("2024-07-23T15:15:15Z")));
        System.out.println("Days until " + daysUntil(ZonedDateTime.parse("2024-07-22T15:15:15Z")));;
        System.out.println("Days until " + daysUntil(ZonedDateTime.parse("2024-07-21T15:15:15Z")));

        // BONUS 2
        System.out.println("Futurizer " + futurizer(10000, "days"));
        System.out.println("Futurizer " + futurizer(10000, "hours"));
        System.out.println("Futurizer " + futurizer(10000, "minutes"));
        System.out.println("Futurizer " + futurizer(10000, "seconds"));
    }

    private static long daysUntil(ZonedDateTime target){
        var now = ZonedDateTime.now();

        var secondsUntil = target.toEpochSecond() - now.toEpochSecond();
        var minutesUntil = secondsUntil / 60;
        var hoursUntil = minutesUntil / 60;
        var daysUntil = hoursUntil / 24;

        return daysUntil;
    }

    private static ZonedDateTime futurizer(int amount, String type) {
        var now = ZonedDateTime.now();

        ZonedDateTime target = null;
        switch (type) {
            case "days":
                target = now.plusDays(amount);
                break;
            case "hours":
                target = now.plusHours(amount);
                break;
            case "minutes":
                target = now.plusMinutes(amount);
                break;
            case "seconds":
                target = now.plusSeconds(amount);
                break;
        }

        return target;
    }
}
