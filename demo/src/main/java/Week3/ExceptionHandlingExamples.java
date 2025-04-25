package Week3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingExamples {

        public static  void main(String[] args){
            Scanner scanner= new Scanner(System.in);

            divideTwoNumbers(scanner);
            stringToIntConversion(scanner);
            getAgeInput(scanner);
            guessTheNumber(scanner);
            scanner.close();
        }


    // 1. Divide two numbers with exception handling
    public static void divideTwoNumbers(Scanner scanner)  {
        try {
            System.out.println("Enter first number: ");
            int a = scanner.nextInt();
            System.out.println("Enter Second number: ");
            int b = scanner.nextInt();

            int result = a / b;
            System.out.println("Result: " +result);

        } catch (ArithmeticException e){
            System.out.println("Cannot divide by Zero.");
        }catch (InputMismatchException e){
            System.out.println("Invalid input. Please enter integers");
            scanner.nextLine();
        }

    }

    // 2. String to int conversion with exception handling
    static void stringToIntConversion(Scanner scanner) {
        System.out.print("Enter a number as string: ");
        String input = scanner.next();
        try {
            int number = Integer.parseInt(input);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid string input for a number.");
        }
    }



    // 3. Ask for age input with loop until valid number
    static void getAgeInput(Scanner scanner) {
        int age = -1;
        while (true) {
            System.out.print("Enter your age: ");
            try {
                age = Integer.parseInt(scanner.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
        System.out.println("Your age is: " + age);
    }



    // 4. Guess the number game with input validation
    static void guessTheNumber(Scanner scanner) {
        int target = 7;
        System.out.print("Guess the number: ");
        try {
            int guess = Integer.parseInt(scanner.next());
            if (guess == target) {
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong! The number was " + target);
            }
        } catch (NumberFormatException e) {
            System.out.println("Not a valid number!");
        }
    }


}
