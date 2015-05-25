package JavaTest;

import java.util.Scanner;

public class 自动售票 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int station = 0;
		int price = 0;
		int count = 1;
		String stationName = null;

		while (price == 0) {
			System.out.println("您好，您是今天的第" + count + "位乘客，请选择您要去的站点： ");
			System.out.println("第一站：环球中心 - 1；");
			System.out.println("第二站：天府广场 - 2；");
			System.out.println("第三站：春  熙  路 - 3；");
			System.out.print("请输入： ");

			station = in.nextInt();

			switch (station) {
			case 1:
				price = 1;
				stationName = "环球中心";
				break;
			case 2:
				price = 2;
				stationName = "天府广场";
				break;
			case 3:
				price = 3;
				stationName = "春  熙  路";
				break;
			default:
				price = 0;
				System.err.println("您输入的站点有误，请重新输入！");
				break;
			}

			if (price > 0) {
				System.out.println("您要去: " + stationName + "， 票价是： " + price + "元。");

				int banlance = 0;

				while (banlance < price) {
					System.out.print("请投币: ");
					int amount = in.nextInt();
					banlance += amount;
					if (banlance >= price) {
						int change = banlance - price;
						System.out.println("您投入了： " + banlance + "元，应找零： " + change + "元。");
						System.out.println("请拿好您的车票请勿遗失！");
						System.out.println("**************************");
						System.out.println("*       站名：" + stationName + " 站" + "                *");
						System.out.println("*       票价：" + price + " 元" + "                           *");
						System.out.println("**************************");
						System.out.println("找零： " + change + "元。");
						System.out.println("——————————————————————————————————————————————————————————————————————");
					} else {
						System.out.println("您投入的金额是： " + banlance + "元，还应投入： " + (price - banlance) + "元。");
					}

				}
				banlance = 0;
				price = 0;
				count++;
			}
		}

	}

}
