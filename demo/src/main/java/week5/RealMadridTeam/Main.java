package week5.RealMadridTeam;  // This is the package where this class belongs

// This class starts the Real Madrid team management system
public class Main {
    public static void main(String[] args) {
        // Create a new Real Madrid team
        Team realMadrid = new Team("Real Madrid", "Santiago Bernabéu");

        // Create the user interface and link it to the team
        TeamManager ui = new TeamManager(realMadrid);

        // Start the program by calling the display method
        ui.display();
    }
}
