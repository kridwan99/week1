package week7.Interface.EXERCISE2Page91;

import java.util.*;
import java.util.stream.*;

public class StreamsPart2 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35),
                new Person("David", 20),
                new Person("Eve", 40)
        );

        String searchTerm = "B";
        List<Person> filteredNames = people.stream()
                .filter(p -> p.getName().toLowerCase().contains(searchTerm.toLowerCase()))
                .collect(Collectors.toList());

        System.out.println("Filtered names containing '" + searchTerm + "': " + filteredNames);

        double averageAge = people.stream()
                .mapToInt(Person::getAge)
                .average()
                .orElse(0);

        System.out.println("Average age: " + averageAge);

        int oldest = people.stream()
                .mapToInt(Person::getAge)
                .max()
                .orElse(0);

        int youngest = people.stream()
                .mapToInt(Person::getAge)
                .min()
                .orElse(0);

        System.out.println("Oldest age: " + oldest);
        System.out.println("Youngest age: " + youngest);
    }
}
