package week1;

public class CodeQuestExercise {

        public static void main(String[] args) {
            printWelcome();
            displayPlayerName("Ridwan");
            showLevel(1);
        }

        public static void printWelcome() {
            System.out.println("Welcome to Code Quest!");
        }

        public static void displayPlayerName(String name) {
            System.out.println("Player joined: " + name);
        }

        public static void showLevel(int level) {
            System.out.println("Level: " + level);
        }
    }


