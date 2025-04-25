package Week3;
import java.util.Scanner;
public class FlashcardQuiz {
    public static void main(String[] args) {

                // Array of quiz questions
        String[] question = {
                "What is the capital of France?",
                "What is 5 + 7?",
                "What programming language are we learning?",
                "What is the square root of 81?",
                "What does OOP stand for?"
        };

            //Matching array of answers (same index as questions
        String[] answers = {
                "Paris",
                "12",
                "Java",
                "9",
                "Object Oriented Programming"
        };
        Scanner scanner= new Scanner(System.in);
        int score = 0;

            // Loop through each question
        for (int i = 0; i < question.length; i++){
            System.out.println("\n" + question[i]);
            String userAnswer = scanner.nextLine();

                // Check if the answer is correct (case-insensitive

            if (userAnswer.equalsIgnoreCase(answers[i])){
                System.out.println("Correct!");
                score++;
            }else {
                System.out.println("Incorrect. The correct answer was:");
            }
        }


        System.out.println("\nQuiz Complete!");
        System.out.println("You got" + score + "out of " + question.length + "correct.");
        System.out.println("Score" + (score * 100/ question.length) + "%");

        scanner.close();
    }

}
