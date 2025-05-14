package week6.AmusementParkPasses;

import java.util.ArrayList;

public class GroupBooking {
    private ArrayList<Pass> passes = new ArrayList<>();

    public void addPass(Pass pass){
        passes.add(pass);
    }

    public  void  printSummary() {
        double total = 0;

        System.out.println(" Ticket Summary:");
        System.out.printf("%-15s | %-6s%n", "Name", "Price");
        System.out.println("-----------------|--------");

        for (Pass pass : passes) {

            double price = pass.calculateFinalPrice();
            System.out.printf("%-15s | $%5.2f%n", pass.getHolderName(), price);
            total += price;
        }

        System.out.println("-----------------|--------");
        System.out.printf("%-15s | $%5.2f%n", "Total Revenue", total);
    }
}
