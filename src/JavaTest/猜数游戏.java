package JavaTest;

import java.util.Scanner;

public class ������Ϸ {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int number = (int)(Math.random()*100+1);
		int input;
		int count = 0;
		
		System.out.println("���� 0 ~ 100 ������Ҫ�µ�����");
		
		do {
			input = in.nextInt();
			count++;
			if (input>number) {
				System.out.println("ƫ��");
			}else if (input<number) {
				System.out.println("ƫС��");
			}
		} while(input!=number);
		
		System.out.println("��ϲ��¶��ˣ����ܹ����ˣ� "+count+"�Ρ�");
		
	}

}
