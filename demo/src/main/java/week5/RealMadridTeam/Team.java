package week5.RealMadridTeam;  // This is the package where this class belongs

import java.util.ArrayList;  // Import ArrayList to store players
import java.util.List;  // Import List to manage the team roster

// This class represents the Real Madrid team and manages player roster
public class Team {
    private String name;  // Team name (Real Madrid)
    private String stadium;  // Home stadium
    private List<Player> roster;  // List of players in the team

    // Constructor initializes team name, stadium, and creates an empty roster
    public Team(String name, String stadium) {
        this.name = name;  // Assigning the team name
        this.stadium = stadium;  // Assigning the stadium name
        this.roster = new ArrayList<>();  // Initializing an empty list to store players
    }

    // Getter & Setter methods: Allow access and modification of private attributes

    public String getName() { return name; }  // Returns the team name
    public void setName(String name) { this.name = name; }  // Sets a new team name

    public String getStadium() { return stadium; }  // Returns the stadium name
    public void setStadium(String stadium) { this.stadium = stadium; }  // Sets a new stadium name

    public List<Player> getAllPlayers() { return roster; }  // Returns the full list of players

    public void addPlayer(Player player) { roster.add(player); }  // Adds a player to the roster

    public void removePlayer(Player player) { roster.remove(player); }  // Removes a player from the roster

    // 🔎 Searches for players by position
    public List<Player> getPlayersByPosition(String position) {
        List<Player> matchingPlayers = new ArrayList<>();  // Create an empty list
        for (Player p : roster) {  // Loop through all players
            if (p.getPosition().equalsIgnoreCase(position)) {  // If position matches
                matchingPlayers.add(p);  // Add player to list
            }
        }
        return matchingPlayers;  // Return found players
    }

    // 🔎 Searches for players within an age range
    public List<Player> getPlayersByAge(int min, int max) {
        List<Player> matchingPlayers = new ArrayList<>();
        for (Player p : roster) {  // Loop through all players
            if (p.getAge() >= min && p.getAge() <= max) {  // If player's age is within range
                matchingPlayers.add(p);  // Add matching player to list
            }
        }
        return matchingPlayers;
    }

    // 🔎 Searches for players who scored at least a minimum number of goals
    public List<Player> getTopScorers(int minGoals) {
        List<Player> matchingPlayers = new ArrayList<>();
        for (Player p : roster) {  // Loop through players
            if (p.getGoals() >= minGoals) {  // If goals meet the criteria
                matchingPlayers.add(p);  // Add player to the list
            }
        }
        return matchingPlayers;
    }
}
