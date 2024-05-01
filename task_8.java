package MoamenHamdan;

import java.util.Random;

public class task_8 {

	public static void main(String[] args) {
		Random random = new Random();

		int FirstOne = random.nextInt(6) + 1;

		int SecondOne = random.nextInt(6) + 1;

		System.out.println("First die: " + FirstOne);
		System.out.println("Second die: " + SecondOne);
		System.out.println("Total: " + (FirstOne + SecondOne));
	}
}
