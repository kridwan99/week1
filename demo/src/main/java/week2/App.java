package week2;

public class App {
    public static void main(String[] args) {
        System.out.println("Latin word for house: " + House.latinName);
        System.out.println("Latin word for car: " + Car.latinName);
        System.out.println();

        // Create House objects
        House myHouse = new House("blue", 5, true, 120.5);
        House hauntedHouse = new House("dark purple", 13, false, 666.6);

        // Create Car objects
        Car tesla = new Car("Tesla", "black", 2025, true);
        Car oldBeetle = new Car("Volkswagen Beetle", "red", 1969, false);

        // Use methods
        myHouse.openDoor();
        hauntedHouse.openDoor();
        System.out.println();

        tesla.startEngine();
        oldBeetle.startEngine();
        System.out.println();


        System.out.println(myHouse);
        System.out.println(hauntedHouse);
        System.out.println(tesla);
        System.out.println(oldBeetle);
        System.out.println();


        Car anotherTesla = tesla;
        anotherTesla.color = "matte black";
        System.out.println("Tesla's new color? " + tesla.color); // Shows "matte black" because both refer to same object
    }
}
