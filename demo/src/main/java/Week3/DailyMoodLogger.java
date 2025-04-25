package Week3;
import java.io.*;                   // For FileWriter and BufferedReader
import java.time.LocalDate;
import java.util.Scanner;

public class DailyMoodLogger {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running){
            System.out.println("\nWhat would you like to do?");
            System.out.println("[1] Log today’s mood");
            System.out.println("[2] View past moods");
            System.out.println("[3] Exit");
            System.out.print("Your choice: ");
            String choice = scanner.nextLine();

            switch (choice){
                case "1":
                        logMood(scanner);
                        break;
                case "2":
                    viewMoods();
                    break;
                case "3":
                    running = false;               // Exit the loop
                    break;
                default:
                    System.out.println("Invalid option. Try again.");

            }


        }

        scanner.close();
    }


    // Method to log the user's mood with today's date
    private static void logMood(Scanner scanner) {
        System.out.println("How are you feeling today?");
        String mood = scanner.nextLine();
        String entry = LocalDate.now() + ": " + mood;

        // Try writing the mood entry to the file
        try (FileWriter writer = new FileWriter("moodlog.txt", true)) {
            writer.write(entry + "\n");
            System.out.println("Mood saved!");
        }catch (IOException e){
            System.out.println("Error writing to file.");
        }


        }

            // Method to view all saved moods from the file
        private static void viewMoods(){

        try (BufferedReader reader = new BufferedReader(new FileReader("moodlog.txt"))){

            String line;
            System.out.println("\n --- Mood History ---");
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e){
            System.out.println("Error reading file.");
        }

        }


}
