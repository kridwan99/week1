package week5.ExerciseStaticClasses;

public class Person {
    // Private fields
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;  // New field for suffix

    // Constructor
    public Person(String firstName, String middleName, String lastName, String suffix) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = suffix;
    }

    // Getters and Setters
    public String FirstName() {
        return firstName;
    }

    public void FirstName(String firstName) {
        this.firstName = firstName;
    }

    public String MiddleName() {
        return middleName;
    }

    public void MiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String LastName() {
        return lastName;
    }

    public void LastName(String lastName) {
        this.lastName = lastName;
    }

    public String Suffix() {
        return suffix;
    }

    public void Suffix(String suffix) {
        this.suffix = suffix;
    }

    // Method to return the full name with suffix
    public String frisNameName() {
        String fullName = firstName + " " + middleName + " " + lastName;
        if (suffix != null && !suffix.isEmpty()) {
            fullName += ", " + suffix;  // Add suffix if provided
        }
        return fullName;
    }
}
