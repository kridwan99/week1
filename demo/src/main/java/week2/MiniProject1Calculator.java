package week2;
 import  java.util.Scanner;
public class MiniProject1Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the First number:");   // Get the first number
        double num1 = Double.parseDouble(scanner.nextLine());
        //scanner .double

        System.out.println("Enter second number: ");  //Get the second number
        double num2 = Double.parseDouble(scanner.nextLine());

        System.out.print("Choose an operator (+, -, *, /): ");  //Get the operator
        String operator = scanner.nextLine();

        double result;

        if (operator.equals("+")) {
            result = num1 + num2;
        } else if (operator.equals("-")) {
            result = num1 - num2;
        } else if (operator.equals("*")) {
            result = num1 * num2;
        } else if (operator.equals("/")) {
            if (num2 == 0) {
                System.out.println("Error: Division by zero!");
                return;
            }
            result = num1 / num2;
        } else {
            System.out.println("Unknown operator!");
            return;
        }


        System.out.println("Result: " + result);

    }

    //


}
