package JavaTest;

import java.util.Scanner;

public class 统计位数 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.print("请输入一个数： ");
		
		int number = in.nextInt();
		int count = 0;
		
		do {
			number = number/10;
			count++;
		} while (number>0);
		
		System.out.println("您输入的数位数是： " + count);

	}

}
