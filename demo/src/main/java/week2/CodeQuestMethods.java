package week2;

import java.util.Scanner;

public class CodeQuestMethods {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1 Intro
        System.out.println("🌟 Welcome to Code Quest – Return of the Methods! 🌟");
        System.out.print("Enter your name, brave adventurer: ");
        String name = scanner.nextLine();
        String titledName = getPlayerTitle(name); // Method 1
        System.out.println("Welcome, " + titledName + "!");

        //2 XP Section
        System.out.print("Enter your current XP: ");
        int xp = scanner.nextInt();
        int doubledXP = doubleXP(xp); // Method 2
        System.out.println("Your XP: " + xp);
        System.out.println("Doubled XP: " + doubledXP);

        //3 Level Up
        int threshold = 100;
        if (hasLeveledUp(xp, threshold)) {
            System.out.println("🎉 You leveled up!");
        } else {
            System.out.println("💪 Keep grinding...");
        }

        //4 Dice Rolls
        System.out.println("\n🎲 Rolling the dice...");
        System.out.println("Roll 1: " + rollDice());
        System.out.println("Roll 2: " + rollDice());
        System.out.println("Roll 3: " + rollDice());

        //5 Damage Calculation
        int strength = 12;
        int enemyDefense = 18;
        int damage = calculateDamage(strength, enemyDefense);
        System.out.println("\n🗡️ You dealt " + damage + " damage!");

        //6 Chest Check
        System.out.println("\n🔐 Chest Scenarios:");
        System.out.println("Key = true, Broken = true: " + canOpenChest(true, true));
        System.out.println("Key = true, Broken = false: " + canOpenChest(true, false));
        System.out.println("Key = false, Broken = true: " + canOpenChest(false, true));
        System.out.println("Key = false, Broken = false: " + canOpenChest(false, false));

        // Choose a class
        System.out.print("\nChoose your class (1 = Warrior, 2 = Mage, 3 = Rogue): ");
        int classChoice = scanner.nextInt();
        String playerClass = getPlayerClass(classChoice);
        System.out.println("🧝 You are now a mighty " + playerClass + "!");

        // Gold Loot
        int currentGold = 200;
        int goldFound = 150;
        int totalGold = addGold(currentGold, goldFound);
        System.out.println("💰 After looting, you now have " + totalGold + " gold!");

        // Quest Completion
        int tasksDone = 3;
        int totalTasks = 3;
        if (isQuestComplete(tasksDone, totalTasks)) {
            System.out.println("✅ Quest complete!");
        } else {
            System.out.println("⏳ You still have work to do.");
        }

        // Boss Fight
        int playerHP = 10;
        int bossHP = 50;
        boolean usedPotion = true;
        boolean bossDefeated = isBossDefeated(playerHP, bossHP, usedPotion);
        System.out.println(bossDefeated ? "🏆 Boss defeated!" : "💀 You were defeated...");

        // 🎉 Outro
        System.out.println("\n🌟 The journey of " + titledName + " the " + playerClass + " has come to an end... for now.");

        scanner.close();
    }

    // 1
    public static String getPlayerTitle(String name) {
        return "King " + name;
    }

    // 2
    public static int doubleXP(int xp) {
        return xp * 2;
    }

    // 3
    public static boolean hasLeveledUp(int currentXP, int threshold) {
        return currentXP >= threshold;
    }

    // 4
    public static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }

    // 5
    public static int calculateDamage(int strength, int enemyDefense) {
        int result = (strength * 2) - enemyDefense;
        return Math.max(result, 0);
    }

    // 6
    public static boolean canOpenChest(boolean hasKey, boolean lockIsBroken) {
        return hasKey || lockIsBroken;
    }

    // 7
    public static String getPlayerClass(int choice) {
        switch (choice) {
            case 1:
                return "Warrior";
            case 2:
                return "Mage";
            case 3:
                return "Rogue";
            default:
                return "Peasant";
        }
    }

    // 8
    public static int addGold(int currentGold, int goldFound) {
        if (goldFound > 100) {
            goldFound -= goldFound * 0.10; // 10% tax
        }
        return currentGold + goldFound;
    }

    // 9
    public static boolean isQuestComplete(int tasksDone, int totalTasks) {
        return tasksDone == totalTasks;
    }

    // 10
    public static boolean isBossDefeated(int playerHP, int bossHP, boolean usedPotion) {
        if (bossHP <= 0) return true;
        if (playerHP <= 0 && !usedPotion) return false;
        if (usedPotion) playerHP += 50;
        return playerHP > bossHP;
    }
}
