package Week3;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

//import java.time.LocalDateTime;


public class DateTimeLevel2 {

    public static void main(String[] args) {

        // Create a LocalDate and LocalTime
        LocalDate date = LocalDate.of(2025, 4, 23);
        LocalTime time = LocalTime.of(14, 45);

        // Combine date and time into LocalDateTime
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println("Combined LocalDateTime: " + dateTime);

        // Print current date and time
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current LocalDateTime: " + now);

        // Add 1 week to today's date
        LocalDate nextWeek = LocalDate.now().plusWeeks(1);
        System.out.println("Date after 1 week: " + nextWeek);

        // Subtract 3 days from a specific date (e.g. Christmas)
        LocalDate xmas = LocalDate.of(2025, 12, 25);
        LocalDate threeDaysBefore = xmas.minusDays(3);
        System.out.println("3 days before Christmas 2025: " + threeDaysBefore);

        // Add 2 hours and 15 minutes to the LocalTime
        LocalTime updatedTime = time.plusHours(2).plusMinutes(15);
        System.out.println("Time after 2h15m: " + updatedTime);

        // Calculate tomorrow's datetime
        LocalDateTime tomorrow = LocalDateTime.now().plusDays(1);
        System.out.println("Tomorrow's DateTime: " + tomorrow);


    }
}
