import java.util.HashMap;
import java.util.Map;

public class HashMapMiniExercise {
    public static void main(String[] args) {
        HashMap<String, String> countryCapital = new HashMap<>();

        countryCapital.put("France", "Paris");
        countryCapital.put("Netherlands", "Amsterdam");
        countryCapital.put("UK", "London");

        String countryToFind = "Netherlands";
        System.out.println("Capital of " + countryToFind + ": " + countryCapital.get(countryToFind));

        countryCapital.put("UK", "Edinburgh");

        String countryToCheck = "France";
        System.out.println("Does " + countryToCheck + " exist? " + countryCapital.containsKey(countryToCheck));

        System.out.println("\nCountry-Capital Pairs:");
        for (Map.Entry<String, String> entry : countryCapital.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        System.out.println("\nList of Countries:");
        for (String country : countryCapital.keySet()) {
            System.out.println(country);
        }

        System.out.println("\nList of Capitals:");
        for (String capital : countryCapital.values()) {
            System.out.println(capital);
        }
    }
}
