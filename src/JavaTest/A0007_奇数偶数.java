package JavaTest;

import java.util.Scanner;

public class A0007_奇数偶数 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int number;
		int check = 0;
		int countJ = 0;
		int countO = 0;

		do {
			System.out.println("请输入：");
			number = in.nextInt();
			if (number > 100000) {
				System.err.println("请不要输入大于100000的数！");
			} else if (number < -1) {
				System.err.println("请不要输入小于0的数！");
			} else {
				check = number % 2;
				if (check == 1) {
					countJ++;
				} else if (check == 0) {
					countO++;
				}
			}

		} while (number != -1);

		System.out.println("奇数 = " + countJ + "; 偶数 = " + countO + ";");
	}

}
