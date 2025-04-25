package Week3;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeLevel3 {

    public static void main(String[] args) {

        // 1 Parse a date from a string (yyyy-MM-dd)
        String dateStr = "2025-04-01";
        LocalDate parsedDate = LocalDate.parse(dateStr); // uses ISO format
        System.out.println("Parsed LocalDate: " + parsedDate);

        // 2 Parse a time from a string (HH:mm)
        String timeStr = "09:30";
        LocalTime parsedTime = LocalTime.parse(timeStr); // also ISO format
        System.out.println("Parsed LocalTime: " + parsedTime);

        // 3 Parse a LocalDateTime from a string (yyyy-MM-ddTHH:mm)
        String dateTimeStr = "2025-04-01T09:30";
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateTimeStr);
        System.out.println("Parsed LocalDateTime: " + parsedDateTime);

        // 4 Format a date using DateTimeFormatter ("dd MMM yyyy")
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        String formattedDate = parsedDate.format(dateFormatter);
        System.out.println("Formatted Date: " + formattedDate);

        // 5 Format a time to "HH:mm"
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        String formattedTime = parsedTime.format(timeFormatter);
        System.out.println("Formatted Time: " + formattedTime);

        // 6 Format a datetime into a full sentence (e.g., April 1, 2025 at 9:30 AM)
        DateTimeFormatter sentenceFormatter = DateTimeFormatter.ofPattern("MMMM d, yyyy 'at' h:mm a");
        String fullSentence = parsedDateTime.format(sentenceFormatter);
        System.out.println("Formatted Full Sentence: " + fullSentence);
    }
}
