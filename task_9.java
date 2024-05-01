package MoamenHamdan;

import java.security.SecureRandom;
import java.util.Scanner;

public class task_9 {

	private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
	private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String DIGITS = "0123456789";
	private static final String SPECIAL = "!@#$%^&*()_+{}[]~-";

	public static void main(String[] args) {
		Scanner moe = new Scanner(System.in);

		System.out.print("Enter password length: ");
		int len = moe.nextInt();

		System.out.println("Include the following character sets:");
		System.out.print("Lowercase letters (y/n): ");
		boolean lower = moe.next().equalsIgnoreCase("y");
		System.out.print("Uppercase letters (y/n): ");
		boolean upper = moe.next().equalsIgnoreCase("y");
		System.out.print("Digits (y/n): ");
		boolean digits = moe.next().equalsIgnoreCase("y");
		System.out.print("Special characters (y/n): ");
		boolean special = moe.next().equalsIgnoreCase("y");

		String password = generatePassword(len, lower, upper, digits, special);
		System.out.println("Generated Password: " + password);

		moe.close();
	}

	static String generatePassword(int length, boolean lower, boolean upper, boolean digits, boolean special) {
		StringBuilder password = new StringBuilder(length);
		SecureRandom random = new SecureRandom();
		String chars = "";

		if (lower) {
			chars += LOWER;
		}
		if (upper) {
			chars += UPPER;
		}
		if (digits) {
			chars += DIGITS;
		}
		if (special) {
			chars += SPECIAL;
		}

		for (int i = 0; i < length; i++) {
			int randomIndex = random.nextInt(chars.length());
			password.append(chars.charAt(randomIndex));
		}

		return password.toString();
	}
}
