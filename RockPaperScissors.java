import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        Random random = new Random();

        String[] options = { "Rock", "Paper", "Scissors" };
        System.out.println("Welcome to Rock-Paper-Scissors!");
        System.out.println("Enter your choice (Rock, Paper, or Scissors): ");

        String userChoice = Sc.nextLine().trim().toLowerCase();
        int computerIndex = random.nextInt(3);
        String computerChoice = options[computerIndex].toLowerCase();

        System.out.println("You chose: " + capitalize(userChoice));
        System.out.println("Computer chose: " + capitalize(computerChoice));

        if (userChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (userChoice.equals("scissors") && computerChoice.equals("paper")) ||
                (userChoice.equals("paper") && computerChoice.equals("rock"))) {
            System.out.println("You win!");
        } else if ((computerChoice.equals("rock") && userChoice.equals("scissors")) ||
                (computerChoice.equals("scissors") && userChoice.equals("paper")) ||
                (computerChoice.equals("paper") && userChoice.equals("rock"))) {
            System.out.println("Computer wins!");
        } else {
            System.out.println("Invalid input. Please enter Rock, Paper, or Scissors.");
        }
    }

    public static String capitalize(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        return input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
    }
}

