package week5.CarDealership;  // This class belongs to the same package as other classes

// This is the main class that starts the program
public class Main {
    public static void main(String[] args) {
        // Creates a new dealership with basic information
        Dealership dealership = new Dealership("D & B Used Cars", "111 Old Benbrook Rd", "817-555-5555");

        // Creates the user interface and links it to the dealership
        UserInterface ui = new UserInterface(dealership);

        // Starts the program by calling the display method
        ui.display();
    }
}
