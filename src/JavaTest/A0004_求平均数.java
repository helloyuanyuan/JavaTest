package JavaTest;

import java.util.Scanner;

public class A0004_��ƽ���� {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int number;
		int sum = 0;
		int count = 0;

		System.out.println("�����룺");
		number = in.nextInt();
		
		while (number != -1) {
			sum += number;
			count++;
			number = in.nextInt();
		}

		System.out.println("sum = " + sum + "; count = " + count + "; avg = " + (sum / (count*1.0)) + ";");
	}

}
