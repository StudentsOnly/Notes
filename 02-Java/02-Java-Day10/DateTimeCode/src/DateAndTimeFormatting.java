import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateAndTimeFormatting {
    public static void main(String[] args) {
        // Starting dates and times
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime now = LocalDateTime.now();

        // https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

        // Formatting dates (yyyy-MM-dd)
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = currentDate.format(dateFormatter);
        System.out.println("Formatted date: " + formattedDate);

        // Formatting times (HH:mm:ss)
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = currentTime.format(timeFormatter);
        System.out.println("Formatted time: " + formattedTime);

        // Formatting date AND time (yyyy.MM.dd HH:mm:ss)
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        String formattedDateTime = now.format(dateTimeFormatter);
        System.out.println("Formatted datetime: " + formattedDateTime);

        // Wild formatting options
        LocalDateTime monday = now.minusDays(1);
        DateTimeFormatter wild = DateTimeFormatter.ofPattern("EEEE -- HH:mm yyyy");
        String customFormattedDate = monday.format(wild);
        System.out.println("Wild formatted datetime: " + customFormattedDate);
    }
}
