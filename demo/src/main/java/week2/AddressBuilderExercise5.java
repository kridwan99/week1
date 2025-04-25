package week2;
 import java.util.Scanner;
public class AddressBuilderExercise5 {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        StringBuilder addressInfo = new StringBuilder();

        System.out.println("Full Name:");
        String FullName = scanner.nextLine();
        addressInfo.append(FullName).append("\n");



                System.out.println("Billing Address: ");
                System.out.println(" Street: ");
                String billingStreet = scanner.nextLine();

                System.out.println("City: ");
                String billingCity = scanner.nextLine();

                System.out.println("State: ");
                String billingState = scanner.nextLine();

                System.out.println("Zip: ");
                String billingZip = scanner.nextLine();

                addressInfo.append("Billing Address: \n");
                addressInfo.append(billingStreet).append("\n");
                addressInfo.append(billingCity).append(" , ").append(billingState).append(" ").append(billingZip).append("\n");



            System.out.println("\n--- Address Info ---");
            System.out.println(addressInfo);







    }
}
