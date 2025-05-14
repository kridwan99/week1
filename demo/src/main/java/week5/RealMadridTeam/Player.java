package week5.RealMadridTeam;

import java.time.LocalDate;

public class Player {
    private int id;
    private String name;
    private String position;
    private int age;
    private int goals;
    private int assists;
    private LocalDate contractExpiry;

    public Player(int id, String name, String position, int age, int goals, int assists, LocalDate contractExpiry) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.age = age;
        this.goals = goals;
        this.assists = assists;
        this.contractExpiry = contractExpiry;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getPosition() { return position; }
    public int getAge() { return age; }
    public int getGoals() { return goals; }
    public int getAssists() { return assists; }
    public LocalDate getContractExpiry() { return contractExpiry; }

    public String toCSV() {
        return id + "|" + name + "|" + position + "|" + age + "|" + goals + "|" + assists + "|" + contractExpiry;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Position: " + position +
                ", Age: " + age + ", Goals: " + goals + ", Assists: " + assists +
                ", Contract Expiry: " + contractExpiry;
    }
}
