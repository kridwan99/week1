package week5.RealMadridTeam;  // This is the package where this class belongs

// This class represents a single player in the Real Madrid team
public class Player {
    private int id;       // Unique Player ID
    private String name;  // Player's name
    private String position;  // Player's position (Forward, Midfielder, Defender, Goalkeeper)
    private int age;      // Player's age
    private int goals;    // Number of goals scored
    private int assists;  // Number of assists made

    // Constructor: Creates a new player with all their details
    public Player(int id, String name, String position, int age, int goals, int assists) {
        this.id = id;  // Assigning the player ID
        this.name = name;  // Assigning the name
        this.position = position;  // Assigning the position (Forward, Midfielder, etc.)
        this.age = age;  // Assigning the age
        this.goals = goals;  // Assigning the number of goals
        this.assists = assists;  // Assigning the number of assists
    }

    // Getter & Setter methods: These allow access and modification of private attributes

    public int getId() { return id; }  // Returns the player ID
    public void setId(int id) { this.id = id; }  // Sets a new player ID

    public String getName() { return name; }  // Returns the player's name
    public void setName(String name) { this.name = name; }  // Sets a new name

    public String getPosition() { return position; }  // Returns the player's position
    public void setPosition(String position) { this.position = position; }  // Sets a new position

    public int getAge() { return age; }  // Returns the player's age
    public void setAge(int age) { this.age = age; }  // Sets a new age

    public int getGoals() { return goals; }  // Returns the player's total goals
    public void setGoals(int goals) { this.goals = goals; }  // Sets the number of goals

    public int getAssists() { return assists; }  // Returns the player's total assists
    public void setAssists(int assists) { this.assists = assists; }  // Sets the number of assists
}
