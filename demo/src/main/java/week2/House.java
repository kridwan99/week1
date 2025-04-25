package week2;

public class House {
    static String latinName = "domus";
    String color;
    int numberOfRooms;
    boolean hasGarden;
    double sizeInSquareMeters;

    // Constructor
    public House(String color, int numberOfRooms, boolean hasGarden, double sizeInSquareMeters) {
        this.color = color;
        this.numberOfRooms = numberOfRooms;
        this.hasGarden = hasGarden;
        this.sizeInSquareMeters = sizeInSquareMeters;
    }

    public void openDoor() {
        System.out.println("Opening the door of a " + color + " house with " + numberOfRooms + " rooms.");
    }

    @Override
    public String toString() {
        return "House{" +
                "color='" + color + '\'' +
                ", rooms=" + numberOfRooms +
                ", hasGarden=" + hasGarden +
                ", size=" + sizeInSquareMeters + "sqm" +
                '}';
    }
}
