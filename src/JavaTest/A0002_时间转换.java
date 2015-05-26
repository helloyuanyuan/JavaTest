package JavaTest;

import java.util.Scanner;

public class A0002_时间转换 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int bjt;

		System.out.print("请输入要转换的BJT时间：");

		bjt = in.nextInt();

		int bjtHour = bjt / 100;
		int bjtMinute = bjt % 100;

		if (bjtHour > 23) 
		{
			System.err.println("您输入的hour有误！");
		} 
		
		else if (bjtMinute > 59) 
		{
			System.err.println("您输入的minute有误！");
		} 
		
		else 
		{
			if (bjtHour < 10) 
			{
				if (bjtMinute < 10) 
				{
					System.out.println("您输入的BJT时间是： 0" + bjtHour + ":0" + bjtMinute);
				} 
				
				else 
				{
					System.out.println("您输入的BJT时间是： 0" + bjtHour + ":" + bjtMinute);
				}
			}
			
			else 
			{
				if (bjtMinute < 10) 
				{
					System.out.println("您输入的BJT时间是： " + bjtHour + ":0" + bjtMinute);
				} 
				
				else 
				{
					System.out.println("您输入的BJT时间是： " + bjtHour + ":" + bjtMinute);
				}
			}

			System.out.println("将输入的BJT时间转换为UTC时间.........");

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
					System.out.println("UTC时间是： 0" + utcHour + ":0" + utcMinute);
				} 
				
				else 
				{
					System.out.println("UTC时间是： 0" + utcHour + ":" + utcMinute);
				}

			}
			
			else 
			{
				if (utcMinute < 10) 
				{
					System.out.println("UTC时间是： " + utcHour + ":0" + utcMinute);
				} 
				
				else 
				{
					System.out.println("UTC时间是： " + utcHour + ":" + utcMinute);
				}
			}
		}

	}

}
