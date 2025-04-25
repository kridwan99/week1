package Week3;
import java.io.*;
import java.util.*;

public class FileExercises {

    public static void main(String[] args) {
        writeSingleLine();
        readSingleLine();
        writeArrayLines();
        readPoemLineByLine();
        saveUserInput();
        readLinesToUppercase();
        countWordOccurrences();
        saveBooksToFile();
        loadBooksFromFile();
        appendBookFromInput();
    }

    // 1. Write a single line to a file
    public static void writeSingleLine() {
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write("Hello, file world!");
            System.out.println("[✔] Wrote single line to output.txt");
        } catch (IOException e) {
            System.err.println("Error writing to output.txt: " + e.getMessage());
        }
    }

    // 2. Read that line back
    public static void readSingleLine() {
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            String line = reader.readLine();
            System.out.println("[✔] Read from output.txt: " + line);
        } catch (IOException e) {
            System.err.println("Error reading from output.txt: " + e.getMessage());
        }
    }

    // 3. Write multiple lines from an array
    public static void writeArrayLines() {
        String[] lines = {
                "Roses are red",
                "Violets are blue",
                "Java is sweet",
                "And so are you"
        };

        try (FileWriter writer = new FileWriter("poem.txt")) {
            for (String line : lines) {
                writer.write(line + "\n");
            }
            System.out.println("[✔] Wrote poem to poem.txt");
        } catch (IOException e) {
            System.err.println("Error writing to poem.txt: " + e.getMessage());
        }
    }

    // 4. Read file line-by-line and print
    public static void readPoemLineByLine() {
        try (BufferedReader reader = new BufferedReader(new FileReader("poem.txt"))) {
            System.out.println("[✔] Poem content:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("  " + line);
            }
        } catch (IOException e) {
            System.err.println("Error reading from poem.txt: " + e.getMessage());
        }
    }

    // 5. Ask the user for lines and save to a file
    public static void saveUserInput() {
        Scanner scanner = new Scanner(System.in);
        try (FileWriter writer = new FileWriter("user_input.txt")) {
            for (int i = 1; i <= 3; i++) {
                System.out.print("Enter line " + i + ": ");
                String input = scanner.nextLine();
                writer.write(input + "\n");
            }
            System.out.println("[✔] Saved user input to user_input.txt");
        } catch (IOException e) {
            System.err.println("Error writing user input: " + e.getMessage());
        }
    }

    // BONUS: Convert user_input.txt to uppercase and print
    public static void readLinesToUppercase() {
        try (BufferedReader reader = new BufferedReader(new FileReader("user_input.txt"))) {
            System.out.println("[✔] Uppercase lines from user_input.txt:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("  " + line.toUpperCase());
            }
        } catch (IOException e) {
            System.err.println("Error reading user_input.txt: " + e.getMessage());
        }
    }

    // 6. Count how many times a word appears in user_input.txt
    public static void countWordOccurrences() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word to search: ");
        String search = scanner.nextLine().toLowerCase();
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("user_input.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().contains(search)) {
                    count++;
                }
            }
            System.out.println("[✔] The word '" + search + "' appeared in " + count + " line(s).");
        } catch (IOException e) {
            System.err.println("Error reading user_input.txt: " + e.getMessage());
        }
    }

    // Inner Book class
    static class Book {
        String title;
        String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public String toFileString() {
            return title + ";" + author;
        }

        @Override
        public String toString() {
            return title + " by " + author;
        }
    }

    // 7. Save an array of Book objects to books.txt
    public static void saveBooksToFile() {
        Book[] books = {
                new Book("Clean Code", "Robert C. Martin"),
                new Book("Effective Java", "Joshua Bloch"),
                new Book("Head First Java", "Kathy Sierra")
        };

        try (FileWriter writer = new FileWriter("books.txt")) {
            for (Book book : books) {
                writer.write(book.toFileString() + "\n");
            }
            System.out.println("[✔] Saved books to books.txt");
        } catch (IOException e) {
            System.err.println("Error writing to books.txt: " + e.getMessage());
        }
    }

    // 8. Load books from books.txt and display them
    public static void loadBooksFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("books.txt"))) {
            List<Book> books = new ArrayList<>();
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length == 2) {
                    books.add(new Book(parts[0], parts[1]));
                }
            }

            System.out.println("[✔] Loaded books:");
            for (Book book : books) {
                System.out.println("  " + book);
            }

        } catch (IOException e) {
            System.err.println("Error reading from books.txt: " + e.getMessage());
        }
    }

    // 9. Let the user add a book to books.txt
    public static void appendBookFromInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();

        Book book = new Book(title, author);

        try (FileWriter writer = new FileWriter("books.txt", true)) {
            writer.write(book.toFileString() + "\n");
            System.out.println("[✔] Book added to books.txt");
        } catch (IOException e) {
            System.err.println("Error appending book: " + e.getMessage());

        }
    }
}
