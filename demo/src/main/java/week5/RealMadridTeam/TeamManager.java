package week5.RealMadridTeam;  // This is the package where this class belongs

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;  // Import Scanner to read user input

// This class manages the Real Madrid team user interactions
public class TeamManager {
    private Team team;  // Stores the Real Madrid team

    // Constructor: Links this user interface to a specific team
    public TeamManager(Team team) {
        this.team = team;
    }

    // Displays the main menu and processes user input
    public void display() {
        Scanner scanner = new Scanner(System.in);  // Creates a Scanner object to read user input
        int choice;  // Stores the user's menu choice

        // Welcome message
        System.out.println("\n****************************************");
        System.out.println("🏆 Welcome to Real Madrid Team Management! 🏆");
        System.out.println("Manage your players, track stats, and build the best team!");
        System.out.println("****************************************");

        // Runs the menu in a loop until the user chooses to quit (99)
        do {
            System.out.println("\n⚽ Real Madrid Team Management ⚽");
            System.out.println("1 - Find players by position");
            System.out.println("2 - Find players by age range");
            System.out.println("3 - Find top goal scorers");
            System.out.println("4 - List ALL players");
            System.out.println("5 - Add a player");
            System.out.println("6 - Remove a player");
            System.out.println("99 - Quit");
            System.out.print("Enter choice: ");

            choice = scanner.nextInt();  // Reads user input
            scanner.nextLine();  // Consumes the newline character

            // Calls the correct method based on user choice
            switch (choice) {
                case 1 -> processGetPlayersByPosition(scanner);
                case 2 -> processGetPlayersByAge(scanner);
                case 3 -> processGetTopScorers(scanner);
                case 4 -> processGetAllPlayers();
                case 5 -> processAddPlayer(scanner);
                case 6 -> processRemovePlayer(scanner);
                case 99 -> System.out.println("Exiting application...");
                default -> System.out.println("Invalid option. Try again.");
            }
        } while (choice != 99);  // Loops until user chooses "99" to quit

        scanner.close();  // Closes the Scanner to free up system resources
    }

    // Displays all players in the team
    private void processGetAllPlayers() {
        List<Player> allPlayers = team.getAllPlayers();  // Retrieves all players
        displayPlayers(allPlayers);  // Calls method to print player list
    }

    // Searches for players by position
    private void processGetPlayersByPosition(Scanner scanner) {
        System.out.print("Enter position (Forward, Midfielder, Defender, Goalkeeper): ");
        String position = scanner.nextLine();

        List<Player> results = team.getPlayersByPosition(position);
        displayPlayers(results);
    }

    // Searches for players within an age range
    private void processGetPlayersByAge(Scanner scanner) {
        System.out.print("Enter minimum age: ");
        int min = scanner.nextInt();
        System.out.print("Enter maximum age: ");
        int max = scanner.nextInt();

        List<Player> results = team.getPlayersByAge(min, max);
        displayPlayers(results);
    }

    // Searches for players who scored at least a minimum number of goals
    private void processGetTopScorers(Scanner scanner) {
        System.out.print("Enter minimum goals scored: ");
        int minGoals = scanner.nextInt();

        List<Player> results = team.getTopScorers(minGoals);
        displayPlayers(results);
    }

    // Displays a list of players neatly
    private void displayPlayers(List<Player> players) {
        if (players.isEmpty()) {
            System.out.println("\nNo matching players found.");
        } else {
            System.out.println("\n⚽ Matching Players:");
            for (Player p : players) {
                System.out.println(p.getId() + " | " + p.getName() + " | " + p.getPosition() +
                        " | Age: " + p.getAge() + " | Goals: " + p.getGoals() + " | Assists: " + p.getAssists());
            }
        }
    }

    // Allows the user to add a new player
    private void processAddPlayer(Scanner scanner) {
        System.out.print("Enter Player ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Player Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Position: ");
        String position = scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        System.out.print("Enter Goals Scored: ");
        int goals = scanner.nextInt();
        System.out.print("Enter Assists: ");
        int assists = scanner.nextInt();

        Player player = new Player(id, name, position, age, goals, assists);
        team.addPlayer(player);
        System.out.println("✅ Player added successfully!");
    }

    // Allows the user to remove a player by entering their ID
    private void processRemovePlayer(Scanner scanner) {
        System.out.print("Enter Player ID to remove: ");
        int id = scanner.nextInt();

        Player toRemove = null;
        for (Player p : team.getAllPlayers()) {
            if (p.getId() == id) {
                toRemove = p;
                break;
            }
        }

        if (toRemove != null) {
            team.removePlayer(toRemove);
            System.out.println("✅ Player removed successfully!");
        } else {
            System.out.println("⚠ Player not found!");
        }
    }


}
