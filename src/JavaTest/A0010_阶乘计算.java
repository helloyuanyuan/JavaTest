package JavaTest;

import java.util.Scanner;

public class A0010_�׳˼��� {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		while (true) {
			long n = 1;
			int input;

			System.out.print("������һ���������ǽ�������׳ˣ�");
			input = in.nextInt();

			for (int i = 1; i <= input; i++) {
				n *= i;
			}

			System.out.println(input + "�Ľ׳��ǣ�" + n);
		}

	}

}
