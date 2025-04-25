import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your name: ");
        String name = scanner.nextLine();


        System.out.print("Enter hours worked: ");
        float hoursWorked = scanner.nextFloat();


        System.out.print("Enter your pay rate: ");
        float payRate = scanner.nextFloat();


        float grossPay = hoursWorked * payRate;

        System.out.println("Employee Name: " + name);
        System.out.println("Gross Pay: €" + grossPay);


        scanner.close();
    }
}
