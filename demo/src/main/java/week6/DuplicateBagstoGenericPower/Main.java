package week6.DuplicateBagstoGenericPower;

public class Main {
    public static void main(String[] args) {
        // Laptop Bag
        Bag<Laptop> laptopBag = new Bag<>();
        laptopBag.add(new Laptop("Apple"));
        laptopBag.add(new Laptop("Dell"));

        System.out.println("Laptops in the bag:");
        laptopBag.printContents();

        // Chihuahua Bag
        Bag<Chihuahua> chihuahuaBag = new Bag<>();
        chihuahuaBag.add(new Chihuahua("Mr. Fluffypaws"));
        chihuahuaBag.add(new Chihuahua("Tiny"));

        System.out.println("\nChihuahuas in the bag:");
        chihuahuaBag.printContents();

        // Bonus: Bag of Strings
        Bag<String> stringBag = new Bag<>();
        stringBag.add("Hello");
        stringBag.add("Generics");

        System.out.println("\nStrings in the bag:");
        stringBag.printContents();

        // Bonus: First items
        System.out.println("\nFirst laptop: " + laptopBag.getFirstItem());
        System.out.println("First chihuahua: " + chihuahuaBag.getFirstItem());
        System.out.println("First string: " + stringBag.getFirstItem());
    }
}
