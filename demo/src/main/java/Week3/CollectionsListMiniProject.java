package Week3;


import java.util.ArrayList;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

public class CollectionsListMiniProject {
    public static void main(String[] args) {
        // === Part 1: Real Madrid Forwards (Strings) ===
        ArrayList<String> forwards = new ArrayList<>();

        // Add 3 players
        forwards.add("Kylian Mbappé");
        forwards.add("Vinícius Júnior");
        forwards.add("Rodrygo");

        // Print all forwards
        System.out.println("Real Madrid Forwards:");
        for (String player : forwards) {
            System.out.println("- " + player);
        }

        // Remove least favorite (Rodrygo)
        forwards.remove("Rodrygo");

        // Add new forward
        forwards.add("Endrick");

        // Print updated list
        System.out.println("\nUpdated Forwards List:");
        for (String player : forwards) {
            System.out.println("- " + player);
        }

        // === Part 2: Favorite Numbers (Integers) ===
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add favorite numbers
        numbers.add(7);
        numbers.add(10);
        numbers.add(11);

        // Print all numbers
        System.out.println("\nFavorite Numbers:");
        for (int number : numbers) {
            System.out.println("- " + number);
        }

        // Remove least favorite (10)
        numbers.remove(Integer.valueOf(11));

        // Add new number
        numbers.add(9);

        // Print updated numbers
        System.out.println("\nUpdated Numbers:");
        for (int number : numbers) {
            System.out.println("- " + number);
        }

        // Sum all numbers
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("\nTotal Sum of Favorite Numbers: " + sum);

        // === Part 3: Book Objects ===
        ArrayList<Book> books = new ArrayList<>();

        // Add 3 books
        books.add(new Book("The Name of the Wind", "Patrick Rothfuss"));
        books.add(new Book("Circe", "Madeline Miller"));
        books.add(new Book("The Midnight Library", "Matt Haig"));

        // Print book titles
        System.out.println("\nBook Titles:");
        for (Book book : books) {
            System.out.println("- " + book.title);
        }

        // Remove the last one
        books.remove(books.size() - 1);

        // Add new book
        books.add(new Book("Piranesi", "Susanna Clarke"));

        // Print full book details
        System.out.println("\nUpdated Book List:");
        for (Book book : books) {
            System.out.println("Title: " + book.title + ", Author: " + book.author);
        }
    }
}
