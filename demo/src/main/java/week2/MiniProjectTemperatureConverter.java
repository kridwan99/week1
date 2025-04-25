package week2;
import  java.util.Scanner;
public class MiniProjectTemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ask the User Which Conversion They Want
        System.out.print("Type C to convert from Celsius to Fahrenheit, or F to convert from Fahrenheit to Celsius: ");
        String choice = scanner.nextLine().toUpperCase();


            //Ask for the Temperature to Convert
            System.out.println("Enter the temperature: ");
            double inputTemp = Double.parseDouble(scanner.nextLine());

            double converted;

            if(choice.equals("C")){
                converted = (inputTemp * 9 / 5) +32;
                System.out.println(inputTemp + "°C is " + converted + "°F");

            } else if (choice.equals("F")) {
                converted = (inputTemp - 32) * 5 / 9;
                System.out.println(inputTemp + "°F is " + converted + "°C");
            }else {
                System.out.println("Invalid Choice.");
                return;
            }
            int rounded = (int) converted;
            System.out.println(" Rounded: " + rounded + "°");

    }
}
