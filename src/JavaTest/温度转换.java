package JavaTest;

import java.util.Scanner;

public class 温度转换 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		System.out.print("请输入需要转换的华氏温度°F： ");
		int f = in.nextInt();
		System.out.print("转换成摄氏温度°C = " + (int) ((f - 32) / (9.0 / 5.0)));
		// 1.°F = (9/5)*°C + 32
		// 2. c = (f-32)/9/5

	}

}
