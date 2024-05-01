package MoamenHamdan;

import java.util.Random;
import java.util.Scanner;

public class task_2 {

	public static void main(String[] args) {
		Scanner moe = new Scanner(System.in);
		Random random = new Random();
		System.out.println("Welcome to the Number Guessing Game!");
		int randomNumber = random.nextInt(100) + 1;
		System.out.println("Enter the max Attempts , if you exceed it you will lose ");
		int maxAttempts = moe.nextInt();

		System.out.println("I've selected a number between 1 and 100. Can you guess it?");
		System.out.println("You have " + maxAttempts + " attempts.");

		int attempts = 0;
		boolean guessedCorrectly = false;

		while (attempts < maxAttempts && !guessedCorrectly) {
			System.out.print("Enter your guess: ");
			int userGuess = moe.nextInt();
			attempts++;

			if (userGuess == randomNumber) {
				System.out.println("\u001B[34mCongratulations! You guessed the number " + randomNumber
						+ " correctly in " + attempts + " attempts!\u001B[0m"); // Blue color code
				guessedCorrectly = true;
			} else if (userGuess < randomNumber) {
				System.out.println("Too low! Try again.");
			} else {
				System.out.println("Too high! Try again.");
			}

			if (!guessedCorrectly && attempts < maxAttempts) {
				System.out.println("----------------------------------");
			}
		}

		if (!guessedCorrectly) {
			System.out.println(
					"Sorry, you have exceeded the maximum number of attempts. The correct number was: " + randomNumber);
		}

		moe.close();
	}
}
