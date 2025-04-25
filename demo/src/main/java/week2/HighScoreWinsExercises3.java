package week2;
import  java.util.Scanner;
public class HighScoreWinsExercises3 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a gqme score:");
        String input = scanner.nextLine().trim();  // // Example: Home:Visitor|21:9


            //Home:Visitor" and "21:9"
        String[] parts = input.split("\\|");
        String teams = parts[0];
        String scores = parts[1];

        // Split teams and scores
        String[] teamName = teams.split(":");
        String homeTeam = teamName[0];
        String visitorTeam = teamName[1];

        String[] scoreValues = scores.split(":");
        int homeScore = Integer.parseInt(scoreValues[0]);
        int visitorScore = Integer.parseInt(scoreValues[1]);


        String winner;
        if (homeScore > visitorScore){
            winner = homeTeam;

        } else if (visitorScore > homeScore) {
            winner = visitorTeam;
        }else {
          winner =  "i dont know;";
        }

        System.out.println("winner" + winner);

        scanner.close();
    }


}
