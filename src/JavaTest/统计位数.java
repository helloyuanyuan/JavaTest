package JavaTest;

import java.util.Scanner;

public class ͳ��λ�� {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.print("������һ������ ");
		
		int number = in.nextInt();
		int count = 0;
		
		do {
			number = number/10;
			count++;
		} while (number>0);
		
		System.out.println("���������λ���ǣ� " + count);

	}

}
