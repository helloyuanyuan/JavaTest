package JavaTest;

import java.util.Scanner;

public class A0007_����ż�� {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int number;
		int check = 0;
		int countJ = 0;
		int countO = 0;

		do {
			System.out.println("�����룺");
			number = in.nextInt();
			if (number > 100000) {
				System.err.println("�벻Ҫ�������100000������");
			} else if (number < -1) {
				System.err.println("�벻Ҫ����С��0������");
			} else {
				check = number % 2;
				if (check == 1) {
					countJ++;
				} else if (check == 0) {
					countO++;
				}
			}

		} while (number != -1);

		System.out.println("���� = " + countJ + "; ż�� = " + countO + ";");
	}

}
