package Week3;
import java.time.LocalDate;
import java.time.LocalTime;

public class DateTimeLevel1 {

    public static void main(String[] args) {
        // Print today's date
        LocalDate today = LocalDate.now();
        System.out.println("Today's date: " + today);

        // Print a specific date
        LocalDate christmas = LocalDate.of(2025, 12, 25);
        System.out.println("Christmas 2025: " + christmas);

        // Get parts of a date
        System.out.println("Year: " + today.getYear());
        System.out.println("Month: " + today.getMonth());
        System.out.println("Day: " + today.getDayOfMonth());

        // Print the current time
        LocalTime now = LocalTime.now();
        System.out.println("Current time: " + now);

        // Create a specific time
        LocalTime specificTime = LocalTime.of(15, 30);
        System.out.println("Specific time: " + specificTime);

        // Print parts of a time
        System.out.println("Hour: " + specificTime.getHour());
        System.out.println("Minute: " + specificTime.getMinute());
    }


}
