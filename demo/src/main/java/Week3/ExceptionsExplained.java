package Week3;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionsExplained {

    public static void main(String[] args) {
        String name = null;

        // Null check before calling substring to avoid NullPointerException
        if (name != null) {
            System.out.println(name.substring(0));
        }

        try {
            // Fix: Add parentheses after 'if' condition
            if (Math.random() > 0.5) {
                // Fix: Move throw statement inside block with braces
                throw new FileNotFoundException("Fake Exception");
            }
        } catch (FileNotFoundException e) {
            // Catch block to handle the exception
            System.out.println("Caught exception: " + e.getMessage());
        }
    }


    static void stringToIntConversion(Scanner scanner){
        System.out.println("Enter a number as string:");
    }



}
