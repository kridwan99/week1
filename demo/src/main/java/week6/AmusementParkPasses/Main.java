package week6.AmusementParkPasses;

public class Main {
    public static void main(String[] args) {
        GroupBooking booking = new GroupBooking();

        booking.addPass(new ChildPass("Tommy", 40.0));
        booking.addPass(new AdultPass("Alice", 60.0));
        booking.addPass(new SeniorPass("Grandpa Joe", 50.0));

        booking.printSummary();
    }
}
