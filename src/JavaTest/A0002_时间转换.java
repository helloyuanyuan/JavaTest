package JavaTest;

import java.util.Scanner;

public class A0002_ʱ��ת�� {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int bjt;

		System.out.print("������Ҫת����BJTʱ�䣺");

		bjt = in.nextInt();

		int bjtHour = bjt / 100;
		int bjtMinute = bjt % 100;

		if (bjtHour > 23) 
		{
			System.err.println("�������hour����");
		} 
		
		else if (bjtMinute > 59) 
		{
			System.err.println("�������minute����");
		} 
		
		else 
		{
			if (bjtHour < 10) 
			{
				if (bjtMinute < 10) 
				{
					System.out.println("�������BJTʱ���ǣ� 0" + bjtHour + ":0" + bjtMinute);
				} 
				
				else 
				{
					System.out.println("�������BJTʱ���ǣ� 0" + bjtHour + ":" + bjtMinute);
				}
			}
			
			else 
			{
				if (bjtMinute < 10) 
				{
					System.out.println("�������BJTʱ���ǣ� " + bjtHour + ":0" + bjtMinute);
				} 
				
				else 
				{
					System.out.println("�������BJTʱ���ǣ� " + bjtHour + ":" + bjtMinute);
				}
			}

			System.out.println("�������BJTʱ��ת��ΪUTCʱ��.........");

			int utcHour = bjtHour - 8;
			int utcMinute = bjtMinute;

			if (utcHour < 0) 
			{
				utcHour += 24;
			}

			if (utcHour < 10) 
			{

				if (utcMinute < 10) 
				{
					System.out.println("UTCʱ���ǣ� 0" + utcHour + ":0" + utcMinute);
				} 
				
				else 
				{
					System.out.println("UTCʱ���ǣ� 0" + utcHour + ":" + utcMinute);
				}

			}
			
			else 
			{
				if (utcMinute < 10) 
				{
					System.out.println("UTCʱ���ǣ� " + utcHour + ":0" + utcMinute);
				} 
				
				else 
				{
					System.out.println("UTCʱ���ǣ� " + utcHour + ":" + utcMinute);
				}
			}
		}

	}

}
