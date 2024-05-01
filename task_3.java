package MoamenHamdan;

import java.util.Random;
import java.util.Scanner;

public class task_3 {

    public static void main(String[] args) {
        Scanner moe = new Scanner(System.in);
        Random random = new Random();

        String[] options = {"rock", "paper", "scissors"};

        String userChoice;
        do {
            System.out.println("Let's play Rock, Paper, Scissors!");
            System.out.print("Enter your choice (rock, paper, or scissors): ");
            userChoice = moe.nextLine().toLowerCase();

            if (!isValidChoice(userChoice)) {
                System.out.print("\u001B[32mInvalid choice. "); // Green color code
                System.out.println("Please enter 'rock', 'paper', or 'scissors'.\u001B[0m"); // Reset color code to default (black)
            }
        } while (!isValidChoice(userChoice));

        String computerChoice = options[random.nextInt(options.length)];

        System.out.println("Your choice: " + userChoice);
        System.out.println("Computer's choice: " + computerChoice);

        String result = determineWinner(userChoice, computerChoice);

        // Set color based on result
        if (result.equals("Congratulations! You win!")) {
            System.out.println("\u001B[34m" + result); // Blue color code
        } else if (result.equals("Sorry! Computer wins!")) {
            System.out.println("\u001B[31m" + result); // Red color code
        } else {
            System.out.println(result);
        }

        moe.close();
    }

    static boolean isValidChoice(String choice) {
        return choice.equals("rock") || choice.equals("paper") || choice.equals("scissors");
    }

    static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "It's a tie!";
        } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
            return "Congratulations! You win!";
        } else {
            return "Sorry! Computer wins!";
        }
    }
}
