package JavaTest;

import java.util.Scanner;

public class guess {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int number = (int) (Math.random() * 100 + 1);
		int guess;
		int count = 0;

		System.out.println("Please input a number: ");

		do {
			guess = in.nextInt();
			count++;

			if (guess < number) {
				System.out.println("less");
			} else if (guess > number) {
				System.out.println("greater");
			}
		} while (number != guess);

		System.out.println("Bingo! The number is: " + number + ". Spent " + count + " times.");

	}

}
