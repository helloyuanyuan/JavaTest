package JavaTest;

import java.util.Scanner;

public class �¶�ת�� {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		System.out.print("��������Ҫת���Ļ����¶ȡ�F�� ");
		int f = in.nextInt();
		System.out.print("ת���������¶ȡ�C = " + (int) ((f - 32) / (9.0 / 5.0)));
		// 1.��F = (9/5)*��C + 32
		// 2. c = (f-32)/9/5

	}

}
