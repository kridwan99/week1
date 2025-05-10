package week5.CarDealership;  // This class belongs to the package

import java.util.List;   // Import List for handling multiple vehicles
import java.util.Scanner;  // Import Scanner to read user input

// This class manages the dealership interface and user interactions
public class UserInterface {
    private Dealership dealership;  // Stores the dealership information

    // Constructor: Links this User Interface to a specific dealership
    public UserInterface(Dealership dealership) {
        this.dealership = dealership;
    }

    // Displays the main menu and processes user input
    public void display() {
        Scanner scanner = new Scanner(System.in);  // Creates a Scanner object to read user input
        int choice;  // Stores the user's menu choice

        // Runs the menu in a loop until the user chooses to quit (99)
        do {
            System.out.println("\n🚗 Dealer Management System 🚗");
            System.out.println("1 - Find vehicles within a price range");
            System.out.println("2 - Find vehicles by make / model");
            System.out.println("3 - Find vehicles by year range");
            System.out.println("4 - Find vehicles by color");
            System.out.println("5 - Find vehicles by mileage range");
            System.out.println("6 - Find vehicles by type (car, truck, SUV, van)");
            System.out.println("7 - List ALL Vehicles");
            System.out.println("8 - Add a vehicle");
            System.out.println("9 - Remove a vehicle");
            System.out.println("99 - Quit");
            System.out.print("Enter choice: ");

            choice = scanner.nextInt();  // Reads user input
            scanner.nextLine();  // Consumes the newline character

            // Calls the correct method for each option
            switch (choice) {
                case 1 -> processGetByPriceRequest(scanner);
                case 2 -> processGetByMakeModelRequest(scanner);
                case 3 -> processGetByYearRequest(scanner);
                case 4 -> processGetByColorRequest(scanner);
                case 5 -> processGetByMileageRequest(scanner);
                case 6 -> processGetByVehicleTypeRequest(scanner);
                case 7 -> processGetAllVehiclesRequest();
                case 8 -> processAddVehicleRequest(scanner);
                case 9 -> processRemoveVehicleRequest(scanner);
                case 99 -> System.out.println("Exiting application...");
                default -> System.out.println("Invalid option. Try again.");
            }
        } while (choice != 99);  // Loops until user chooses "99" to quit

        scanner.close();  // Closes the Scanner to free up system resources
    }

    // Displays all vehicles in the dealership inventory
    private void processGetAllVehiclesRequest() {
        List<Vehicle> allVehicles = dealership.getAllVehicles();  // Retrieves all vehicles
        displayVehicles(allVehicles);  // Calls method to print vehicle list
    }

    // Searches for vehicles within a price range
    private void processGetByPriceRequest(Scanner scanner) {
        System.out.print("Enter minimum price: ");
        double min = scanner.nextDouble();
        System.out.print("Enter maximum price: ");
        double max = scanner.nextDouble();

        List<Vehicle> results = dealership.getVehiclesByPrice(min, max);
        displayVehicles(results);
    }

    // Searches for vehicles by make and model
    private void processGetByMakeModelRequest(Scanner scanner) {
        System.out.print("Enter make: ");
        String make = scanner.nextLine();
        System.out.print("Enter model: ");
        String model = scanner.nextLine();

        List<Vehicle> results = dealership.getVehiclesByMakeModel(make, model);
        displayVehicles(results);
    }

    // Searches for vehicles within a year range
    private void processGetByYearRequest(Scanner scanner) {
        System.out.print("Enter minimum year: ");
        int min = scanner.nextInt();
        System.out.print("Enter maximum year: ");
        int max = scanner.nextInt();

        List<Vehicle> results = dealership.getVehiclesByYear(min, max);
        displayVehicles(results);
    }

    // Searches for vehicles by color
    private void processGetByColorRequest(Scanner scanner) {
        System.out.print("Enter color: ");
        String color = scanner.nextLine();

        List<Vehicle> results = dealership.getVehiclesByColor(color);
        displayVehicles(results);
    }

    // Searches for vehicles within a mileage range
    private void processGetByMileageRequest(Scanner scanner) {
        System.out.print("Enter minimum mileage: ");
        int min = scanner.nextInt();
        System.out.print("Enter maximum mileage: ");
        int max = scanner.nextInt();

        List<Vehicle> results = dealership.getVehiclesByMileage(min, max);
        displayVehicles(results);
    }

    // Searches for vehicles by type (SUV, truck, etc.)
    private void processGetByVehicleTypeRequest(Scanner scanner) {
        System.out.print("Enter vehicle type (car, truck, SUV, etc.): ");
        String type = scanner.nextLine();

        List<Vehicle> results = dealership.getVehiclesByType(type);
        displayVehicles(results);
    }

    // Displays a list of vehicles neatly
    private void displayVehicles(List<Vehicle> vehicles) {
        if (vehicles.isEmpty()) {
            System.out.println("\nNo vehicles found.");
        } else {
            System.out.println("\n🚙 Matching Vehicles:");
            for (Vehicle v : vehicles) {
                System.out.println(v.getVin() + " | " + v.getYear() + " | " + v.getMake() + " | " +
                        v.getModel() + " | " + v.getVehicleType() + " | " + v.getColor() +
                        " | " + v.getOdometer() + " miles | $" + v.getPrice());
            }
        }
    }

    // Allows the user to add a new vehicle
    private void processAddVehicleRequest(Scanner scanner) {
        System.out.print("Enter VIN: ");
        int vin = scanner.nextInt();
        System.out.print("Enter Year: ");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Make: ");
        String make = scanner.nextLine();
        System.out.print("Enter Model: ");
        String model = scanner.nextLine();
        System.out.print("Enter Type (car/truck/etc.): ");
        String type = scanner.nextLine();
        System.out.print("Enter Color: ");
        String color = scanner.nextLine();
        System.out.print("Enter Mileage: ");
        int mileage = scanner.nextInt();
        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();

        Vehicle vehicle = new Vehicle(vin, year, make, model, type, color, mileage, price);
        dealership.addVehicle(vehicle);
        System.out.println("✅ Vehicle added successfully!");
    }

    // Allows the user to remove a vehicle by entering its VIN
    private void processRemoveVehicleRequest(Scanner scanner) {
        System.out.print("Enter VIN of vehicle to remove: ");
        int vin = scanner.nextInt();

        Vehicle toRemove = null;
        for (Vehicle v : dealership.getAllVehicles()) {
            if (v.getVin() == vin) {
                toRemove = v;
                break;
            }
        }

        if (toRemove != null) {
            dealership.removeVehicle(toRemove);
            System.out.println("✅ Vehicle removed successfully!");
        } else {
            System.out.println("⚠ Vehicle not found!");
        }
    }
}
