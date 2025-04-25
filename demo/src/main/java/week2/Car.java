package week2;

public class Car {
    static String latinName = "autocinetum";
    String brand;
    String color;
    int year;
    boolean isElectric;

    // Constructor
    public Car(String brand, String color, int year, boolean isElectric) {
        this.brand = brand;
        this.color = color;
        this.year = year;
        this.isElectric = isElectric;
    }

    public void startEngine() {
        System.out.println("Starting the " + (isElectric ? "silent electric" : "rumbling") + " engine of the " + color + " " + brand + ".");
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", isElectric=" + isElectric +
                '}';
    }
}
