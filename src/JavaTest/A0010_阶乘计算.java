package JavaTest;

import java.util.Scanner;

public class A0010_阶乘计算 {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		while (true) {
			long n = 1;
			int input;

			System.out.print("请输入一个数，我们将计算其阶乘：");
			input = in.nextInt();

			for (int i = 1; i <= input; i++) {
				n *= i;
			}

			System.out.println(input + "的阶乘是：" + n);
		}

	}

}
