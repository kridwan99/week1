package week5.CarDealership;  // This is the package where this class belongs

// This class represents a single vehicle in the dealership
public class Vehicle {
    private int vin;       // Unique Vehicle Identification Number (VIN)
    private int year;      // Year the vehicle was made
    private String make;   // Brand of the vehicle (e.g., Toyota)
    private String model;  // Model name of the vehicle (e.g., Corolla)
    private String vehicleType;  // Type of vehicle (car, truck, SUV, etc.)
    private String color;  // Color of the vehicle
    private int odometer;  // Total miles driven
    private double price;  // Price of the vehicle in dollars

    // Constructor: Creates a new vehicle with all its details
    public Vehicle(int vin, int year, String make, String model, String vehicleType, String color, int odometer, double price) {
        this.vin = vin;  // Assigning the VIN number
        this.year = year;  // Assigning the year of manufacture
        this.make = make;  // Assigning the brand
        this.model = model;  // Assigning the model name
        this.vehicleType = vehicleType;  // Assigning the type of vehicle
        this.color = color;  // Assigning the color
        this.odometer = odometer;  // Assigning the mileage
        this.price = price;  // Assigning the price
    }

    // Getter & Setter methods: These allow access and modification of private attributes

    public int getVin() { return vin; }  // Returns the VIN
    public void setVin(int vin) { this.vin = vin; }  // Sets a new VIN

    public int getYear() { return year; }  // Returns the year of manufacture
    public void setYear(int year) { this.year = year; }  // Sets a new year

    public String getMake() { return make; }  // Returns the vehicle brand
    public void setMake(String make) { this.make = make; }  // Sets a new brand

    public String getModel() { return model; }  // Returns the model name
    public void setModel(String model) { this.model = model; }  // Sets a new model

    public String getVehicleType() { return vehicleType; }  // Returns the type (car/truck)
    public void setVehicleType(String vehicleType) { this.vehicleType = vehicleType; }  // Sets a new type

    public String getColor() { return color; }  // Returns the color
    public void setColor(String color) { this.color = color; }  // Sets a new color

    public int getOdometer() { return odometer; }  // Returns the mileage
    public void setOdometer(int odometer) { this.odometer = odometer; }  // Sets a new mileage

    public double getPrice() { return price; }  // Returns the price
    public void setPrice(double price) { this.price = price; }  // Sets a new price
}
