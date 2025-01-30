import java.util.Scanner;

public class QuizApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] questions = {
                "1. What is the capital of France?",
                "2. Who developed the Java programming language?",
                "3. Which planet is known as the Red Planet?",
                "4. What is the largest ocean on Earth?",
                "5. What is the square root of 64?"
        };
        String[][] options = {
                { "a) Berlin", "b) Madrid", "c) Paris", "d) Rome" },
                { "a) Dennis Ritchie", "b) James Gosling", "c) Guido van Rossum", "d) Bjarne Stroustrup" },
                { "a) Venus", "b) Mars", "c) Jupiter", "d) Saturn" },
                { "a) Atlantic Ocean", "b) Indian Ocean", "c) Arctic Ocean", "d) Pacific Ocean" },
                { "a) 6", "b) 7", "c) 8", "d) 9" }
        };
        char[] answers = { 'c', 'b', 'b', 'd', 'c' };
        int score = 0;
        System.out.println("Welcome to the Quiz Application!");
        System.out.println("Answer the following questions by entering the letter of your choice (a, b, c, or d).");
        System.out.println("------------------------------------------------------");
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Your answer: ");
            char userAnswer = scanner.nextLine().toLowerCase().charAt(0);
            if (userAnswer == answers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! The correct answer is " + answers[i] + ".\n");
            }
        }
        System.out.println("------------------------------------------------------");
        System.out.println("Quiz finished! Your final score is: " + score + "/" + questions.length);
        if (score == questions.length) {
            System.out.println("Excellent! You got all the answers right!");
        } else if (score >= questions.length / 2) {
            System.out.println("Good job! You passed the quiz.");
        } else {
            System.out.println("Better luck next time!");
        }
        scanner.close();
    }
}