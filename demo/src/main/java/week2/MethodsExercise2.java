package week2;


public class MethodsExercise2 {
    //step1
    public static String getPlayerTitle  (String  name) {
        return "king" + name;

    }
        //step2
    public static int doubleXP(int xp) {
        return xp * 2;
    }
    //step1
    public static void main(String[] args) {
        String title = getPlayerTitle("Ridwan");
        System.out.println("welcome, " + title);

        //step2
        int xp = 100;
        int doubled = doubleXP(xp);
        System.out.println("Original XP: " + xp + ", Doubled XP: " + doubled);

    }
}



