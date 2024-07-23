import java.time.LocalDateTime;
import java.time.Year;
import java.time.ZonedDateTime;

public class DateAndTimeManipulation {
    public static void main(String[] args) {
        // You can do math to figure out times, dates etc by extracting values
        LocalDateTime ldt = LocalDateTime.now();
        float yearDone = (100f / 365)  * ldt.getDayOfYear();
        System.out.println("This year is " + yearDone + "% done!");

        // Our code above isn't *always* perfect - what is the problem?
        // Our code does not give an accurate result in leap years
        // Improved code
        int daysInYear = 365;
        if (Year.isLeap(ldt.getYear())) {
            daysInYear = 366;
        }
        float yearDoneAccurate = (100f / daysInYear)  * ldt.getDayOfYear();
        System.out.println("This year is " + yearDoneAccurate + "% done!");

        // What weekday will it be X days from now?
        ZonedDateTime now = ZonedDateTime.now();
        ZonedDateTime future = now.plusDays(10_000);
        System.out.println("In 10_000 day it will be " + future.getDayOfWeek());

        // How many years until a certain date
        int nowYear = now.getYear();
        int futureYear = future.getYear();
        System.out.println("The future is here in " + (futureYear - nowYear) + " years.");
    }
}
