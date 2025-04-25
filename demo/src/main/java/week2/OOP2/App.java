package week2.OOP2;

public class App {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Alex");
        p.setAge(-5); // Triggers warning
        p.setFavoriteColor("blue");

        System.out.println(p.getName() + " is " + p.getAge() + " years old and loves " + p.getFavoriteColor());
    }
}


