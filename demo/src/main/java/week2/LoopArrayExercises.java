package week2;

import java.util.Scanner;

public class LoopArrayExercises {

    // Book class for Level 3
    static class Book {
        String title;
        String author;
        int pages;

        public Book(String title, String author, int pages) {
            this.title = title;
            this.author = author;
            this.pages = pages;
        }
    }

    public static void main(String[] args) {

        // 1. Print numbers with a for loop
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // 2. Count backwards with a while loop
        int i = 5;
        while (i > 0) {
            System.out.println(i);
            i--;
        }

        // 3. Greet each person
        String[] names = {"Alice", "Bob", "Charlie"};
        for (int j = 0; j < names.length; j++) {
            System.out.println("Hello, " + names[j] + "!");
        }

        // 4. Calculate the total
        int[] nums = {3, 5, 7, 2, 8};
        int sum = 0;
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
        }
        System.out.println("Total: " + sum);

        // 5. Print only even numbers
        int[] evenNums = {4, 7, 10, 15, 18};
        for (int j = 0; j < evenNums.length; j++) {
            if (evenNums[j] % 2 == 0) {
                System.out.println(evenNums[j]);
            }
        }

        // 6. Stop at a certain value (while loop)
        int[] values = {1, 3, 5, 7, 9};
        int k = 0;
        while (k < values.length && values[k] != 7) {
            System.out.println(values[k]);
            k++;
        }

        // 7. Ask until valid input (do-while)
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.print("Enter password: ");
            input = scanner.nextLine();
        } while (!input.equals("secret123"));
        System.out.println("Access granted!");

        // 8. Count how many times "Java" appears
        String[] languages = {"Java", "Python", "Java", "C#", "Java"};
        int count = 0;
        for (int j = 0; j < languages.length; j++) {
            if (languages[j].equals("Java")) {
                count++;
            }
        }
        System.out.println("Java appears " + count + " times.");

        // 9. Find the largest number
        int[] bigNums = {12, 5, 90, 34, 7};
        int max = bigNums[0];
        for (int j = 1; j < bigNums.length; j++) {
            if (bigNums[j] > max) {
                max = bigNums[j];
            }
        }
        System.out.println("Largest: " + max);

        // 10. Compare two arrays
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 4};
        boolean areEqual = true;
        if (a.length != b.length) {
            areEqual = false;
        } else {
            for (int j = 0; j < a.length; j++) {
                if (a[j] != b[j]) {
                    areEqual = false;
                    break;
                }
            }
        }
        System.out.println("Arrays equal: " + areEqual);

        // 11. Copy one array to another
        int[] src = {1, 2, 3, 4};
        int[] dest = new int[src.length];
        for (int j = 0; j < src.length; j++) {
            dest[j] = src[j];
        }
        System.out.println("Array copied!");

        // 12. Reverse an array
        int[] reverseMe = {10, 20, 30};
        for (int j = reverseMe.length - 1; j >= 0; j--) {
            System.out.println(reverseMe[j]);
        }

        // 13. Create and loop through Book array
        Book[] books = {
                new Book("Book A", "Alice", 150),
                new Book("Book B", "Bob", 250),
                new Book("Book C", "Charlie", 320)
        };
        for (int j = 0; j < books.length; j++) {
            System.out.println(books[j].title);
        }

        // 14. Count books by a certain author
        int authorCount = 0;
        for (int j = 0; j < books.length; j++) {
            if (books[j].author.equals("Alice")) {
                authorCount++;
            }
        }
        System.out.println("Books by Alice: " + authorCount);

        // 15. Print books with more than 300 pages
        for (int j = 0; j < books.length; j++) {
            if (books[j].pages > 300) {
                System.out.println("Big Book: " + books[j].title);
            }
        }
    }
}



//jre grab bytecode java translate to Os install
//JVM java virtaul machine
//java two types primirives and  object



