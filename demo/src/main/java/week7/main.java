package week7;

public class main {

    //interface = a template that can be Applied to a class.
    //  similar to inheritance, but specifies what a class has/must do.
    // classes can apply more than one interface, inheritance is limited to 1 super


    public static void main(String[] args) {
       // Rabbit rabbit = new Rabbit();
       // rabbit.flee();

        Hawk  hawk = new Hawk();
        hawk.hunt();


        Fish fish = new Fish();
        fish.hunt();
        fish.flee();
    }

}
