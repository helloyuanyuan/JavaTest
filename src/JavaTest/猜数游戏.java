package JavaTest;

import java.util.Scanner;

public class 猜数游戏 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int number = (int)(Math.random()*100+1);
		int input;
		int count = 0;
		
		System.out.println("请输 0 ~ 100 间入您要猜的数！");
		
		do {
			input = in.nextInt();
			count++;
			if (input>number) {
				System.out.println("偏大！");
			}else if (input<number) {
				System.out.println("偏小！");
			}
		} while(input!=number);
		
		System.out.println("恭喜你猜对了！您总共猜了： "+count+"次。");
		
	}

}
