package week7;

public class Fish  implements prey,Predator{
    @Override
    public void hunt() {
        System.out.println("*this  fish is hunting smaller fish*");

    }

    @Override
    public void flee() {

        System.out.println("*this fish is fleeing from a large fish*");

    }
}
