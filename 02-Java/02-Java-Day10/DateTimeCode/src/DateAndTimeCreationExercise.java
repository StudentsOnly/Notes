import java.time.LocalDate;
import java.time.ZonedDateTime;

public class DateAndTimeCreationExercise {
    public static void main(String[] args) {
        ZonedDateTime bd = ZonedDateTime.parse("1985-11-21T09:30:00Z");
        System.out.println(bd);
        System.out.println("BD day of week " + bd.getDayOfWeek());
        System.out.println("BD day of year " + bd.getDayOfYear());
        System.out.println("BD epoch seconds " + bd.toEpochSecond());

        ZonedDateTime now = ZonedDateTime.now();
        long thenSeconds = bd.toEpochSecond();
        long nowSeconds = now.toEpochSecond();
        System.out.println(nowSeconds-thenSeconds + " seconds from my birth");

        System.out.println("2025-01-01 is a " + getWeekdayFromDate("2025-01-01"));
        System.out.println("2024-07-23 is a " + getWeekdayFromDate("2024-07-23"));
        System.out.println("2023-01-01 is a " + getWeekdayFromDate("2023-01-01"));
        System.out.println("2024-01-01 is a " + getWeekdayFromDate("2024-01-01"));
    }

    private static String getWeekdayFromDate(String date) {
        LocalDate ld = LocalDate.parse(date);
        return ld.getDayOfWeek().toString();
    }
}
