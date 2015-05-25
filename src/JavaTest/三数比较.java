package JavaTest;

import java.util.Scanner;

public class 三数比较 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		System.out.print("第一个数 - x： ");
		int x = in.nextInt();
		System.out.print("第二个数 - y： ");
		int y = in.nextInt();
		System.out.print("第三个数 - z： ");
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
				System.out.println("最大的数是 - x：" + x);
			}else {
				System.out.println("最大的数是 - z：" + z);
			}
		}else {
			if (y>z) {
				System.out.println("最大的数是 - y：" + y);
			}else {
				System.out.println("最大的数是 - z：" + z);
			}
		}

	}

}
