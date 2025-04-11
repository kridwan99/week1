import java.util.Scanner;

public class ScannerExplained {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("hi who are you? ");
        String name = scanner.nextLine();
        System.out.println("Welcome" + name );
        System.out.println("please enter  your weight in kgs ");
        double weight = scanner.nextDouble();
        System.out.println("please enter  your height in meters ");
        double height = scanner.nextDouble();
        double bmi = weight / Math.pow(height, 2);
        System.out.println(bmi);

    }
}
