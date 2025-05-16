package week5.RealMadridTeam;

import week5.RealMadridTeam.contracts.*;

import java.time.LocalDate;
import java.util.Scanner;

public class UserInterface {
    private Team team;
    private Scanner scanner;

    public UserInterface() {
        this.team = new Team("Real Madrid", "Santiago Bernabéu Stadium");
        this.scanner = new Scanner(System.in);
    }

    public void display() {
        while (true) {
            System.out.println("\n==============================================");
            System.out.println("        Real Madrid Team Management System     ");
            System.out.println("==============================================");
            System.out.println("1 - List All Players");
            System.out.println("2 - Search Players by Name");
            System.out.println("3 - Search Players by Age Range");
            System.out.println("4 - Add a Player");
            System.out.println("5 - Remove a Player");
            System.out.println("6 - Transfer or Loan a Player");
            System.out.println("99 - Quit");
            System.out.print("\nEnter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            System.out.println();

            switch (choice) {
                case 1 -> {
                    System.out.println("Listing all players:\n");
                    team.displayPlayers();
                    System.out.println();
                }
                case 2 -> {
                    processSearchByName();
                    System.out.println();
                }
                case 3 -> {
                    processSearchByAgeRange();
                    System.out.println();
                }
                case 4 -> {
                    processAddPlayer();
                    System.out.println();
                }
                case 5 -> {
                    processRemovePlayer();
                    System.out.println();
                }
                case 6 -> {
                    processContractTransaction();
                    System.out.println();
                }
                case 99 -> {
                    System.out.println("Exiting... Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.\n");
            }
        }
    }

    private void processSearchByName() {
        System.out.print("Enter player name: ");
        String name = scanner.nextLine();
        team.displayPlayers(team.searchByName(name));
    }

    private void processSearchByAgeRange() {
        System.out.print("Enter min age: ");
        int minAge = scanner.nextInt();
        System.out.print("Enter max age: ");
        int maxAge = scanner.nextInt();
        scanner.nextLine();
        team.displayPlayers(team.searchByAgeRange(minAge, maxAge));
    }

    private void processAddPlayer() {
        System.out.print("Enter player ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter player name: ");
        String name = scanner.nextLine();

        System.out.print("Enter position: ");
        String position = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Enter goals scored: ");
        int goals = scanner.nextInt();

        System.out.print("Enter assists: ");
        int assists = scanner.nextInt();

        System.out.print("Enter contract expiry date (yyyy-mm-dd): ");
        scanner.nextLine();
        LocalDate contractExpiry = LocalDate.parse(scanner.nextLine());

        team.addPlayer(new Player(id, name, position, age, goals, assists, contractExpiry));
        System.out.println("Player added successfully!");
    }

    private void processRemovePlayer() {
        System.out.print("Enter player ID to remove: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        team.removePlayer(id);
        System.out.println("Player removed successfully!");
    }

    private void processContractTransaction() {
        System.out.print("Enter player ID: ");
        int playerId = scanner.nextInt();
        scanner.nextLine();

        Player player = null;
        for (Player p : team.getAllPlayers()) {
            if (p.getId() == playerId) {
                player = p;
                break;
            }
        }

        if (player == null) {
            System.out.println("Player not found.");
            return;
        }

        System.out.print("Enter destination club: ");
        String destinationClub = scanner.nextLine();

        System.out.print("Is this a Transfer or Loan? (T/L): ");
        String type = scanner.nextLine().trim().toUpperCase();

        PlayerContract contract = null;

        if (type.equals("T")) {
            System.out.print("Enter transfer fee: ");
            double fee = scanner.nextDouble();
            scanner.nextLine();
            contract = new TransferContract(LocalDate.now(), player, destinationClub, fee);
        } else if (type.equals("L")) {
            System.out.print("Enter loan duration (months): ");
            int months = scanner.nextInt();
            System.out.print("Enter loan fee: ");
            double loanFee = scanner.nextDouble();
            System.out.print("Enter optional buy fee: ");
            double buyFee = scanner.nextDouble();
            scanner.nextLine();
            contract = new LoanContract(LocalDate.now(), player, destinationClub, months, loanFee, buyFee);
        } else {
            System.out.println("Invalid type.");
            return;
        }

        new ContractFileManager().saveContract(contract);
        team.removePlayer(playerId);
        System.out.println("Contract saved and player removed from roster.");
    }
}
