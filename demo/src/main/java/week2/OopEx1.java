package week2;

public class OopEx1 {
public static void main(String[] args) {
    // Print static class variables
    System.out.println(CatOopEx.latinName);
    System.out.println(DogOopEx.latinName);

    // Create and setup cat
    CatOopEx zia = new CatOopEx();
    zia.name = "Zia";
    zia.color = "white";
    zia.age = 2;
    zia.isFluffy = true;

    // Create and setup dog
    DogOopEx wiesje = new DogOopEx();
    wiesje.name = "Wiesje";
    wiesje.breed = "Dachshund";
    wiesje.age = 4;
    wiesje.isGoodBoy = false;

    // Call their methods
    zia.meow();
    wiesje.bark();

    // Object reference test
    CatOopEx anotherZia = zia;
    anotherZia.color = "gray";
    System.out.println("Zia's new color? " + zia.color);
}
}
