package week2;

import java.util.Scanner;

public class MiniProject2Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence :"); // Asks the user to input a sentence.
        String sentence = input.nextLine();

        int characters =  sentence.length();
        System.out.println("Number of characters: "); //Shows the number of characters.

        String[] words = sentence.split(" ");
        int wordCount = words.length;
        System.out.println(" Number of words: " + wordCount); //Shows the number of words.


        if (sentence.length() > 0){
            char first = sentence.charAt(0);
            char last = sentence.charAt(sentence.length() - 1);
            System.out.println("First character: " + first);
            System.out.println("Last character:" + last);
        }


    }
}
