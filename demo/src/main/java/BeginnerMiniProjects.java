import java.util.Scanner;

public class BeginnerMiniProjects {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Show menu
        System.out.println("Welcome to Beginner Java Mini Projects!");
        System.out.println("Choose an option (1-8):");
        System.out.println("1. Say Hello");
        System.out.println("2. Age in Dog Years");
        System.out.println("3. Dice Roll");
        System.out.println("4. Hero Stats");
        System.out.println("5. Level Up!");
        System.out.println("6. Coin Calculator");
        System.out.println("7. Odd or Even Dice");
        System.out.println("8. Critical Hit Chance");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.println();

        switch (choice) {
            case 1:
                // Say Hello
                System.out.print("Enter your name: ");
                String name = scanner.nextLine();
                System.out.println("Hello, " + name + "! Welcome to the game.");
                break;

            case 2:
                // Age in Dog Years
                System.out.print("Enter your age: ");
                int age = scanner.nextInt();
                int dogYears = age * 7;
                System.out.println("Your age in dog years is: " + dogYears);
                break;

            case 3:
                // Dice Roll
                int roll = (int)(Math.random() * 6) + 1;
                System.out.println("You rolled a " + roll + "!");
                break;

            case 4:
                // Hero Stats
                System.out.print("Enter your hero's name: ");
                String heroName = scanner.nextLine();
                System.out.print("Enter strength: ");
                int strength = scanner.nextInt();
                System.out.print("Enter agility: ");
                int agility = scanner.nextInt();
                System.out.println("Hero: " + heroName + " | Strength: " + strength + " | Agility: " + agility);
                break;

            case 5:
                // Level Up
                System.out.print("Enter your current level: ");
                int level = scanner.nextInt();
                level++;
                System.out.println("You leveled up! You are now level " + level);
                break;

            case 6:
                // Coin Calculator
                System.out.print("How many gold coins did you find? ");
                int gold = scanner.nextInt();
                System.out.print("How many silver coins did you find? ");
                int silver = scanner.nextInt();
                int score = gold * 10 + silver;
                System.out.println("Your total score is: " + score);
                break;

            case 7:
                // Odd or Even Dice
                int dice = (int)(Math.random() * 6) + 1;
                System.out.println("You rolled a " + dice);
                if (dice % 2 == 0) {
                    System.out.println("It's even!");
                } else {
                    System.out.println("It's odd!");
                }
                break;

            case 8:
                // Critical Hit Chance
                System.out.print("Enter your luck stat (0-100): ");
                int luck = scanner.nextInt();
                if (luck > 50) {
                    System.out.println("Critical Hit!");
                } else {
                    System.out.println("Normal Hit.");
                }
                break;

            default:
                System.out.println("Invalid choice. Please run the program again.");
                break;
        }

        // Close scanner after switch block
        scanner.close();
    }
}
