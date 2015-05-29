package JavaTest;

import java.util.Scanner;

public class A0004_求平均数 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int input;
		int[] number = new int[100];
		int sum = 0;
		int count = 0;
		double avg;

		System.out.println("请输入：");
		input = in.nextInt();

		while (input != -1) {
			number[count] = input;
			sum += input;
			count++;
			input = in.nextInt();
		}

		avg = sum / (count * 1.0);

		if (count > 0) {

			for (int i = 0; i < count; i++) {
				if (number[i] > avg) {
					System.out.println(number[i]);
				}
			}

			System.out.println("sum = " + sum + "; count = " + count + "; avg = " + avg + ";");
		}

	}

}
