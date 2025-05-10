package week5.CarDealership;  // This class belongs to the package

import java.util.ArrayList;  // Import ArrayList to store vehicles
import java.util.List;  // Import List to manage inventory

// This class represents a dealership with multiple vehicles
public class Dealership {
    private String name;  // Name of the dealership
    private String address;  // Address of the dealership
    private String phone;  // Contact number
    private List<Vehicle> inventory;  // List of vehicles in dealership inventory

    // Constructor initializes dealership information and creates an empty inventory list
    public Dealership(String name, String address, String phone) {
        this.name = name;  // Set dealership name
        this.address = address;  // Set dealership address
        this.phone = phone;  // Set dealership contact phone number
        this.inventory = new ArrayList<>();  // Create an empty list to store vehicles
    }

    // Getter methods return dealership information
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }  // Setter method to update dealership name

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }  // Setter method to update dealership address

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }  // Setter method to update dealership phone number

    // Returns the full list of vehicles available in the inventory
    public List<Vehicle> getAllVehicles() { return inventory; }

    // Adds a vehicle to the inventory
    public void addVehicle(Vehicle vehicle) { inventory.add(vehicle); }

    // Removes a vehicle from the inventory
    public void removeVehicle(Vehicle vehicle) { inventory.remove(vehicle); }

    // 🔎 Searches for vehicles within a price range
    public List<Vehicle> getVehiclesByPrice(double min, double max) {
        List<Vehicle> matchingVehicles = new ArrayList<>();  // Create an empty list to store matching vehicles
        for (Vehicle v : inventory) {  // Loop through all vehicles in the inventory
            if (v.getPrice() >= min && v.getPrice() <= max) {  // If vehicle price falls within the range
                matchingVehicles.add(v);  // Add matching vehicle to the list
            }
        }
        return matchingVehicles;  // Return the list of matching vehicles
    }

    // 🔎 Searches for vehicles by make and model
    public List<Vehicle> getVehiclesByMakeModel(String make, String model) {
        List<Vehicle> matchingVehicles = new ArrayList<>();  // Create an empty list
        for (Vehicle v : inventory) {  // Loop through all vehicles
            if (v.getMake().equalsIgnoreCase(make) && v.getModel().equalsIgnoreCase(model)) {  // If make & model match
                matchingVehicles.add(v);  // Add vehicle to matching list
            }
        }
        return matchingVehicles;  // Return found vehicles
    }

    // 🔎 Searches for vehicles within a year range
    public List<Vehicle> getVehiclesByYear(int min, int max) {
        List<Vehicle> matchingVehicles = new ArrayList<>();
        for (Vehicle v : inventory) {  // Loop through all vehicles
            if (v.getYear() >= min && v.getYear() <= max) {  // If vehicle year is within range
                matchingVehicles.add(v);  // Add matching vehicle to the list
            }
        }
        return matchingVehicles;
    }

    // 🔎 Searches for vehicles by color
    public List<Vehicle> getVehiclesByColor(String color) {
        List<Vehicle> matchingVehicles = new ArrayList<>();
        for (Vehicle v : inventory) {  // Loop through vehicles
            if (v.getColor().equalsIgnoreCase(color)) {  // If color matches
                matchingVehicles.add(v);  // Add vehicle to list
            }
        }
        return matchingVehicles;
    }

    // 🔎 Searches for vehicles within a mileage range
    public List<Vehicle> getVehiclesByMileage(int min, int max) {
        List<Vehicle> matchingVehicles = new ArrayList<>();
        for (Vehicle v : inventory) {  // Loop through all vehicles
            if (v.getOdometer() >= min && v.getOdometer() <= max) {  // If mileage falls within range
                matchingVehicles.add(v);  // Add vehicle to matching list
            }
        }
        return matchingVehicles;
    }

    // 🔎 Searches for vehicles by type (SUV, truck, etc.)
    public List<Vehicle> getVehiclesByType(String vehicleType) {
        List<Vehicle> matchingVehicles = new ArrayList<>();
        for (Vehicle v : inventory) {  // Loop through all vehicles
            if (v.getVehicleType().equalsIgnoreCase(vehicleType)) {  // If vehicle type matches
                matchingVehicles.add(v);  // Add matching vehicle to the list
            }
        }
        return matchingVehicles;
    }
}
