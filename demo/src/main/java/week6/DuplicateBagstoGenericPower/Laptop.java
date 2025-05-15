package week6.DuplicateBagstoGenericPower;

public class Laptop {
    private String brand;

    // Constructor
    public Laptop(String brand) {
        this.brand = brand;
    }

    // Getter
    public String getBrand() {
        return brand;
    }

    // Setter
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Laptop: " + brand;
    }
}
