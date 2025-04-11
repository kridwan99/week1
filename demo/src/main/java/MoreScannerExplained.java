import java.util.Scanner;

public class MoreScannerExplained {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float firstNumber = scanner.nextFloat();


        System.out.print("Enter the second number: ");
        float secondNumber = scanner.nextFloat();


        System.out.println("Possible calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");


        System.out.print("Please select an option: ");
        char option = scanner.next().toUpperCase().charAt(0);


        float result = firstNumber * secondNumber;


        System.out.println(firstNumber + " * " + secondNumber + " = " + result);


        scanner.close();
    }
}
