package JavaTest;

import java.util.Scanner;

public class �����Ƚ� {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		System.out.print("��һ���� - x�� ");
		int x = in.nextInt();
		System.out.print("�ڶ����� - y�� ");
		int y = in.nextInt();
		System.out.print("�������� - z�� ");
		int z = in.nextInt();
		
//		int max;
//		
//		if (x>y) {
//			max=x;
//		}else {
//			max=y;
//		}
//		
//		if (max<z) {
//			max=z;
//		}
		
		if (x>y) {
			if (x>z) {
				System.out.println("�������� - x��" + x);
			}else {
				System.out.println("�������� - z��" + z);
			}
		}else {
			if (y>z) {
				System.out.println("�������� - y��" + y);
			}else {
				System.out.println("�������� - z��" + z);
			}
		}

	}

}
