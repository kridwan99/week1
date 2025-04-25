package week2;
import java.util.Scanner;
public class MiniProject3Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Asks the user for the bill amount.
        System.out.println("Enter the  bill amount: ");
        String billText = input.nextLine();
        double bill = Double.parseDouble(billText);


        //Asks the user for the desired tip percentage.
        System.out.println("Enter tip  percentage: ");
        String tipText = input.nextLine();
         double tipPercent = Double.parseDouble(tipText);


        //If tip percentage is less than 10%, print a cheeky message like: “Cheapskate alert 😅
         if(tipPercent <10){
             System.out.println("Cheapskate alert HAHAHA! ");
         }
            // Calculate the tip and total
         double tip = bill * tipPercent / 100;
         double total = bill + tip;

            //Round the total for fun.
         double roundUp = Math.ceil(total);
         double roundDown = Math.floor(total);


         System.out.println(" How many people to split the bill with? ");
         String peopleText = input.nextLine();
         int people = Integer.parseInt(peopleText);

         double perPerson = total / people;






        System.out.println("Tip amount: $" + tip);
        System.out.println("Total bill: $" + total);
        System.out.println("Rounded up total: $" + roundUp);
        System.out.println("Rounded down total: $" + roundDown);
        System.out.println("Each person pays: $" + perPerson);






    }
}
